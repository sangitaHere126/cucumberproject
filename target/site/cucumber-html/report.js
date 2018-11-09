$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/here/fcnr/Login.feature");
formatter.feature({
  "name": "Logging into Rediff Money",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Logging into rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginToRediffMoney"
    }
  ]
});
formatter.step({
  "name": "I open \u003cBrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.step({
  "name": "I login inside application",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Username",
        "ashishthakur1983"
      ]
    },
    {
      "cells": [
        "Password",
        "pass@1234"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser"
      ]
    },
    {
      "cells": [
        "Chrome"
      ]
    },
    {
      "cells": [
        "Mozilla"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logging into rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginToRediffMoney"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login inside application",
  "rows": [
    {
      "cells": [
        "Username",
        "ashishthakur1983"
      ]
    },
    {
      "cells": [
        "Password",
        "pass@1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Logging into rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginToRediffMoney"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login inside application",
  "rows": [
    {
      "cells": [
        "Username",
        "ashishthakur1983"
      ]
    },
    {
      "cells": [
        "Password",
        "pass@1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/com/here/fcnr/Portfolio.feature");
formatter.feature({
  "name": "Portfolio operation",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Portfolio"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login inside application",
  "rows": [
    {
      "cells": [
        "Username",
        "sangita_barnwal"
      ]
    },
    {
      "cells": [
        "Password",
        "pacific"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a Portfolio",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Portfolio"
    },
    {
      "name": "@CreatePortfolio"
    }
  ]
});
formatter.step({
  "name": "I click createPortfolio_id and wait for portfolioName_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.clickAndWait(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clear portfolioName_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.clear(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type Port14 in portfolioName_id field",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.type(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on portFolioSubmit_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for page to load",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.waitForPageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login inside application",
  "rows": [
    {
      "cells": [
        "Username",
        "sangita_barnwal"
      ]
    },
    {
      "cells": [
        "Password",
        "pacific"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String,String\u003e)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //*[@id\u003d\u0027userpass\u0027] (tried for 50 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027DESKTOP-R2LHH53\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\mkmanish\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:54122}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.77, webStorageEnabled: true, webdriver.remote.sessionid: b7c981a54ec034b6f6c39b36d91...}\nSession ID: b7c981a54ec034b6f6c39b36d91e5c24\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.here.fcnr.webdriver.WebConnector.type(WebConnector.java:125)\r\n\tat com.here.fcnr.webdriver.WebConnector.login(WebConnector.java:155)\r\n\tat com.here.fcnr.steps.ApplicationSteps.login(ApplicationSteps.java:31)\r\n\tat ✽.I login inside application(src/test/resources/com/here/fcnr/Portfolio.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Deleting a portfolio",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Portfolio"
    },
    {
      "name": "@DeletePortfolio"
    }
  ]
});
formatter.step({
  "name": "I wait for page to load",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.waitForPageToLoad()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select Port14 from portfolioSelection_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.select(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on deletePortfolio_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.click(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I accept alert",
  "keyword": "When "
});
formatter.match({
  "location": "GenericSteps.iAcceptAlert()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});