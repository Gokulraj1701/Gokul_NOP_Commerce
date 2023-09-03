package apparels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApparelsRunner


{
	WebDriver driver=new ChromeDriver();
	shoes Shoes=new shoes(driver);
	emailWebElements emailSent=new emailWebElements(driver);
	clothings Clothings=new clothings(driver);
	shippingAddress ShippingAddress=new shippingAddress(driver);
	reviewAdding ReviewAdding=new reviewAdding(driver);
	accessories Accessories=new accessories(driver);
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Browsersetup()
	{
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@SuppressWarnings("deprecation")
	@Test (priority = 0,enabled=true)
	public void OpeneingShoesCategory() throws InterruptedException
	{
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("gowthy33@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Gow12345");
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		Shoes.apparelsClick().click();
		Thread.sleep(3000);
		Shoes.shoesClick().click();
		Thread.sleep(3000);
	}
	
	@SuppressWarnings("deprecation")
	@Test (priority=1)
	public void shoesSortBy() throws InterruptedException
	{
		
		Select selSortBy=new Select(Shoes.SortBy());
		selSortBy.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select selDisplayCount=new Select(Shoes.DisplayCount());
		selDisplayCount.selectByIndex(2);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Shoes.shoe1Click().click();
		Thread.sleep(2000);
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test(priority=2,enabled=true)
	public void shoe1SizeAndColorSelection() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select selSize=new Select(Shoes.shoe1SizeSelection());
		selSize.selectByIndex(2);
		Thread.sleep(3000);
		Shoes.shoe1colorSelection().click();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void reviewShoes() throws InterruptedException
	{
		
		Shoes.shoe1ReviewClick().click();
		ReviewAdding.reviewTitle().sendKeys("Good Product");
		Thread.sleep(3000);
		ReviewAdding.reviewText().sendKeys("Love these shoes! I've had back surgery and am constantly looking for comfortable walking shoes. These are a good quality, well-made");
		Thread.sleep(3000);
		ReviewAdding.rating().click();
		Thread.sleep(2000);
		ReviewAdding.ratingSubmitButton().click();
		Thread.sleep(2000);
		for(int i=0;i<2;i++)
		{
			driver.navigate().back();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority=4)
	public void shoesAddToCartAndWishList() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Shoes.shoe1countSelection().clear();
		Thread.sleep(3000);
		Shoes.shoe1countSelection().sendKeys("2");
		
		//Selecting Shipment Details
		
		Shoes.shoe1ShippingClick().click();
		Select ShippingAddressSelect=new Select(ShippingAddress.selectCountry());
		ShippingAddressSelect.selectByVisibleText("India");
		Thread.sleep(3000);
		ShippingAddress.selectPincode().sendKeys("638657");
		Thread.sleep(3000);
		ShippingAddress.selectShipmentMethod().click();
		ShippingAddress.shipmentApplyButton().click();
		
		//Adding to cart and Wishlist
		Thread.sleep(3000);
		Shoes.shoe1AddtoCart().click();
		Thread.sleep(8000);
		Shoes.shoe1WishList().click();
		Thread.sleep(8000);
		Shoes.shoe1CompareListButton().click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=5,enabled=true)
	public void EmailShoe() throws InterruptedException, IOException
	{
		FileInputStream fle=new FileInputStream("./EmailId.properties");
		Properties obj=new Properties();
		obj.load(fle);
		
		Shoes.shoe1EmailAFriend().click();
		Thread.sleep(3000);
		emailSent.EmailFriendEmail().sendKeys(obj.getProperty("FriendEmail"));
		//emailSent.EmailYourEmail().sendKeys(obj.getProperty("MyEmail"));
		Thread.sleep(3000);
		emailSent.EmailPersonalMessage().sendKeys("Herer is the shoe i suggest you to look");
		Thread.sleep(3000);
		emailSent.EmailSentButton().click();
		Thread.sleep(3000);
	}
	
	//Testcases for Clothings->Tshirt
	
	@SuppressWarnings("deprecation")
	@Test(priority=6,enabled=true)
	public void clothingsShorting() throws InterruptedException
	{
		
		Shoes.apparelsClick().click();
		Thread.sleep(3000);
		Clothings.clothingsClick().click();
		Thread.sleep(3000);
		Select selSortBy=new Select(Shoes.SortBy());
		selSortBy.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select selDisplayCount=new Select(Shoes.DisplayCount());
		selDisplayCount.selectByIndex(2);
		Thread.sleep(3000);
	}
	
	@Test(priority=7,enabled=true)
	public void clothingsTshirt() throws InterruptedException
	{
		
		Clothings.clothings1Click().click();
		Thread.sleep(3000);
		Select clothing1SizeSelect=new Select(Clothings.clothing1SizeSelection());
		clothing1SizeSelect.selectByVisibleText("2X");
		Thread.sleep(3000);
		
		Clothings.clothing1CountSelection().clear();
		Clothings.clothing1CountSelection().sendKeys("2");
		Thread.sleep(3000);
		
		//Shippment Address Selection
		Clothings.clothing1ShippmentAddress().click();
		Select ShippingAddressSelect=new Select(ShippingAddress.selectCountry());
		ShippingAddressSelect.selectByVisibleText("India");
		Thread.sleep(3000);
		ShippingAddress.selectPincode().sendKeys("638657");
		Thread.sleep(3000);
		ShippingAddress.selectShipmentMethod().click();
		ShippingAddress.shipmentApplyButton().click();
		
	}
	@Test(priority=8)
	public void reviewclothings() throws InterruptedException
	{
		
		Clothings.clothing1review().click();
		ReviewAdding.reviewTitle().sendKeys("Good Product");
		Thread.sleep(3000);
		ReviewAdding.reviewText().sendKeys("Demo Review");
		Thread.sleep(3000);
		ReviewAdding.rating().click();
		Thread.sleep(2000);
		ReviewAdding.ratingSubmitButton().click();
		Thread.sleep(2000);
		for(int i=0;i<2;i++)
		{
			driver.navigate().back();
		}
	}
	
	
	@Test(priority=9,enabled=true)
	public void clothingsTshirtAddingToCartandWishlist() throws InterruptedException
	{
		
		Thread.sleep(3000);
		Clothings.clothing1AddtoCart().click();
		Thread.sleep(2000);
		Clothings.clothing1AddtoWishlist().click();
		Thread.sleep(2000);
		Clothings.clothing1AddtoCompareList().click();
		Thread.sleep(2000);
	}
	@Test(priority=10,enabled=true)
	public void clothingsTshirtEmailSent() throws InterruptedException, IOException
	{
		FileInputStream fle=new FileInputStream("./EmailId.properties");
		Properties obj=new Properties();
		obj.load(fle);
		
		Clothings.clothing1EmailaFriend().click();
		Thread.sleep(3000);
		emailSent.EmailFriendEmail().sendKeys(obj.getProperty("FriendEmail"));
		//emailSent.EmailYourEmail().sendKeys(obj.getProperty("MyEmail"));
		Thread.sleep(3000);
		emailSent.EmailPersonalMessage().sendKeys("Here is the Tshirt i suggest you to look");
		Thread.sleep(3000);
		emailSent.EmailSentButton().click();
		Thread.sleep(3000);
	}
	@Test (priority=11,groups="Belt")
	public void accessoriesBeltSelectFunction() throws InterruptedException
	{
		
		  driver.get("https://demo.nopcommerce.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(
		  "gowthy33@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Gow12345");
		  driver.findElement(By.xpath("//button[@class='button-1 login-button']")).
		  click();
		 
		
		
		Shoes.apparelsClick().click();
		Thread.sleep(3000);
		Accessories.accessoriesSelect().click();
		Thread.sleep(3000);
		Accessories.accessoriesBelt().click();
		Thread.sleep(3000);
	}
	
	@Test (priority=12,groups="Belt")
	public void beltReviewFunction() throws InterruptedException
	{
		Accessories.beltReview().click();
		ReviewAdding.reviewTitle().sendKeys("Good Product");
		Thread.sleep(3000);
		ReviewAdding.reviewText().sendKeys("Demo Review");
		Thread.sleep(3000);
		ReviewAdding.rating().click();
		Thread.sleep(2000);
		ReviewAdding.ratingSubmitButton().click();
		Thread.sleep(2000);
		for(int i=0;i<2;i++)
		{
			driver.navigate().back();
		}
	}
	@Test(priority=13,groups="Belt")
	public void beltCountSelection() throws InterruptedException
	{
		Accessories.beltCount().clear();
		Accessories.beltCount().sendKeys("3");
		Thread.sleep(2000);
		
	}
	@Test(priority=14,groups="Belt")
	public void beltShippment() throws InterruptedException
	{
		Accessories.beltShipping().click();
		Select ShippingAddressSelect=new Select(ShippingAddress.selectCountry());
		ShippingAddressSelect.selectByVisibleText("India");
		Thread.sleep(2000);
		ShippingAddress.selectPincode().sendKeys("638657");
		Thread.sleep(2000);
		ShippingAddress.selectShipmentMethod().click();
		ShippingAddress.shipmentApplyButton().click();
		Thread.sleep(2000);
	}
	@Test(priority=15,groups="Belt")
	public void beltAddtoCartandWishlist() throws InterruptedException
	{
		Accessories.beltAddtoCart().click();
		Thread.sleep(3000);
		Accessories.beltAddtoWishList().click();
		Thread.sleep(3000);
		Accessories.beltEmailaFriend().click();
		Thread.sleep(2000);
	}
	@Test(priority=16,groups="Belt")
	public void beltEmailAFriend() throws IOException, InterruptedException
	{
		
		  FileInputStream fle=new FileInputStream("./EmailId.properties");
		  Properties obj=new Properties();
		  obj.load(fle);
		 
		
		
		Thread.sleep(2000);
	
		emailSent.EmailFriendEmail().sendKeys(obj.getProperty("FriendEmail"));
		//emailSent.EmailYourEmail().sendKeys(obj.getProperty("MyEmail"));
		Thread.sleep(2000);
		emailSent.EmailPersonalMessage().sendKeys("Here is the Belt i suggest you to look");
		Thread.sleep(2000);
		emailSent.EmailSentButton().click();
		Thread.sleep(2000);
		driver.navigate().to("https://demo.nopcommerce.com/");
		
	}

}
