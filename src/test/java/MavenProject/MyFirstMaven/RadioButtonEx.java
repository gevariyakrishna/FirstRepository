package MavenProject.MyFirstMaven;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonEx {

	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> radio = driver.findElements(By.name("sex"));
		int a = radio.size();
		
		System.out.println("Number of radio button is "+a);
		
		for(int i=0;i<a;i++)
		{
			String ValAtt = radio.get(i).getAttribute("value");
			System.out.println("Value attribute :" +ValAtt);
		}
		System.out.println(radio.get(0).getAttribute("checked"));
		
		radio.get(0).click();
	    System.out.println(radio.get(0).getAttribute("checked"));
		radio.get(1).click();
	    System.out.println(radio.get(1).getAttribute("checked"));
	    radio.get(2).click();
	    System.out.println(radio.get(2).getAttribute("checked"));
	    
	    int temp = 0;
	    for(int i=0;i<a;i++)
	    {
	    	if(radio.get(i).isSelected())
	    	{
	    		temp++;
	    	}
	    }
	    if(temp>1)
	    {
	    	System.out.println("Radio button is not working properly");
	    }
	    else
	    {
	    	System.out.println("Radio button is working properly");
	    }
		
		driver.close();
	}

}
