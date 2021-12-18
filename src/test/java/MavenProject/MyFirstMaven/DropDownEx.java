package MavenProject.MyFirstMaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEx {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement DropBox = driver.findElement(By.id("month"));
		
		Select drop = new Select(DropBox);
		
		List<WebElement> options = drop.getOptions();
		int size = options.size();
		System.out.println("Number elements in dropdown list :"+size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(options.get(i).getAttribute("value") + ": " +options.get(i).getText());
		}
		
		drop.selectByIndex(5);
		Thread.sleep(1000);
		
		drop.selectByValue("11");
		Thread.sleep(1000);
		
		drop.selectByVisibleText("Mar");
		Thread.sleep(1000);
		
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN);
		
		//Actions builder = new Actions(driver);
		//Action MultipleSelect = builder.keyDown(Keys.CONTROL).click(options.get(7)).click(options.get(9)).build();
		//MultipleSelect.perform();	
		
		for(int i=0;i<size;i++)
		{
			if(options.get(i).isSelected())
			{
				System.out.println("selected element is: "+options.get(i).getText());
			}
		}
		
		//driver.close();
	}

}
