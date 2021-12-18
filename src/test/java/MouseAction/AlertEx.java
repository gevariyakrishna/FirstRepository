package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.id("alertButton"));
		if(!(button.isDisplayed()))
		{
			driver.navigate().refresh();
		}
		
		button.click();
		Alert A1 = driver.switchTo().alert();	
		Thread.sleep(1000);
		System.out.println(A1.getText());
		A1.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert A2 = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(A2.getText());
		A2.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Alert A3 = driver.switchTo().alert();
		Thread.sleep(1000);
		A3.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("promtButton")).click();
		Alert A4 = driver.switchTo().alert();
		A4.sendKeys("STAD Solution");
		Thread.sleep(2000);
		A4.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());

	}

}
