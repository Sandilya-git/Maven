package com.niqsam.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CampaignModule {
	@Test
public void createCampaign() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	WebDriverWait wait=new WebDriverWait(driver, 10);
	driver.get("http://192.168.61.129:8080");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
	Actions a=new Actions(driver);
	}
}
