package projectObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class SalaryDetailsPageObject {
	
	

	public WebDriver driver;
	
	private By SalaryDetails=By.linkText("Salary");
	
	public SalaryDetailsPageObject(WebDriver driver2) {
		this. driver=driver2;
		
	}
	
	public WebElement SalaryDetails()
	{
		return driver.findElement(SalaryDetails);
	}

}
