package apparels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class runnApparels 
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test ()
	public void s
	
	
}
