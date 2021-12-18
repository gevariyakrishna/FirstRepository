package MavenProject.MyFirstMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelKeyBoardAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("btnK")).submit();
		
		//driver.findElement(By.id("voiceSearchButton")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("q")).sendKeys("Selenium-Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("q")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		//driver.findElement(By.name("q")).sendKeys(Keys.ARROW_UP);
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);


	}

}
