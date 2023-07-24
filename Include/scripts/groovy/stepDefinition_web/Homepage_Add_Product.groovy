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
import io.appium.java_client.events.api.general.SearchingEventListener

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



class Homepage_Add_Product {

	@Given("launch browser")
	public void launch_browser() {
		WebUI.callTestCase(findTestCase('secondhand-web/Common/Launch Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("navigate to web")
	public void navigate_to_web() {
		WebUI.callTestCase(findTestCase('secondhand-web/Common/Navigate To Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("click masuk")
	public void click_masuk() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("input emailHap with {string}")
	public void input_emailHap_with(String emailHap) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Input Email'), [('email') : GlobalVariable.emailRizki],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("input passwordHap with {string}")
	public void input_passwordHap_with(String passwordHap) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Input Password'), [('password') : GlobalVariable.passwordRizki],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click button masukHap")
	public void click_button_masukHap() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("input productName with {string}")
	public void input_productName_with(String productName) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Input Product Name'), [('product_name') : 'Baju Eiger MN02'], 
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("input productPrice with {string}")
	public void input_productPrice_with(String productPrice) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Input Product Price'), [('product_price') : '120.000'], 
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("click button productCategory")
	public void click_button_productCategory() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Select Product Category'), [('category_value') : '3'], 
			FailureHandling.STOP_ON_FAILURE)	
	}
	
	@When("input productDescription with {string}")
	public void input_productDescription_with(String productDescription) {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Input Product Description'), [('product_desc') : 'Baju eiger buat para pendaki gunung'], 
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("click button productImages")
	public void click_button_productImages() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Upload Product Images'), [('product_image') : findTestData('image').getValue(2, 1)], 
			FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("click button add or terbitkan")
	public void click_button_add_or_terbitkan() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Click button add or terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("click button add or terbitkan")
	public void click_button_add_or_terbitkan() {
		WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage - Add Product/Click button add or terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("close web")
	public void close_web() {
		WebUI.callTestCase(findTestCase('secondhand-web/Common/Close Web'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}