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
@register @registration
Feature: Register

  @positive
  Scenario: REG001 - As a user I should be able to register using corret data and acceptable data
  	Given user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	And user in registration page
  	When user input name with "Oktavia Dwi Putri P"
  	And user input email with "oktaviadpp_seller@gmail.com"
  	And user input password with "123456"
  	Then user click button daftar
  	And user close browser