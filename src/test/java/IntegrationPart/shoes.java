package IntegrationPart;

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
			By shoe1SizeSelection=By.xpath("//select[@id='product_attribute_9']");
			By shoe1colorSelection=By.xpath("(//*[@class=\"attribute-square\"])[3]");
			By shoe1ReviewClick=By.linkText("Add your review");
			By shoe1countSelection=By.xpath("//*[@id='product_enteredQuantity_25']");
			
			By shoe1ShippingClick=By.xpath("//*[@id=\"open-estimate-shipping-popup-25\"]/span");
			
			By shoe1AddtoCart=By.xpath("//*[@id='add-to-cart-button-25']");
			By shoe1WishList=By.xpath("//button[@id='add-to-wishlist-button-25']");
			@FindBy(xpath="//select[@id='products-orderby']")
			WebElement shoesSortBy;
			@FindBy(xpath="//select[@id='products-pagesize']")
			WebElement shoesDisplayCount;
			@FindBy(xpath="(//button[@class='button-2 add-to-compare-list-button'])[1]")
			WebElement shoe1CompareListButton;
			By shoe1EmailAFriend=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button");
			
			
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
			public WebElement shoe1SizeSelection()
			{
				return driver.findElement(shoe1SizeSelection);
			}
			public WebElement shoe1colorSelection()
			{
				return driver.findElement(shoe1colorSelection);
			}
			public WebElement shoe1ReviewClick()
			{
				return driver.findElement(shoe1ReviewClick);
			}
			public WebElement shoe1countSelection()
			{
				return driver.findElement(shoe1countSelection);
			}
			public WebElement shoe1ShippingClick()
			{
				return driver.findElement(shoe1ShippingClick);
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
			
			

}