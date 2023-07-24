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

Mobile.startApplication('androidapp/app-release-second-hand-gcp.apk', false)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/MenuBar App/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/My Account/Tap Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/User Login/Input Email - Rizki Valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/User Login/Input Password - Rizki Valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/User Login/Tap Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/My Account - Login/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Detail Product/Tap Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Choose Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Input Nama Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Input Harga Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Select Kategori'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Input Lokasi Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Input Deskripsi Prod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Tap Foto Produk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Edit Product/Tap Button Perbarui Produk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/Detail Product/Tap Button Back'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('secondhand-app/Pages/User Logout/Button Logout'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

