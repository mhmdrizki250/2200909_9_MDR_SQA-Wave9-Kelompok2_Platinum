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
@Searching
Feature: Searching

  @Positive
  Scenario: PROSEA001 - user should be able to searching product
	Given user launch browser and navigate to url "https://secondhand.binaracademy.org/"
	When click masuk
	When input emailSearching with "mhmdrizki250@gmail.com"
	When input passwordSearching with "Kiki123456789"
	Then click button masukSearching
	Then click button searching
	And close web 
	