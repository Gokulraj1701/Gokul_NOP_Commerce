package currency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrencySelect {
	WebDriver driver;
	public CurrencySelect(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By CurrencySelector=By.xpath("//select[@id='customerCurrency']");
	public WebElement Currency()
	{
		return driver.findElement(CurrencySelector);
	}	
	
}
