import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('secondhand-web/Common/Launch App'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Common/Navigate To App'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Input Email'), [('email') : GlobalVariable.emailOktaSeller], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Input Password'), [('password') : GlobalVariable.pwdOktaSeller], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/User Login/Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Homepage/Icon_Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/My Product/Icon add product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Input Product Name'), [('product_name') : 'Camera Instax Fuji Film'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Input Product Price'), [('product_price') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Input Product Category'), [('category_value') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Input Product Description'), [('product_desc') : 'ini adalah kamera canggih'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Upload Product Images'), [('product_image') : findTestData(
            'image').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Click button add or terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Pages/Create Product/Error Messages Price'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-web/Common/Close App'), [:], FailureHandling.STOP_ON_FAILURE)

