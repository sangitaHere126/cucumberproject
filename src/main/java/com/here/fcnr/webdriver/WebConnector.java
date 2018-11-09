package com.here.fcnr.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;


import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


import org.openqa.selenium.remote.RemoteWebDriver;


import com.here.fcnr.reports.ExtentManager;

public class WebConnector {
	WebDriver driver;
	public String name;
	public Properties prop;
	public ExtentReports rep;
	public ExtentTest scenario;
	
	public WebConnector(){
		//name="A";
		prop= new Properties();
		
		try {
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties");
			prop.load(fis);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

	public void openBrowser(String browserName){
		if(prop.getProperty("gridRun").equals("Y")) {
			// invoke browser through grid
			DesiredCapabilities cap=null;
			if(browserName.equals("Mozilla")) {
				cap = DesiredCapabilities.firefox();
				cap.setJavascriptEnabled(true);
				cap.setPlatform(Platform.WINDOWS);
			}else if(browserName.equals("Chrome")) {
				cap = DesiredCapabilities.chrome();
				cap.setJavascriptEnabled(true);
				cap.setPlatform(Platform.WINDOWS);
			}
			
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4455/wd/hub"), cap);
			}catch(MalformedURLException ex){
				ex.printStackTrace();
			}
		} else{			
		if (browserName.equals("Mozilla")){
			System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
			
		else if (browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
		  //  co.addArguments("disable-infobars");
		    co.addArguments("headless")	;
		    co.addArguments("window-size=1400,600");
			driver=new ChromeDriver();
			
		}
		else if (browserName.equals("IE"))
			driver=new InternetExplorerDriver();
		}	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public void navigate(String urlKey) throws InterruptedException{
		//driver.get(prop.getProperty(urlKey));
		driver.get(urlKey);
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='useremail']")));
	}
	
	public void click(String objectKey){
		getObject(objectKey).click();
	}
	
	public void type(String data,String objectKey){
		
		WebDriverWait wait= new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='useremail']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(objectKey))));
		getObject(objectKey).sendKeys(data);
	}
	
	public void select(String objectKey,String data) {
		Select s= new Select(getObject(objectKey));
		//wait(5);
		s.selectByVisibleText(data);
		//wait(5);
	}
	

	public WebElement getObject(String objectKey){
		WebElement e=null;
		try{
			e=driver.findElement(By.xpath(prop.getProperty(objectKey)));
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(prop.getProperty(objectKey))));
			
		}catch(Exception ex){
			//reportFailure(ex.getMessage());
			reportFailure("Unable to extract object "+objectKey);
			ex.printStackTrace();
		}
		return e;
	}
	
	public void login(String username, String password) {
		type(username,"username");
		click("confirmEmail");
		type(password, "password");
		click("continue");
		validateLogin();
		//acceptAlertIfPresent();
		
	}
	public boolean isElementPresent(String objectKey){
		List <WebElement> e= null;
		e= driver.findElements(By.xpath(prop.getProperty(objectKey)));
		if (e.size()>=1)
			return true;
		else {
			reportFailure("Scenario failure");
			return false;
		}
	}
	
	public void validateLogin(){
		boolean result=isElementPresent("portfolioIdKey");
		if(result)
			System.out.println("login passed");
		else
			System.out.println("login failed");
	}
	
	public void acceptAlertIfPresent(){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			wait(5);
			driver.switchTo().defaultContent();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void clickAndWait(String xpathExpTarget, String xpathExpWait, int maxTime){
		for(int i=0; i<maxTime; i++){
			//click
			getObject(xpathExpTarget).click();
			//check presence of other element
			if(isElementPresent(xpathExpWait)&&driver.findElement(By.xpath(prop.getProperty(xpathExpWait))).isDisplayed())
				return;
			else
				wait(1);
		}
		// 10 seconds over - for loop - comes here
				reportFailure("Target element coming after clicking on "+xpathExpTarget );
	}
	
		public void wait(int time) {
			try {
				Thread.sleep(time*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void clear(String objectKey) {
			getObject(objectKey).clear();
		}
		
		public void waitForPageToLoad() {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			int i=0;
			while(i!=10){
				String state= (String)js.executeScript("return document.readyState");
				if(state.equals("complete"))
					break;
				else wait(2);
				i++;
			}
					// check for jquery status
			i=0;
			while(i!=10){
		
				Long d= (Long) js.executeScript("return jQuery.active;");
				System.out.println(d);
				if(d.longValue() == 0 )
				 	break;
				else
					 wait(2);
				 i++;
					
				}

		}

/***************Logging**************************/
	public void infoLog(String msg){
		scenario.log(Status.INFO, msg);
	}
	public void reportFailure(String errMsg){
		//fail in Extent
		scenario.log(Status.FAIL, errMsg);
		//take screenshot and put in reports
		//takeScreenShot();
		assertThat(false);
		//fail in cucumber using assertj
	}

	public void takeScreenShot(){
		//filename of screenshot
		Date d =new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ",  "_")+".png";
		//take screenshot
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+screenshotFile));
			scenario.log(Status.FAIL, "screenshot -> " +scenario.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screenshotFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/***************Reporting**************************/
	public void quit() {
		if(rep!=null)
			rep.flush();
		if(driver!=null)
			driver.quit();
			
	}
	
	public void initReports(String scenarioName){
		rep=ExtentManager.getInstance(prop.getProperty("reportPath"));
		scenario=rep.createTest(scenarioName);
		scenario.log(Status.INFO, "Starting "+scenarioName);	
	}


	
		
	}


	

	

