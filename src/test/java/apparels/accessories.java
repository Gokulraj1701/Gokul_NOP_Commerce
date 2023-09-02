package apparels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accessories {
	WebDriver driver;
	public accessories(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By accessoriesSelect=By.linkText("Accessories");
	By accessoriesBelt=By.linkText("Reversible Horseferry Check Belt");
	By beltReview=By.linkText("Add your review");
	By beltCount=By.xpath("//input[@id='product_enteredQuantity_32']");
	By beltShipping=By.xpath("//*[@id=\"open-estimate-shipping-popup-32\"]/span");
	By beltAddtoCart=By.xpath("//button[@id='add-to-cart-button-32']");
	By beltAddtoWishList=By.xpath("//button[@id='add-to-wishlist-button-32']");
	By beltAddtoComparedList=By.xpath("//button[@class='button-2 add-to-compare-list-button']");
	By beltEmailaFriend=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button");
	By Home=By.linkText("Home");
	public WebElement accessoriesSelect(){
		return driver.findElement(accessoriesSelect);
	}
	public WebElement accessoriesBelt() {
		return driver.findElement(accessoriesBelt);
	}
	public WebElement beltReview() {
		return driver.findElement(beltReview);
	}
	public WebElement beltShipping() {
		return driver.findElement(beltShipping);
	}
	public WebElement beltCount() {
		return driver.findElement(beltCount);
	}
	public WebElement beltAddtoCart() {
		return driver.findElement(beltAddtoCart);
	}
	public WebElement beltAddtoWishList() {
		return driver.findElement(beltAddtoWishList);
	}
	public WebElement beltAddtoComparedList() {
		return driver.findElement(beltAddtoComparedList);
	}
	public WebElement beltEmailaFriend() {
		return driver.findElement(beltEmailaFriend);
	}
	public WebElement Home() {
		return driver.findElement(Home);
	}
	
	
	
	
}
