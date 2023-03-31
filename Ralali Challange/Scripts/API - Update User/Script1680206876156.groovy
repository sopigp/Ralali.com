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

String email = CustomKeywords.'ralaliKeywords.RandomEmail.getEmail'('emailUser', 'gmail.com')

GlobalVariable.email = email

System.out.println(email)

response1 = WS.sendRequest(findTestObject('API OBJECT/Update User', [('access_token') : GlobalVariable.access_token, ('name') : GlobalVariable.name
            , ('email') : GlobalVariable.email, ('status') : 'inactive', ('url') : GlobalVariable.url, ('userId') : GlobalVariable.userId]))

System.out.println(response1)

JsonSlurper slurper1 = new JsonSlurper()

Map parsedJson1 = slurper1.parseText(response1.getResponseText())

String userId = parsedJson1.id

GlobalVariable.userId = userId

