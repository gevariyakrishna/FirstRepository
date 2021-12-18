package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropEx {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebDriverWait elementwait = new WebDriverWait(driver,10);
		elementwait.until(ExpectedConditions.presenceOfElementLocated(By.id("droppable")));
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
		if((to.getText()).equals("Dropped!"))
		{
			System.out.println("Drag and drop is working properly");
		}

		
	}

}
