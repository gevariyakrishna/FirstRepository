package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage 
{
	@FindBy(name="q")
	WebElement SearchBox;
	
	@FindBy(name="btnK")
	WebElement SearchButton;
	
	WebDriver driver;
	
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void search(String text)
	{
		SearchBox.sendKeys(text);
		SearchButton.submit();
	}

}
