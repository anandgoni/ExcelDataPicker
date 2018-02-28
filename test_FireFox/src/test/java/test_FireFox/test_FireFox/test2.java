package test_FireFox.test_FireFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Nightly\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "G:\\WebUITests\\src\\test\\resources\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		//driver.navigate().to("http://www.google.com");
		driver.get("http://www.google.com");
		driver.quit();
	}

}
