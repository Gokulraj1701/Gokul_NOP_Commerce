package downBarHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
	WebDriver driver;
	public search(WebDriver driver){
		this.driver=driver;
	}
	
	By searchClick=By.linkText("Search");
	By searchKeyword=By.xpath("//input[@id='q']");
	By searchButton=By.xpath("//button[@class='button-1 search-button']");
	
	
	public WebElement searchClick() {
		return driver.findElement(searchClick);
	}
	public WebElement searchKeyword() {
		return driver.findElement(searchKeyword);
	}
	public WebElement searchButton() {
		return driver.findElement(searchButton);
	}
	
}
