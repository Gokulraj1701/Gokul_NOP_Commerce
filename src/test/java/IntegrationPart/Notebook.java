package IntegrationPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Notebook {
	WebDriver driver;
	
	public Notebook(WebDriver driver)
	{
		this.driver=driver;
    }
	
	By computer=By.linkText("Computers");
	By note=By.linkText("Notebooks");
	By position=By.id("products-orderby");
	By display=By.id("products-pagesize");
	By list=By.linkText("List");
	By cputype=By.id("attribute-option-7");
	By memory=By.id("attribute-option-10");
	By product=By.linkText("Asus N551JK-XO076H Laptop");
	By quantity=By.id("product_enteredQuantity_5");
	By addtocart=By.id("add-to-cart-button-5");
	By address=By.xpath("//*[@id=\"open-estimate-shipping-popup-5\"]/span");
	By country=By.id("CountryId");
	By zipcode=By.id("ZipPostalCode");
	By shippingmethod=By.xpath("//*[@id=\"estimate-shipping-popup-5\"]/div[4]/div[2]/div[2]/div[1]/label");
	By apply=By.xpath("//*[@id=\"estimate-shipping-popup-5\"]/div[5]/button");
	By wishlist=By.id("add-to-wishlist-button-5");
	By comparelist=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button");
	By email=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button");
	By friendemail=By.name("FriendEmail");
	By emailadd=By.name("YourEmailAddress");
	By personalmsg=By.name("PersonalMessage");
	By sendemail=By.name("send-email");
	
	public WebElement Comp() {
		return driver.findElement(computer);
	}
	
	public WebElement Note() {
		return driver.findElement(note);
	}
	
	public WebElement Pos() {
		return driver.findElement(position);
	}
	
	public WebElement Disp() {
		return driver.findElement(display);
	}
	
	public WebElement List() {
		return driver.findElement(list);
	}
	
	public WebElement CPUtype() {
		return driver.findElement(cputype);
	}
	
	public WebElement Memory() {
		return driver.findElement(memory);
	}
	
	public WebElement Pro() {
		return driver.findElement(product);
	}
	
	public WebElement Address()
	{
		return driver.findElement(address);
	}
	
	public WebElement Country()
	{
		return driver.findElement(country);
	}
	
	public WebElement Zipcode()
	{
		return driver.findElement(zipcode);
	}
	
	public WebElement Shippingmethod()
	{
		return driver.findElement(shippingmethod);
	}
	
	public WebElement Apply()
	{
		return driver.findElement(apply);
	}
	
	public WebElement Quantity()
	{
		return driver.findElement(quantity);
	}
	
	public WebElement Wishlist()
	{
		return driver.findElement(wishlist);
	}
	
	public WebElement Comparelist()
	{
		return driver.findElement(comparelist);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Friendemail()
	{
		return driver.findElement(friendemail);
	}
	
	public WebElement Emailaddress()
	{
		return driver.findElement(emailadd);
	}
	
	public WebElement Personalmsg()
	{
		return driver.findElement(personalmsg);
	}
	
	public WebElement Sendemail()
	{
		return driver.findElement(sendemail);
	}
	
	public WebElement Addtocart()
	{
		return driver.findElement(addtocart);
	}
}
