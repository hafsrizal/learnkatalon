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

WebUI.navigateToUrl('http://amsdev.pln.co.id/')

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/button_Non SSO'))

WebUI.setText(findTestObject('Object Repository/Page_AMS Korporat/input_Username_input ng-untouched ng-pristi_11d632'), 
    'divga.sekre')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_AMS Korporat/input_Password_input ng-untouched ng-pristi_be4e90'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.takeScreenshotAsCheckpoint('chekcpoint_gambar1')

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/button_Log In'))

WebUI.takeScreenshotAsCheckpoint('chekcpoint_gambar2')

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/a_inboxSurat Masuk'))

WebUI.takeScreenshotAsCheckpoint('chekcpoint_gambar3')

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/svg_Dari_mat-datepicker-toggle-default-icon_04302c'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_DEC 2023_mat-calendar-arrow'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_2021'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_JAN'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_5'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/svg_Hingga_mat-datepicker-toggle-default-ic_dbe560'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_MAR 2024_mat-calendar-arrow'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_2023'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_DEC'))

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/div_29'))

WebUI.takeScreenshotAsCheckpoint('chekcpoint_gambar4')

WebUI.click(findTestObject('Object Repository/Page_AMS Korporat/button_Cari'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_AMS Korporat/td_1'), 50)

WebUI.takeScreenshotAsCheckpoint('chekcpoint_gambar5')

WebUI.closeBrowser()

