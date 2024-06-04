package projectObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class LoginPageObject {
	
	public WebDriver driver;
	
	private By username=By.name("username");
	
	private By password=By.name("password");
	
	private By loginButton=By.xpath("//button[@type='submit']");
	
	//private By salaryInfo=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[7]/a");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement enterUsername()
	{
		return driver.findElement(username);
		
	}
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement clicklogin()
	{
		return driver.findElement(loginButton);
	}
	//public WebElement clicksalary()
	//{
	//	return driver.findElement(salaryInfo);
	//}
	
	
	

}
