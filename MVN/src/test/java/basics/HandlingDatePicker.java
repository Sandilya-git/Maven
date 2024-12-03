package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingDatePicker {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("http://192.168.61.129:8080");
		d.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		d.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
		d.findElement(By.linkText("Potentials")).click();
		d.findElement(By.xpath("//input[@value='New Potential']")).click();
		d.findElement(By.xpath("//img[@title='Calendar']")).click();
		Set<String> allWid = d.getWindowHandles();
		String pwid = d.getWindowHandle();
		for (String wid : allWid) {
			d.switchTo().window(wid);
		}
		d.findElement(By.linkText("1")).click();
		d.switchTo().window(pwid);
		d.findElement(By.partialLinkText("Logout")).click();
	}
}
