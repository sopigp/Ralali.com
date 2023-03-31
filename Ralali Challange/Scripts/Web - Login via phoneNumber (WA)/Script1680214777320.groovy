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

WebUI.openBrowser(GlobalVariable.urlWebsiteLoginRalali)

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('WEB OBJECT/login page/txt_email_phoneNumber'), GlobalVariable.phoneNumber)

WebUI.click(findTestObject('WEB OBJECT/login page/btn_masuk'))

WebUI.verifyElementPresent(findTestObject('WEB OBJECT/register page/popup_verification_method'), 10)

WebUI.click(findTestObject('WEB OBJECT/register page/otp_viaWhatsapp'))

WebUI.verifyElementPresent(findTestObject('WEB OBJECT/register page/popup_verification_code'), 10)

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_verificationCode_Input1'), '1')

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_verificationCode_Input2'), '2')

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_verificationCode_Input3'), '3')

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_verificationCode_Input4'), '4')

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_verificationCode_Input5'), '5')

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_verificationCode_Input6'), '6')

WebUI.click(findTestObject('WEB OBJECT/register page/btn_verification'))

WebUI.verifyElementPresent(findTestObject('WEB OBJECT/register page/alert_verification_code'), 10)

WebUI.closeBrowser()

