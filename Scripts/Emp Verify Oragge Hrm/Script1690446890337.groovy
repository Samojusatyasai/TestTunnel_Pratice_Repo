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

WebUI.click(findTestObject('Object Repository/Emp Verification OrangeHRM/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Object Repository/Emp Verification OrangeHRM/Page_OrangeHRM/input'), 'Vijay')

WebUI.click(findTestObject('Object Repository/Emp Verification OrangeHRM/Page_OrangeHRM/button_Search'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Emp Verification OrangeHRM/Page_OrangeHRM/span_(5) Records Found'), 
    '(5) Records Found')

data = WebUI.click(findTestObject('Object Repository/Emp Verification OrangeHRM/Page_OrangeHRM/div_03780362Vijaysai dundi'))

println(data)

WebUI.closeBrowser()

