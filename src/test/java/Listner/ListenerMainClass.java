package Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenerMainClass {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		EventFiringWebDriver EventHandler = new EventFiringWebDriver(driver);
		
		EventCapture Ecap = new EventCapture();
		
		EventHandler.register(Ecap);
		
		EventHandler.get("https://www.google.com/");
		
		WebElement searchbox = EventHandler.findElement(By.name("q"));
		searchbox.sendKeys("Automation");
		searchbox.submit();
		
		System.out.println(EventHandler.getTitle());
		Thread.sleep(2000);
		
		EventHandler.navigate().back();
		Thread.sleep(2000);
		
		EventHandler.navigate().forward();
		
		
		EventHandler.unregister(Ecap);
		driver.quit();
		
	}

}
