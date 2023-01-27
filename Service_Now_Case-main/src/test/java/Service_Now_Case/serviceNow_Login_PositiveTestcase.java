package Service_Now_Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class serviceNow_Login_PositiveTestcase extends BaseTest{
	
	@Test
	
// Verify title is ServiceNow
	 public void Login() throws Exception {
	 
		 System.out.println("Application title is: " + driver.getTitle());
		 
//Verify username text field has label of User name
	
		  
		 WebElement labelText = driver.findElement(By.xpath("//span[contains(text(),'Email')]"));
		String Email = labelText.getText();
		 System.out.println("Username is: " + Email);
		 

		 
// Enter username/email
		 Thread.sleep(4000);
		 //driver.findElement(By.name("email")).clear();

	
//Verify password text field has label of Password
		
		 WebElement password = driver.findElement(By.xpath("//span[contains(text(),'Password')]"));
		String s = password.getText();
		System.out.println("Password label is:" +s);
		
// Enter password
		 
		 driver.findElement(By.id("sign_in_password")).sendKeys("Test@12345");
		 System.out.println("Password has been entered");
		 
//verify forgot password is visible to the user
		 WebElement forgotpassword = driver.findElement(By.linkText("Forgot your password?"));
			String f = forgotpassword.getText();
			System.out.println("Forgot password is visible to the user as:" +f);
		 
//Verify user can see the login button
			WebElement loginbutton = driver.findElement(By.linkText("Sign In"));
			String lb = loginbutton.getText();
			System.out.println("User can see the login button as: " +lb);
		 
		 
//sign button
		 
		 driver.findElement(By.linkText("Sign In")).click();

		 
	 
		 

		

		
		
		 
		

		 
}
	
}
    
