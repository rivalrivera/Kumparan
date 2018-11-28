import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser(null)
CustomKeywords.'com.kumparan.Web.openUrl'(GlobalVariable.WEB_MAIN_URL)
WebUI.maximizeWindow()

'Login'
WebUI.waitForElementClickable(findTestObject('Object Repository/WebPage/Login Page/ElementNotif'), 10)
WebUI.click(findTestObject('Object Repository/WebPage/Login Page/btnNoPushNotif'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/WebPage/Login Page/btnLogin'))
WebUI.delay(2)

'Login Facebook'
WebUI.click(findTestObject('Object Repository/WebPage/Login Page/btnFacebook'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1)
WebUI.verifyElementVisible(findTestObject('Object Repository/WebPage/Login Page/Facebook Page/lblFbLoginPopup'))
WebUI.setText(findTestObject('Object Repository/WebPage/Login Page/Facebook Page/txtFbLoginEmail'), GlobalVariable.EMAIL_FACEBOOK_GOOGLE)
WebUI.setText(findTestObject('Object Repository/WebPage/Login Page/Facebook Page/txtFbLoginPassword'), GlobalVariable.PASSWORD_FACEBOOK)
WebUI.click(findTestObject('Object Repository/WebPage/Login Page/Facebook Page/btnFbLogin'))
WebUI.switchToWindowIndex(0)
WebUI.delay(5)

'Close Browser'
WebUI.closeBrowser()