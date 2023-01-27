package Service_Now_Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class serviceNow_Login_Negative_Testcase extends BaseTest {
	 
@Test

	 public void LoginError() throws Exception {
	
	 
//2. Verify title is ServiceNow
	
	 System.out.println("Application title is: " + driver.getTitle());
	
	 
		
//3. User clicks on the login button
	 Thread.sleep(5000); 
	 driver.findElement(By.linkText("Sign In")).click();
		 
//4.Verify the error message as Invalid input in password!
		 Thread.sleep(4000);
		 WebElement error = driver.findElement(By.xpath("//span[contains(text(),'Required')]"));
		 String invaliderror = error.getText();
		 System.out.println("Error message for password is : " +invaliderror);
	 
//5.Enter the password
		 
		 driver.findElement(By.id("sign_in_password")).sendKeys("Test@45");
		 System.out.println("Wrong password entered");
		 
//7. User clicks on the login button

		 
		 driver.findElement(By.linkText("Sign In")).click();

		 Thread.sleep(5000);
		 
		 
//7. Verify the error message as Invalid input in user name!
		// WebElement verifyerror = driver.findElement(By.xpath(“//*[contains(text(),'Invalid username or password! Please try again.')]"));
		WebElement verifyerror = driver.findElement(By.xpath("//p[text()='Invalid username or password! Please try again.']"));	
		  String errormessage = verifyerror.getText();
		 System.out.println("Error message is : " +errormessage);
	 	
}
}
