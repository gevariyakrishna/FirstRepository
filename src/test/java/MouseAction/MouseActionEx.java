package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionEx 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		
		Actions act = new Actions(driver); 

		WebElement Menu = driver.findElement(By.className("nav-line-1-container"));
		WebElement SubMenu = driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[13]/span"));		
		
//		Action down = act.contextClick(Menu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
//		down.perform();
//		Thread.sleep(4000);
//		
		act.moveToElement(Menu).perform();
		Thread.sleep(2000);
		SubMenu.click();
		
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title is :"+title);
		Thread.sleep(3000);

		WebElement text = driver.findElement(By.xpath("/html/body/div/music-app/div[3]/div/div/div/music-container/music-container[1]/div/music-shoveler//div/header/div[1]/h2"));
		System.out.println("Head Text is :"+text.getText());
		Thread.sleep(3000);
		
		driver.close();
	}

}
