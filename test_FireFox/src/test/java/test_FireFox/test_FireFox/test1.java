package test_FireFox.test_FireFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


public class test1 {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		/*FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        profile.setEnableNativeEvents(true);
        profile.setPreference("javascript.enabled", true);
        profile.setPreference("dom.max_script_run_time", 0);
        profile.setPreference("dom.max_chrome_script_run_time", 0);
        profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		//profile.setPreference("browser.download.dir", new WebDriverWrapper().fileDirLocation().toString());
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/pdf");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("plugin.scan.plid.all", false);
		profile.setPreference("plugin.scan.Acrobat", "99.0");
		
		FirefoxDriver driver=new FirefoxDriver(profile);
		driver.get("http://www.google.com");
			driver.close();*/
	
		/*FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //Location where Firefox is installed
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("moz:firefoxOptions", options);
		*///set more capabilities as per your requirements
 
		//FirefoxDriver driver = new FirefoxDriver(capabilities);
		//String path = "C:/Program Files (x86)/Mozilla Firefox/firefox.exe";
		//FirefoxOptions options = new FirefoxOptions().setBinary(new FirefoxBinary(path));
		 WebDriver driver = new FirefoxDriver();      
		//WebDriver driver = new FirefoxDriver(options);
		
		
		driver.get("http://www.google.com");
					


	}

}
