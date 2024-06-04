package personalDetails;

import java.io.IOException;

import projectObjectModel.LoginPageObject;
import resources.BaseClass;

public class Salary_details extends BaseClass {
	
	public void verifyFieldsEditable() throws InterruptedException, IOException
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
		
	}

}
