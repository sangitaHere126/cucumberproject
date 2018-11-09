
@Portfolio
Feature: Portfolio operation
  I want to use this template for my feature file
  
  Background:
    Given I open Chrome
    And I go to https://portfolio.rediff.com/portfolio-login
    And I login inside application
    |Username|sangita_barnwal|
    |Password|pacific|
   

  @CreatePortfolio
  Scenario: Creating a Portfolio
    And I click createPortfolio_id and wait for portfolioName_id
    And I clear portfolioName_id
    And I type Port14 in portfolioName_id field
    And I click on portFolioSubmit_id
    And I wait for page to load

  @DeletePortfolio
  Scenario: Deleting a portfolio
  And I wait for page to load
  And I select Port14 from portfolioSelection_id
  And I click on deletePortfolio_id
  
  When I accept alert
 # Then Portfolio should be deleted
  
  
  
    