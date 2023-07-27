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

WebUI.callTestCase(findTestCase('Orange HRM LogIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/li_Reports'))

WebUI.setText(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/input'), 'satyasai')

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/i_Actions_oxd-icon bi-check oxd-checkbox-in_fe61ad'))

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/i_All Employee Sub Unit Hierarchy Report_ox_1ff162'))

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/i_Location_oxd-icon bi-x --clear'))

WebUI.click(findTestObject('Object Repository/Orange HRM PIM Report/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

