package IntegrationPart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cellphones {
	WebDriver driver;
    public Cellphones(WebDriver driver){
        this.driver=driver;
    }

 

    By electronics=By.linkText("Electronics");
    By cellphone=By.linkText("Cell phones");
    By sortby=By.xpath("//*[@id='products-orderby']");
    By displayproducts=By.xpath("//*[@id='products-pagesize']");
    By display_asList=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div[1]/a[2]");
    By productinfo=By.linkText("HTC One M8 Android L 5.0 Lollipop");
    By numberofproducts=By.xpath("//*[@id='product_enteredQuantity_18']");
    By addToCart=By.xpath("//*[@id='add-to-cart-button-18']");
    By address=By.linkText("Please select the address you want to ship to");
    By country=By.xpath("//*[@id='CountryId']");
    By others=By.linkText("Other");
    By postalcode=By.xpath("//*[@id='ZipPostalCode']");
    By apply=By.xpath("//*[@id='estimate-shipping-popup-18']/div[5]/button");
    By shipping=By.xpath("//*[@id=\"estimate-shipping-popup-18\"]/div[4]/div[2]/div[2]/div[2]");
    By wishlist=By.xpath("//*[@id=\"add-to-wishlist-button-18\"]");
    By wishlistpath=By.xpath("//*[@id='bar-notification']/div/p/text()");
    By email=By.xpath("//*[@class='button-2 email-a-friend-button']");

 

    public WebElement electronics() {
        return driver.findElement(electronics);
    }

    public WebElement showCellPhones() {
        return driver.findElement(cellphone);
    }

 

    public WebElement sortBy() {
        return driver.findElement(sortby);
    }
    public WebElement displayProductsPerPage(){
        return driver.findElement(displayproducts);
    }
    public WebElement displayAsList() {
        return driver.findElement(display_asList);
    }

    public WebElement clickProduct() {
        return driver.findElement(productinfo);
    }
    public WebElement numberOfProducts() {
        return driver.findElement(numberofproducts);
    }
    public WebElement addToCart() {
        return driver.findElement(addToCart);
    }
    public WebElement enterAddress() {
        return driver.findElement(address);
    }
    public WebElement wishList() {
        return driver.findElement(wishlist);
    }
    public WebElement checkWishList() {
        return driver.findElement(wishlistpath);
    }
    
    public WebElement Email() {
    	return driver.findElement(email);
    }

}