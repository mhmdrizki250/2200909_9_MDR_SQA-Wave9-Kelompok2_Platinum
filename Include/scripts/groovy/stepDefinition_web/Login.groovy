package stepDefinition_web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {

	//positive
	@Given("launch browser")
	public void launch_browser() {
		WebUI.callTestCase(findTestCase('secondhand-web/Common/Launch Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("navigate to web")
	public void navigate_to_web() {
		WebUI.callTestCase(findTestCase('secondhand-web/Common/Navigate To Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("click masuk")
	public void click_masuk() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("input email with {string}")
	public void input_email_with(String email) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Input Email'), [('email') : GlobalVariable.EmailAsiyah],
		FailureHandling.STOP_ON_FAILURE)
	}

	@And("input password with {string}")
	public void input_password_with(String password) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Input Password'), [('password') : GlobalVariable.PasswordAsiyah],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click button masuk2")
	public void click_button_masuk2() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("close web")
	public void close_web() {
		WebUI.callTestCase(findTestCase('secondhand-web/Common/Close Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}



