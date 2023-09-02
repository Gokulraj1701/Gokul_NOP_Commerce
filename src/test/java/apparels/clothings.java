package apparels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clothings {
	
	WebDriver driver;
	
	public clothings(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clothingsClick =By.linkText("Clothing");
	By clothings1Click=By.linkText("Nike Tailwind Loose Short-Sleeve Running Shirt");
	By clothing1SizeSelection=By.xpath("//*[@id=\"product_attribute_11\"]");
	By clothing1CountSelection=By.xpath("//input[@id='product_enteredQuantity_27']");
	By clothing1ShippmentAddress=By.xpath("//*[@id=\"open-estimate-shipping-popup-27\"]/span");
	By clothing1AddtoCart=By.xpath("//button[@id='add-to-cart-button-27']");
	By clothing1AddtoWishlist=By.xpath("//button[@id='add-to-wishlist-button-27']");
	By clothing1AddtoCompareList=By.xpath("//button[@class='button-2 add-to-compare-list-button']");
	By clothing1EmailaFriend=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button");
	By clothing1review =By.linkText("Add your review");
	
	public WebElement clothingsClick(){
		return driver.findElement(clothingsClick);
	}
	public WebElement clothings1Click(){
		return driver.findElement(clothings1Click);
	}
	public WebElement clothing1SizeSelection(){
		return driver.findElement(clothing1SizeSelection);
	}
	public WebElement clothing1CountSelection(){
		return driver.findElement(clothing1CountSelection);
	}
	public WebElement clothing1review(){
		return driver.findElement(clothing1review);
	}
	public WebElement clothing1ShippmentAddress(){
		return driver.findElement(clothing1ShippmentAddress);
	}
	
	public WebElement clothing1AddtoCart(){
		return driver.findElement(clothing1AddtoCart);
	}
	public WebElement clothing1AddtoWishlist(){
		return driver.findElement(clothing1AddtoWishlist);
	}
	public WebElement clothing1AddtoCompareList(){
		return driver.findElement(clothing1AddtoCompareList);
	}
	public WebElement clothing1EmailaFriend(){
		return driver.findElement(clothing1EmailaFriend);
	}
	

	
	
	
}
