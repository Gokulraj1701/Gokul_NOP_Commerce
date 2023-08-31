package apparels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sampletest {

	shoes Shoes;
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void samplet() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		Shoes=new shoes(driver);
		driver.get("https://demo.nopcommerce.com/shoes");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*
		 * Select sel=new Select(Shoes.shoesDisplayCount()); Thread.sleep(3000);
		 * sel.selectByIndex(2); Thread.sleep(3000);
		 */
		/*
		 * WebElement
		 * wl=driver.findElemshoe1EmailAFriendent(By.xpath("//button[@id='add-to-wishlist-button-25']"));
		 * wl.click();
		 */
		Shoes.shoe1Click().click();
		  Thread.sleep(3000); 
		  Shoes.shoe1EmailAFriend().click();
		  Thread.sleep(3000);
		 
		//driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_25\"]")).sendKeys("4");
		//Thread.sleep(6000);
		driver.close();
		
	}
}
