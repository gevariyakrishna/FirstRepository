package MavenProject.MyFirstMaven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitchEx {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		//Creat Window Handles
		Set<String> WindowHandle = driver.getWindowHandles();
		Iterator<String> it = WindowHandle.iterator();
		
		String first = it.next();
		String second = it.next();
		String third = it.next();
		String fourth = it.next();
		
		System.out.println(first);
	    System.out.println(second);
	    System.out.println(third);
	    System.out.println(fourth);
	    
	    Thread.sleep(2000);
	    driver.switchTo().window(third);
	    
	}

}
