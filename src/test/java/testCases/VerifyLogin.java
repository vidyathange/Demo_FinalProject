package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import projectObjectModel.LoginPageObject;
import projectObjectModel.SalaryDetailsPageObject;
import resources.BaseClass;

public class VerifyLogin extends BaseClass {
	@Test
	public void verifyLoginButton() throws InterruptedException, IOException
	{
		driverInitialize();
		
		Thread.sleep(3000);
		
	//	driver.findElement(By.name("username")).sendKeys("Admin");
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.enterUsername().sendKeys("Admin");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		lpo.enterPassword().sendKeys("admin123");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		lpo.clicklogin().click();
		Thread.sleep(2000);
		
		 WebElement MyImfo= driver .findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
		 
		 MyImfo.click();
		 
		// SalaryDetailsPageObject sdp=new SalaryDetailsPageObject(driver);
		 
		// sdp. SalaryDetails().click();
		 
	
		
		
	}

}
