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

Mobile.tap(findTestObject('secondhand-app/Page Edit Profile/text password'), 2)

Mobile.waitForElementPresent(findTestObject('secondhand-app/Page Edit Profile/input old password'), 2)

Mobile.tap(findTestObject('secondhand-app/Page Edit Profile/input old password'), 2)

Mobile.setText(findTestObject('secondhand-app/Page Edit Profile/set text old password'), old_password, 0)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('secondhand-app/Page Edit Profile/input new password'), 2)

Mobile.tap(findTestObject('secondhand-app/Page Edit Profile/input new password'), 2)

Mobile.setText(findTestObject('secondhand-app/Page Edit Profile/set text new password'), new_password, 0)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('secondhand-app/Page Edit Profile/input confirmation password'), 2)

Mobile.tap(findTestObject('secondhand-app/Page Edit Profile/input confirmation password'), 2)

Mobile.setText(findTestObject('secondhand-app/Page Edit Profile/set text confirmation password'), new_password, 0)

Mobile.pressBack()

Mobile.tap(findTestObject('secondhand-app/Page Edit Profile/button simpan password'), 2)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

