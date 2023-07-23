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
@login @sign_In
Feature: Login

  @Positive
  Scenario: LG0001 - user should be able to login with using valid credential
	Given user launch browser and navigate to url "https://secondhand.binaracademy.org/"
	When click masuk
	And input email with "nurasiyah727@gmail.com"
	And input password with "pass.123"
	Then click button masuk2
	And close web 
	

	
  	 
	
	
	
	
