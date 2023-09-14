package IntegrationPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingAddress {
	WebDriver driver;
	public shippingAddress(WebDriver driver)
	{
		this.driver=driver;
	}
	By selectCountry=By.xpath("//select[@id='CountryId']");
	By selectPincode=By.xpath("//input[@id='ZipPostalCode']");
	By selectShipmentMethod=By.xpath("(//*[@class=\"estimate-shipping-row-item shipping-item\"])[4]");
	By shipmentApplyButton=By.xpath("//*[@class=\"button-2 apply-shipping-button\"]");
	
	public WebElement selectCountry()
	{
		return driver.findElement(selectCountry);
	}
	public WebElement selectPincode()
	{
		return driver.findElement(selectPincode);
	}
	public WebElement selectShipmentMethod()
	{
		return driver.findElement(selectShipmentMethod);
	}
	public WebElement shipmentApplyButton()
	{
		return driver.findElement(shipmentApplyButton);
    }
}