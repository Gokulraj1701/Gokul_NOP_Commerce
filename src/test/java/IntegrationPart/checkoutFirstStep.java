package IntegrationPart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutFirstStep {
	WebDriver driver;
    public checkoutFirstStep(WebDriver driver) {
           this.driver = driver;
           PageFactory.initElements(driver, this);
       }

    @FindBy(xpath="//*[@id=\"checkout_attribute_1\"]")
    WebElement giftWrap;
    @FindBy(xpath="//*[@id=\"termsofservice\"]")
    WebElement termsAndConditions;
    @FindBy(xpath="//*[@id=\"checkout\"]")
    WebElement checkOut;
    @FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement shoppingClick;
    @FindBy(xpath="//span[@class='cart-qty']")
    WebElement qty;
    
    public void clickOnShoping() {
    	shoppingClick.click();
    }
    public void accept() {
        termsAndConditions.click();
    }
    public void checkOut() {
        checkOut.click();
    }
    public WebElement cartqty() {
    	return qty;
    }

}
