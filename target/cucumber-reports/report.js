$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/Demo.feature");
formatter.feature({
  "name": "Test scenario",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestDemo"
    }
  ]
});
formatter.scenario({
  "name": "Verify Login with New Parent Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestDemo"
    }
  ]
});
formatter.step({
  "name": "Open browser and enter URL",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.openBrowserAndEnterUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"parent1234@gmail.com\" and \"Suresh@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicked on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Parent Setup Dashboard should display for new user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyParentDashboardForNewUser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login with Remedial Coach Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestDemo"
    }
  ]
});
formatter.step({
  "name": "Open browser and enter URL",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.openBrowserAndEnterUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"suresh.patil@spedathome.com\" and \"Suresh@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicked on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Remedial Coach dashboard should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyRemedialCoachDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login with OT Coach Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestDemo"
    }
  ]
});
formatter.step({
  "name": "Open browser and enter URL",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.openBrowserAndEnterUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"harshil.panchal@spedathome.com\" and \"OT@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicked on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "OT Coach dashboard should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyOTCoachDashboard()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(@class,\u0027nav nav-pills\u0027)][1]\"}\n  (Session info: chrome\u003d108.0.5359.126)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027LAPTOP-C379US1T\u0027, ip: \u0027192.168.68.138\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c120f1e5919991eecc246446ef0d7dd2, findElement {using\u003dxpath, value\u003d//*[contains(@class,\u0027nav nav-pills\u0027)][1]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.126, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\nitin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59158}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59158/devtoo..., se:cdpVersion: 108.0.5359.126, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c120f1e5919991eecc246446ef0d7dd2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.isDisplayed(Unknown Source)\r\n\tat Utils.SpedUtility.isElementDisplayed(SpedUtility.java:54)\r\n\tat com.spedtestautomation.Pages.SpedDashobardPage.verifyOTCoachDasboard(SpedDashobardPage.java:52)\r\n\tat com.spedtestautomation.StepDef.LoginSteps.verifyOTCoachDashboard(LoginSteps.java:59)\r\n\tat ✽.OT Coach dashboard should display(./features/Demo.feature:23)\r\n",
  "status": "failed"
});
});