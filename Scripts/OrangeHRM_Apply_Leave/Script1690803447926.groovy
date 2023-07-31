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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Leave (1)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Assign Leave (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input (1)'), 'Samoju Satyasaee')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/textarea_Comments_oxd-textarea oxd-textarea_6464fb (1)'), 
    'Please grant the leave request')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Assign (1)'))

text=WebUI.getText(findTestObject('Object Repository/Page_OrangeHRM/p_Balance not sufficient (1)'))
println(text)

WebUI.closeBrowser()

