package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		GooglePage page = PageFactory.initElements(driver, GooglePage.class);
		
		page.search("Stad Solution");
	}

}
