package Service_Now_Case;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseTest {
	    
	    
	    
	    WebDriver driver;
	    //ctrl+Shoift+O ----- autoimport
	    //pre-condition    ----- @BeforeSuite-----
	    //Test
	    //post-condition   ----- @AfterSuite
	    
	    
	    @BeforeTest
	    public void launchApp() throws Exception {
	        
	        System.out.println("-------------------launching application----------------------");
	        
	        driver = WebDriverManager.chromedriver().create();
	        driver.navigate().to("https://signon.service-now.com/x_snc_sso_auth.do");
	        driver.manage().window().maximize();
	        Thread.sleep(10000);
	        driver.findElement(By.name("email")).sendKeys("idiskpv001@gmail.com");
	        Thread.sleep(5000);
	       driver.findElement(By.linkText("Next")).click();
	        
	        
	        
	    }
	    
	    @AfterTest
	    public void closeApp() throws Exception {
	        
	        Thread.sleep(3000);
	        driver.close();
	        System.out.println("-----------------------closing application----------------------------");
	    }

	

}
