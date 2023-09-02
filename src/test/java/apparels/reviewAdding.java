package apparels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reviewAdding {
	WebDriver driver;
	public reviewAdding(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By reviewTitle=By.xpath("//input[@id='AddProductReview_Title']");
	By reviewText=By.xpath("//*[@id=\"AddProductReview_ReviewText\"]");
	By rating=By.xpath("//*[@id=\"addproductrating_3\"]");
	By ratingSubmitButton=By.xpath("//*[@class=\"button-1 write-product-review-button\"]");
	
	public WebElement reviewTitle()
	{
		return driver.findElement(reviewTitle);
	}
	public WebElement reviewText()
	{
		return driver.findElement(reviewText);
	}
	public WebElement rating()
	{
		return driver.findElement(rating);
	}
	public WebElement ratingSubmitButton()
	{
		return driver.findElement(ratingSubmitButton);
	}
}
