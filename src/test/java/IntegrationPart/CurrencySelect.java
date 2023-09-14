package IntegrationPart;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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