package MavenProject.MyFirstMaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticularBlockLink 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.lulus.com/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		
		//Links of page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int a = links.size();
		System.out.println("Number of links in page: "+a);	
		
		
		//Links of Particular Box
		WebElement Block = driver.findElement(By.xpath("//*[@id=\"site-footer-v2\"]/div"));
		List<WebElement> Blocklinks = Block.findElements(By.tagName("a"));
		int b = Blocklinks.size();
		
		System.out.println("Number of links in page: "+b);
		
		for(int i=0;i<b;i++)
		{
			System.out.println("Name of link "+i+": "+Blocklinks.get(i).getText());
		}
		
		driver.close();
		
	}

}
