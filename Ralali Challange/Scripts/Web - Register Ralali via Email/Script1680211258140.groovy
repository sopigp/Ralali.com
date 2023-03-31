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
import com.github.javafaker.Faker as Faker
import groovy.json.JsonSlurper as JsonSlurper

Faker faker = new Faker()

String firstName = faker.name().firstName()

GlobalVariable.name = firstName

System.out.println(firstName)

String email = CustomKeywords.'ralaliKeywords.RandomEmail.getEmail'('sofie', 'gmail.com')

GlobalVariable.email = email

System.out.println(email)

WebUI.openBrowser(GlobalVariable.urlWebsiteRegisterRalali)

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.click(findTestObject('WEB OBJECT/register page/shoppingType_bisnis'))

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_fullname'), GlobalVariable.name)

WebUI.setText(findTestObject('WEB OBJECT/register page/txt_email_phoneNumber'), GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('WEB OBJECT/register page/txt_password'), 'hIH1oW72hv+vc6UHUejG8I80C6LN4wB0')

WebUI.setEncryptedText(findTestObject('WEB OBJECT/register page/txt_password_confirmation'), 'hIH1oW72hv+vc6UHUejG8I80C6LN4wB0')

WebUI.click(findTestObject('WEB OBJECT/register page/checkBox_Terms_Conditions'))

WebUI.click(findTestObject('WEB OBJECT/register page/btn_daftar'))

WebUI.verifyElementPresent(findTestObject('WEB OBJECT/register page/popup_verification_method'), 10)

WebUI.click(findTestObject('WEB OBJECT/register page/btn_verification_method_via_email'))

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

