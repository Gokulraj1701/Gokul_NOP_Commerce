package apparels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoes {

WebDriver driver;
	
	public shoes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	By apparelsClick=By.linkText("Apparel");
	By shoesClick=By.linkText("Shoes");
	By shoe1Click=By.linkText("adidas Consortium Campus 80s Running Shoes");
	By shoe2Click=By.linkText("Nike Floral Roshe Customized Running Shoes");
	By shoe3Click=By.linkText("\"Nike SB Zoom Stefan Janoski \\\"Medium Mint\\\"\"");
	By shoe1SizeSelection=By.xpath("//select[@id='product_attribute_9']");
	By shoe1colorSelection=By.xpath("//*[@class=\\\"attribute-square\\\"])[3]");
	By shoe1countSelection=By.xpath("//*[@id=\\\"product_enteredQuantity_25\\\"]");
	By shoe1AddtoCart=By.xpath("//*[@id=\\\"add-to-cart-button-25\\\"]");
	By shoe1WishList=By.xpath("//button[@id='add-to-wishlist-button-25']");
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement shoesSortBy;
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement shoesDisplayCount;
	@FindBy(xpath="(//button[@class='button-2 add-to-compare-list-button'])[1]")
	WebElement shoe1CompareListButton;
	By shoe1EmailAFriend=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button");
	By shoeEmailFriendEmail=By.xpath("//input[@id='FriendEmail']");
	By shoeEmailYourEmail=By.xpath("//input[@id='YourEmailAddress']");
	By shoeEmailPersonalMessage=By.xpath("//textarea[@id='PersonalMessage']");
	By shoeEmailSentButton=By.xpath("//button[@name='send-email']");
	public WebElement apparelsClick()
	{
		return driver.findElement(apparelsClick);
	}
	public WebElement shoesClick()
	{ 
		return driver.findElement(shoesClick);
		
	}
	public WebElement shoesSortBy()
	{
		return shoesSortBy;
	}
	public WebElement shoesDisplayCount()
	{
		return shoesDisplayCount;
	}
	public WebElement shoe1Click()
	{
		return driver.findElement(shoe1Click);
	}
	public WebElement shoe2Click()
	{
		return driver.findElement(shoe2Click);
	}
	public WebElement shoe3Click()
	{
		return driver.findElement(shoe3Click);
	}
	public WebElement shoe1SizeSelection()
	{
		return driver.findElement(shoe1SizeSelection);
	}
	public WebElement shoe1colorSelection()
	{
		return driver.findElement(shoe1colorSelection);
	}
	public WebElement shoe1countSelection()
	{
		return driver.findElement(shoe1countSelection);
	}
	public WebElement shoe1AddtoCart()
	{
		return driver.findElement(shoe1AddtoCart);
	}
	public WebElement shoe1WishList()
	{
		return driver.findElement(shoe1WishList);
	}
	public WebElement shoe1CompareListButton()
	{
		return shoe1CompareListButton;
	}
	
	public WebElement shoe1EmailAFriend()
	{
		return driver.findElement(shoe1EmailAFriend);
	}
	public WebElement shoeEmailFriendEmail()
	{
		return driver.findElement(shoeEmailFriendEmail);
	}
	
	public WebElement shoeEmailYourEmail()
	{
		return driver.findElement(shoeEmailYourEmail);
	}
	public WebElement shoeEmailPersonalMessage()
	{
		return driver.findElement(shoeEmailPersonalMessage);
	}
	public WebElement shoeEmailSentButton()
	{
		return driver.findElement(shoeEmailSentButton);
	}
}
