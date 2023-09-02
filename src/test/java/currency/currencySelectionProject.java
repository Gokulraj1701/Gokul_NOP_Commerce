package currency;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class currencySelectionProject {

	WebDriver driver;
	CurrencySelect Currencyobj;
	@SuppressWarnings("deprecation")
	@Test(priority=0,enabled=true)
	public void currency() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Currencyobj=new CurrencySelect(driver);
		Thread.sleep(3000);
		Select selcurrency=new Select(Currencyobj.Currency());
		selcurrency.selectByVisibleText("Euro");
		Thread.sleep(3000);
		selcurrency.selectByVisibleText("US Dollar");
	}
}
