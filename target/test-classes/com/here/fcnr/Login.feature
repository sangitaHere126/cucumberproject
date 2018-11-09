
@Login
Feature: Logging into Rediff Money

  @LoginToRediffMoney
  Scenario Outline: Logging into rediff
    Given I open <Browser>
    And I go to https://portfolio.rediff.com/portfolio-login
    And I login inside application
    |Username|ashishthakur1983|
    |Password|pass@1234|
    
   Examples:
   |Browser|
   |Chrome|
   |Mozilla|
  
   