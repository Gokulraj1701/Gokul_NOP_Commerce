package IntegrationPart;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Computermain {
	WebDriver driver=new ChromeDriver();
	Notebook notebook=new Notebook(driver);
	RegisterWebElement regMethod=new RegisterWebElement(driver);
	LoginWebElement logMethod=new LoginWebElement(driver);
	Wishlist wishlist=new Wishlist(driver);
	Comparelist compare=new Comparelist(driver);
	CurrencySelect Currencyobj=new CurrencySelect(driver);
	checkoutFirstStep check=new checkoutFirstStep(driver);
	NopComShoppingCart cart=new NopComShoppingCart(driver);
	shoes Shoes=new shoes(driver);
	emailWebElements emailSent=new emailWebElements(driver);
	shippingAddress ShippingAddress=new shippingAddress(driver);
	Cellphones cellphone=new Cellphones(driver);
    SearchbarTest searchbar=new SearchbarTest(driver);
    reviewAdding ReviewAdding=new reviewAdding(driver);
    JavascriptExecutor js = (JavascriptExecutor)driver; 
	Properties prop;
	FileInputStream f1;
	
  @SuppressWarnings("deprecation")
@BeforeTest(groups="Gowtham")
  public void invokeBrowser() throws IOException {
	
	  driver.get("https://demo.nopcommerce.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  f1=new FileInputStream("./property/Computer.properties");
	  prop=new Properties();
	  prop.load(f1);
  }
  @Test(priority=0,groups="Gowtham")
  public void Register() throws InterruptedException {
	  
	  regMethod.registerMain().click();
		Thread.sleep(2000);
		regMethod.genderMale().click();
		Thread.sleep(1000);
		regMethod.firstName().sendKeys(prop.getProperty("firstname"));
		regMethod.lastName().sendKeys(prop.getProperty("lastname"));
		Thread.sleep(1000);
		Select daySel = new Select(regMethod.date());
		Select monthSel = new Select(regMethod.month());
		Select yearSel = new Select(regMethod.year());
		
		daySel.selectByValue("11");
		Thread.sleep(1000);
		monthSel.selectByValue("1");
		Thread.sleep(1000);
		yearSel.selectByValue("2001");
		Thread.sleep(2000);
		regMethod.emailReg().sendKeys(prop.getProperty("email"));
		Thread.sleep(1000);
		regMethod.companyName().sendKeys(prop.getProperty("companyname"));	
		Thread.sleep(1000);
		regMethod.newsletter().click();
		Thread.sleep(1000);
		regMethod.passwordSet().sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		regMethod.passwordCnf().sendKeys(prop.getProperty("Confirmpassword"));
		Thread.sleep(1000);
		regMethod.registerBtn().click();
		Thread.sleep(2000);
		driver.navigate().to("https://demo.nopcommerce.com");
	 }
  
  @Test(priority=1,groups="Gowtham")
  public void Login() throws InterruptedException {
	  logMethod.loginMenu().click();
	  logMethod.emailLogin().sendKeys(prop.getProperty("username"));
		Thread.sleep(3000);
		logMethod.passwordLogin().sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		logMethod.loginBtn().click();
  }
  
  @Test(priority=2,groups="Gokul")
  public void Currency() throws InterruptedException {
		Select selcurrency=new Select(Currencyobj.Currency());
		selcurrency.selectByVisibleText("Euro");
		Thread.sleep(3000);
	  
  }
  


@Test(priority=4,groups="Akash")
public void Notebookclick() throws InterruptedException
{
	//Computer click
	notebook.Comp().click();
	Thread.sleep(3000);
	
	//Notebook click
	notebook.Note().click();
	Thread.sleep(3000);
}

@Test(priority=5,groups="Akash")
public void Notebooksortby() throws InterruptedException{
	
		 
	//DropDown boxes of Notebook
	Select drp5=new Select(notebook.Pos());
	drp5.selectByIndex(4);
	Thread.sleep(3000);
	Select drp6=new Select(notebook.Disp());
	drp6.selectByIndex(1);
	Thread.sleep(3000);
	
	//List view
	notebook.List().click();
	Thread.sleep(3000);
	
	
		 
	
}

@Test(priority=6,groups="Akash")

public void Notebookfeatures() throws InterruptedException {
	
	//Product click
		notebook.Pro().click();
		Thread.sleep(3000);
	//Shipping address
	notebook.Address().click();
	Thread.sleep(5000);
	Select drp7=new Select(notebook.Country());
	drp7.selectByVisibleText("India");
	Thread.sleep(3000);
	notebook.Zipcode().click();
	notebook.Zipcode().sendKeys("641041");
	Thread.sleep(3000);
	notebook.Shippingmethod().click();
	Thread.sleep(3000);
	notebook.Apply().click();
	Thread.sleep(3000);
}

@Test(priority=7,groups="Akash")

public void ShoppingcartandWishlist() throws InterruptedException {
	//Add to wishlist click
	notebook.Wishlist().click();
	Thread.sleep(3000);
	//Add to cart click
	notebook.Addtocart().click();
	Thread.sleep(3000);
}

@Test(priority=8,groups="Akash")
public void Emailfeatures() throws InterruptedException {
	
	notebook.Email().click();
	Thread.sleep(3000);
    emailSent.EmailFriendEmail().sendKeys(prop.getProperty("friendEmail"));
	
	Thread.sleep(3000);
	emailSent.EmailPersonalMessage().sendKeys(prop.getProperty("Msg"));
	Thread.sleep(3000);
	emailSent.EmailSentButton().click();
	Thread.sleep(3000);
	driver.navigate().to("https://demo.nopcommerce.com");
	Thread.sleep(3000);

}
@Test(priority=9,groups="Gokul")
public void ShoeClick() throws InterruptedException {
	Shoes.apparelsClick().click();
	Thread.sleep(3000);
	Shoes.shoesClick().click();
	Thread.sleep(3000);
}

@SuppressWarnings("deprecation")
@Test (priority=10,groups="Gokul")
public void shoesSortBy() throws InterruptedException
{
	
	Select selSortBy=new Select(Shoes.shoesSortBy());
	selSortBy.selectByIndex(2);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Select selDisplayCount=new Select(Shoes.shoesDisplayCount());
	selDisplayCount.selectByIndex(2);
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Shoes.shoe1Click().click();
	Thread.sleep(2000);
}

@Test(priority=11,groups="Gokul")
public void reviewShoes() throws InterruptedException
{
	Shoes=new shoes(driver);
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
@Test(priority=12,groups="Gokul")
public void shoe1SizeAndColorSelection() throws InterruptedException{

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Select selSize=new Select(Shoes.shoe1SizeSelection());
	selSize.selectByIndex(2);
	Thread.sleep(3000);
	Shoes.shoe1colorSelection().click();
	Thread.sleep(3000);
}

@SuppressWarnings("deprecation")
@Test(priority=13,groups="Gokul")
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
	
}





@Test(priority=14,groups="Dinesh")
public void searchbar() throws InterruptedException {
	searchbar.searchBar().sendKeys("HTC One M8");
    searchbar.search().click();
    Thread.sleep(2000);
    cellphone.clickProduct().click();
    Thread.sleep(3000);
}

@Test(priority=15,groups="Dinesh")
public void Cellphoneshipping() throws InterruptedException{
	cellphone.enterAddress().click();
    Select chooseCountry=new Select(ShippingAddress.selectCountry());
    Thread.sleep(2000);
    chooseCountry.selectByVisibleText("India");
    //Shipping
    ShippingAddress.selectPincode().sendKeys("636116");
    ShippingAddress. selectShipmentMethod().click();
    ShippingAddress.shipmentApplyButton().click();
    Thread.sleep(3000);
}

@Test(priority=16,groups="Dinesh")
public void CellphoneAddtocartandWishlist() throws InterruptedException{
	cellphone.wishList().click();
	Thread.sleep(2000);
	cellphone.numberOfProducts().clear();
	cellphone.numberOfProducts().sendKeys("2");
	Thread.sleep(2000);
    cellphone.addToCart().click();
    Thread.sleep(2000);
    driver.navigate().to("https://demo.nopcommerce.com");
    Thread.sleep(3000);
    
    
    
    
}






@Test(priority=17,groups="Dinesh")
public void Wishlist() throws InterruptedException {
	String wishlistqty=wishlist.wishlistCount().getText();
	if(!wishlistqty.equals("(0)")) {
		assertTrue(true);
	}
	else
	{
		assertTrue(false);
	}
	Thread.sleep(3000);
   
    wishlist.goToWishList().click();
    
    js.executeScript("scrollBy(0, 300)"); 
    Thread.sleep(5000);
    js.executeScript("scrollBy(0, 300)"); 
    Thread.sleep(5000);
    
    
    
			 
	
}


@Test(priority=3,groups="Dinesh")
public void Comparelist() throws InterruptedException {
	notebook.Comp().click();
	Thread.sleep(2000);
	notebook.Note().click();
	Thread.sleep(2000);

    compare.appleMac13Compare().click();
   
    Thread.sleep(3000);
    compare.hpEnvy6Compare().click();
   
    Thread.sleep(3000);
    compare.productCompare().click();
    Thread.sleep(3000);
    
    js.executeScript("scrollBy(0, 400)"); 
    Thread.sleep(5000);
    js.executeScript("scrollBy(0, 125)"); 
    Thread.sleep(5000);
    driver.navigate().to("https://demo.nopcommerce.com/notebooks");
	
	
}

@Test(priority=18,groups="Bala")
public void Checkout() throws InterruptedException {
  String qty=check.cartqty().getText();
		  if(!qty.equals("(0)")) {
			  assertTrue(true);
		  }
		  else
		  {
			  assertTrue(false);
		  }
		  js.executeScript("scrollBy(0, 300)"); 
		    Thread.sleep(5000);
		    js.executeScript("scrollBy(0, 300)"); 
		    Thread.sleep(5000);
  check.clickOnShoping();
  Thread.sleep(3000);
  check.accept(); 
  check.checkOut();
  Thread.sleep(1000);
  cart.selectCountry();
  cart.entercity();
  cart.enterAddress1();
  cart.enterAddress2();
  cart.enterZip();
  cart.enterPhNumber();
  cart.enterFaxNumber();
  cart.clickContinue1();
  Thread.sleep(1000);
  cart.selectViaAirDay2();
  cart.clickContinue2();
  Thread.sleep(1000);
  cart.selectPaymentViaCreditCard();
  cart.clickContinue3();
  Thread.sleep(2000);
  cart.creditCardName();
  cart.creditHolderName();
  cart.creditCardNumber();
  cart.CardExpireMonth();
  cart.CardExpireYear();
  cart.CardCardCode();
  cart.clickContinue4();
  Thread.sleep(1000);
  cart.clickBackTo4();
  cart.selectPaymentViaCash();
  cart.clickContinue3();
  Thread.sleep(1000);
  cart.clickContinue4();
  Thread.sleep(1000);
  cart.clickContinue5();
  Thread.sleep(8000);
 }

@Test(priority=19,groups="Bala")
public void Screenshot() throws IOException, InterruptedException {
	File src=null;
	src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(src, new File("./Screenshot/"+"Checkout.png"));
}

@Test(priority=20,groups="Gowtham")
public void logout() {
	
	logMethod.logout().click();
	
}

@AfterTest
public void closeBrowser() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}

}