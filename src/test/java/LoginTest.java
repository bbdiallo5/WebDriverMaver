import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		//driver.findElement(By.id("SignIn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.id("identifierId")).sendKeys("bkoumbia5@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		driver.findElement(By.id("Passwd")).sendKeys("Safatou@5");*/
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
}
