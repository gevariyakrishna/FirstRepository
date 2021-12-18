package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement doubleclickButton = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightclickButton = driver.findElement(By.id("rightClickBtn"));
		WebElement clickButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));

		
		Actions act = new Actions(driver);
		
		//Double Click
		act.doubleClick(doubleclickButton).build().perform();
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		Thread.sleep(2000);
		
		//Double Click
		act.contextClick(rightclickButton).build().perform();
		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		Thread.sleep(2000);

		//Click
		act.click(clickButton).build().perform();
		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());

	}
}
