package downBarHomePage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import apparels.shoes;

public class CustomerServiceRunner {
	WebDriver driver=new ChromeDriver();
	search Search=new search(driver);
	shoes Shoes=new shoes(driver);
	news News=new news(driver);
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void InvokeBrowser() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@SuppressWarnings("deprecation")
	@Test(priority=0)
	public void searchKeyWord() throws InterruptedException
	{
		//LOGIN
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("gowthy33@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Gow12345");
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		
		Search.searchClick().click();
		Thread.sleep(2000);
		Search.searchKeyword().sendKeys("shoes");
		Thread.sleep(5000);
		Search.searchButton().click();
		Thread.sleep(3000);
		String actualString=driver.findElement(By.linkText("adidas Consortium Campus 80s Running Shoes")).getText();
		System.out.println(actualString);
		if(actualString.equals("adidas Consortium Campus 80s Running Shoes"))
			{
					assertTrue(true);
			}
		else {
			System.out.println("Search Fails");
			assertTrue(false);
		}
		
	}
	@Test(priority=1)
	public void newsFunction() throws InterruptedException
	{
		News.newsClick().click();
		Thread.sleep(2000);
		News.newsDetailsButton().click();
		Thread.sleep(2000);
		News.newsCommentTitle().sendKeys("Demo Title");
		News.newsCommentText().sendKeys("Demo Comment");
		Thread.sleep(2000);
		News.newsCommentButton().click();
		String actualString=driver.findElement(By.xpath("//*[@class=\"result\"]")).getText();
		System.out.println(actualString);
		if(actualString.equals("News comment is successfully added.")){
			assertTrue(true);
		}
		else{
			System.out.println("Comment Fails");
			assertTrue(false);
		}
	}
	
	@Test (priority=2)
	public void RecentlyViewedProducts() throws InterruptedException
	{
		driver.findElement(By.linkText("Recently viewed products")).click();
		Thread.sleep(3000);
		String actualString=driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		System.out.println(actualString);
		if(actualString.equals("Recently viewed products")){
			assertTrue(true);
		}
		else{
			System.out.println("Comment Fails");
			assertTrue(false);
		}
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void ComparedList() throws InterruptedException
	{
		driver.findElement(By.linkText("Compare products list")).click();;
		Thread.sleep(3000);
		String actualString=driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		if(actualString.equals("Compare products")){
			assertTrue(true);
		}
		else{
			System.out.println("Compare List Page Fails");
			assertTrue(false);
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void NewProductsFunction() throws InterruptedException
	{
		driver.findElement(By.linkText("New products")).click();
		Thread.sleep(2000);
		String actualString=driver.findElement(By.xpath("(//*[@class='product-title'])[6]")).getText();
		if(actualString.equals("Build your own computer")){
			assertTrue(true);
		}
		else{
			System.out.println("Comment Fails");
			assertTrue(false);
		}
		Thread.sleep(2000);
		
	}
	
	
}
