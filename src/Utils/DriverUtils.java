package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverUtils extends PageFactory {

	public static final String DRIVER_CHROME = "chrome";
	public static final String DRIVER_FIREFOX = "firefox";
	public static final String DRIVER_EDGE = "edge";
	static WebDriver driver;

	public static WebDriver getDriver(String browserValue) {
		if (DriverUtils.DRIVER_CHROME.equals(browserValue)) {
			driver = createChromeDriver("");
			System.out.println("Automation TCs are running on " + browserValue + " browser");
		}
		return driver;
	}

	private static WebDriver createChromeDriver(String path) {
		String chrome_driver_path = "\\Driver\\chromedriver.exe";
		//"C:\Users\nitin\Dropbox\My PC (LAPTOP-C379US1T)\Downloads\SPED\SpedAutomation\SpedE2EAutomation.\Driver\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chrome_driver_path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// final WebDriver driver = new
		// ChromeDriver(getChromeDriverCapabilities(downloadDirectory,
		// browserMobProxy, isWithouImagePageLoad, smartTestExecutionContext));
		return driver;
	}

}
