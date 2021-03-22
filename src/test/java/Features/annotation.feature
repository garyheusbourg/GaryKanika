#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  @tag1
   Scenario: Automate below cucumber scenario 16 - 
 #   Given When I am in OrangeHRP Application
#    Then Login to Application 
#    When Dashboard page is available 
#    And click on Admin menu
   Given When I click on Dashboard Link
   Then click on Admin menu
    
 @tag2
   Scenario: Automate below cucumber scenario 17
    Background I am logged into Orange Application
    Given When I click on Admin Link
    Then Click on Job
    And Validate test - Job Title
    
  @tag3
   Scenario: Automate below cucumber scenario 18-A 
   Given When I click on Dashboard Link
   Then click on Admin menu
   And Get Admin Title 
  
   @tag4
   Scenario: Automate below cucumber scenario 18-B 
   Given When I click on Dashboard Link
   Then Click on PIM Link
   And Get PIM Title
   
   @tag5
   Scenario: Automate below cucumber scenario 18-C 
   Given When I click on Dashboard Link 
   Then Click on Directory Link
    And Get Directory Title
   
   @tag6
   Scenario: Automate below cucumber scenario 18-D 
   Given When I click on Dashboard Link 
   Then Click on Maintenance Link
   And Get Maintenance Title
   
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
