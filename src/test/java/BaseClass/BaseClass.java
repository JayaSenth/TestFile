package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {
	

	public class Base_Class {
		
		public WebDriver driver; // null

		public WebDriver getDriver(String type) {

		if (type.equalsIgnoreCase("chrome")) {

		System.setProperty

		("webdriver.chrome.driver",
		"C:\\Users\\mjaya\\eclipse-workspace\\adactin\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

		System.setProperty

		("webdriver.gecko.driver",
				"C:\\Users\\mjaya\\eclipse-workspace\\adactin\\Driver\\chromedriver.exe");

		driver = new FirefoxDriver();

		}

		return driver;

		}

		public void clickOnElement(WebElement element) {

		element.click();

		}

		public  void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

		}

		public  void getUrl(String url) {

		driver.get(url);

		}

		public  void dropdown(String type, WebElement element, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byvalue")) {

		s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

		s.selectByVisibleText(value);

		}

		else if (type.equalsIgnoreCase("byIndex")) {

		int data = Integer.parseInt(value);

		s.selectByIndex(data);

		}

		}

		public void close() {

		driver.close();

		}

		public void quit() {

		driver.quit();

		}

	}

}
