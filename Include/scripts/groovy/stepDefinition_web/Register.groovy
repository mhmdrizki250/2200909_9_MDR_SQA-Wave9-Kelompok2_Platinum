package stepDefinition_web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Register {
	@Given("user in registration page")
	public void user_in_registration_page() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Registration/Open Registration Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("user input name with {string}")
	public void user_input_name_with(String name) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Registration/Input Username'), [('username') : name], 
    FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("user input email with {string}")
	public void user_input_email_with(String email) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Registration/Input Email'), [('email') : email], 
    FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("user input password with {string}")
	public void user_input_password_with(String password) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Registration/Input Password'), [('password') : password], 
    FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("user click button daftar")
	public void user_click_button_daftar() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Registration/Click button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
}
