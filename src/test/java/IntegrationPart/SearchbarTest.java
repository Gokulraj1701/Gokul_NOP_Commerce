package IntegrationPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchbarTest {
	WebDriver driver;
    public SearchbarTest(WebDriver driver) {
        this.driver=driver;
    }

    By searchBar=By.xpath("//*[@id='small-searchterms']");
    By enterKey=By.xpath("//*[@class='button-1 search-box-button']");
        public WebElement searchBar() {
        return driver.findElement(searchBar);
    }
    public WebElement search() {
        return driver.findElement(enterKey);
    }
	

}