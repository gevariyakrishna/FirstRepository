package MouseAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,100)");
		
	}

}
