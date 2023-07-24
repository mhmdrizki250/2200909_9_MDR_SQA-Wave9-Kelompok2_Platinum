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
@Homepage_Add_Product
Feature: Homepage Add Product

  @Positive
  Scenario: PRODADD001 - user should be able to add product with valid
	Given user launch browser and navigate to url "https://secondhand.binaracademy.org/"
	When click masuk
	When input emailHap with "mhmdrizki250@gmail.com"
	When input passwordHap with "Kiki123456789"
	Then click button masukHap
	Then click button jual
	When input productName "Baju Eiger MN02"
	When input productPrice "120.000"
	Then click button productCategory "3"
	When input productDescription "Baju eiger buat para pendaki gunung"
	Then click button productImages
	Then click button add or terbitkan
	And close web 
	