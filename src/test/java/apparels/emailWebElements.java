package apparels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class emailWebElements {
	WebDriver driver;
	public emailWebElements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By EmailFriendEmail=By.xpath("//input[@id='FriendEmail']");
	By EmailYourEmail=By.xpath("//input[@id='YourEmailAddress']");
	By EmailPersonalMessage=By.xpath("//textarea[@id='PersonalMessage']");
	By EmailSentButton=By.xpath("//button[@name='send-email']");
	public WebElement EmailFriendEmail()
	{
		return driver.findElement(EmailFriendEmail);
	}
	public WebElement EmailYourEmail()
	{
		return driver.findElement(EmailYourEmail);
	}
	public WebElement EmailPersonalMessage()
	{
		return driver.findElement(EmailPersonalMessage);
	}
	public WebElement EmailSentButton()
	{
		return driver.findElement(EmailSentButton);
	}
}
