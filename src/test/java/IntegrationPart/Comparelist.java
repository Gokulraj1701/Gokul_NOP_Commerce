package IntegrationPart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Comparelist {
	WebDriver driver;
    By appleMacBook13CompareButton=By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[1]");
    By HpEnvy6CompareButton=By.xpath("(//*[@class='button-2 add-to-compare-list-button'])[3]");
    By productCompare=By.linkText("product comparison");

    public Comparelist(WebDriver driver){
        this.driver=driver;
    }

    public WebElement appleMac13Compare() {
        return driver.findElement(appleMacBook13CompareButton);
    }

    public WebElement hpEnvy6Compare() {
        return driver.findElement(HpEnvy6CompareButton);
    }

    public WebElement productCompare() {
        return driver.findElement(productCompare);
    }
}