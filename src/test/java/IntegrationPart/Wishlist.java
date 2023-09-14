package IntegrationPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wishlist {
	WebDriver driver;
    public Wishlist(WebDriver driver) {
        this.driver=driver;
    }

    
    By Wishlist=By.xpath("//span[@class=\"wishlist-label\"]");
    By Wishlistcount=By.xpath("//span[@class='wishlist-qty']");
   
    public WebElement goToWishList() {
        return driver.findElement(Wishlist);
    }
    
    public WebElement wishlistCount() {
    	return driver.findElement(Wishlistcount);
    }
   

}
