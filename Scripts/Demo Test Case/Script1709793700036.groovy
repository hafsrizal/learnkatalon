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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://starbridges.indocyber.co.id/Application/Account/Login?ReturnUrl=%2fApplication')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Sign in_LoginName'), 'shafrizal')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Sign in_Password'), 'k3izVQlDU+2qdzspMqP5JQ==')

WebUI.takeScreenshotAsCheckpoint('checkpoint_SB1')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign in'))

WebUI.waitForElementClickable(findTestObject('Page_Starbridges - Main Menu/a_Time'), 20)

WebUI.takeScreenshotAsCheckpoint('checkpoint_SB2')

WebUI.click(findTestObject('Object Repository/Page_Starbridges - Main Menu/a_Time'))

WebUI.waitForElementPresent(findTestObject('Page_Starbridges - Main Menu/a_Personal Leave'), 0)

WebUI.takeScreenshotAsCheckpoint('checkpoint_SB3')

WebUI.click(findTestObject('Object Repository/Page_Starbridges - Main Menu/a_Personal Leave'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Starbridges - Main Menu/h2_Personal Leave'), 20)

WebUI.takeScreenshotAsCheckpoint('checkpoint_SB4')

WebUI.closeBrowser()
