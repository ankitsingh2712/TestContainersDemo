package Pilot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleRun {
public static void main(String[] args) {
		
	System.setProperty("WebDriver.Firefox.driver", "C:\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.legalandgeneral.com");

		
		
	}
}
