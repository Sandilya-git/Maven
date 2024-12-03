package com.niqsam.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HMS {
public static void main(String[] args) {
	//JSON
	//W3C
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://106.51.82.61:9007/");
	driver.findElement(By.id("email")).sendKeys("sam@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456"+Keys.ENTER);
}
}
