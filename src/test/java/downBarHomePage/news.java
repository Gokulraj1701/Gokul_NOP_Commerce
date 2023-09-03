package downBarHomePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class news {
	WebDriver driver;
  public news(WebDriver driver)
  {
	  this.driver=driver;
  }
  By newsClick=By.linkText("News");
  By newsDetailsButton=By.xpath("(//a[@class='read-more'])[1]");
  By newsCommentTitle=By.xpath("//input[@id='AddNewComment_CommentTitle']");
  By newsCommentText=By.xpath("//textarea[@id='AddNewComment_CommentText']");
  By newsCommentButton=By.xpath("//button[@class='button-1 news-item-add-comment-button']");
  
  public WebElement newsClick() {
	  return driver.findElement(newsClick);
  }
  public WebElement newsDetailsButton() {
	  return driver.findElement(newsDetailsButton);
  }
  public WebElement newsCommentTitle() {
	  return driver.findElement(newsCommentTitle);
  }
  public WebElement newsCommentText() {
	  return driver.findElement(newsCommentText);
  }
  public WebElement newsCommentButton() {
	  return driver.findElement(newsCommentButton);
  }
}
