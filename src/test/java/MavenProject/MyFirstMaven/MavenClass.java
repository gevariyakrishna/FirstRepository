package MavenProject.MyFirstMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenClass 
{
    WebDriver wd;
	
	void chromesetup()
	{
		// connect chrome drive with java file
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32");
		
		// connect chrome drive with maven
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
	}
	
	void firefoxsetup()
	{
		// connect firefox drive with java file
		//System.setProperty("webdriver.gecko.driver", "C:\Selenium\geckodriver-v0.29.1-win64");
			
		// connect firefox drive with maven
		WebDriverManager.firefoxdriver().setup();
		wd = new FirefoxDriver();
	}
	
	void indeed()
	{
		//through java file
		//wd.get("https://www.indeed.com/");
		
		//through maven
		wd.navigate().to("https://www.indeed.com/");
		
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String ExpectedTitle = "Job Search | Indeed";
		String ActualTitle = wd.getTitle();
		System.out.println("Actual title is : "+ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Actual title is matched with Expected title");
		}
		else
		{
			System.out.print("Actual title does not matched with Expected title");
		}
		
		//find by id
		//WebElement WhatTextBox = wd.findElement(By.id("text-input-what"));
		
		//find by name
		//WebElement WhatTextBox = wd.findElement(By.name("q"));
		
		//find by classname
		//WebElement WhatTextBox = wd.findElement(By.className("icl-TextInput-control"));
		
		//find by tagname
		//WebElement WhatTextBox = wd.findElement(By.tagName("input"));
		
		//find by css selector through id
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input#text-input-what"));
		
		//find by css selector through class
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input.icl-TextInput-control"));	
		
		//find by css selector through attribute
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input[name=q]"));
		
		//find by css selector throught id/class and attribute
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input#text-input-what[name=q]"));
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input.icl-TextInput-control[name=q]"));
		
		//css selector with starts with
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input[type^=tex]"));
				
		//css selector with ends with
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input[type$=at]"));
				
		//css selector with contains as 
		//WebElement WhatTextBox = wd.findElement(By.cssSelector("input[type*=ex]"));
				
		// through absolute xpath
		//WebElement WhatTextBox = wd.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/div/div/div/form/div[1]/div[1]/div/div[2]/input"));
				
		// through relative xpath	
		//WebElement WhatTextBox = wd.findElement(By.xpath("//*[@id=\"text-input-what\"]"));
				
		//through attribute xpath 
		//WebElement WhatTextBox = wd.findElement(By.xpath("//input[@name='q'][@id='text-input-what']"));
				
		//through attribute xpath and/or
		//WebElement WhatTextBox = wd.findElement(By.xpath("//input[@name='q1' or @id='text-input-what']"));
								
		//through attribute xpath contains
		//WebElement WhatTextBox = wd.findElement(By.xpath("//input[contains(@name,'q')]"));
				
		// through attribute starts with
		//WebElement WhatTextBox = wd.findElement(By.xpath("//input[starts-with(@id,'text')]"));		
		//WhatTextBox.sendKeys("Automation");
		
		// through attribute using last
		//WebElement WhatTextBox = wd.findElement(By.xpath("(//input[@type='text'])[last()]"));		
		//WhatTextBox.sendKeys("Seattle");
				
		wd.findElement(By.id("text-input-what")).sendKeys("Python");
		
		wd.findElement(By.id("text-input-where")).clear();
		wd.findElement(By.id("text-input-where")).sendKeys("Seattle");
		
		//WebElement FindJobsButton = wd.findElement(By.className("icl-Button"));
		//FindJobsButton.submit();
		wd.findElement(By.className("icl-Button")).submit();
		
		String CurrentUrl1 = wd.getCurrentUrl();
		System.out.println("Current URL before :"+CurrentUrl1);
		
		//WebElement AdvanceJobSearchLink = wd.findElement(By.linkText("Advanced Job Search"));
		//AdvanceJobSearchLink.click();
		wd.findElement(By.linkText("Advanced Job Search")).click();	
		
		String CurrentUrl2 = wd.getCurrentUrl();
		System.out.println("Current URL after :"+CurrentUrl2);
		
		wd.navigate().back();		
		wd.navigate().forward();
		wd.navigate().refresh();
		
		WebElement TextBox = wd.findElement(By.id("as_and"));
		String textvalue = TextBox.getText(); 
		System.out.println("Text is : "+textvalue);
		
		String tagname = TextBox.getTagName();
		System.out.println("TagName is : "+tagname);
		
		String CssValue = TextBox.getCssValue("background-color");
		System.out.println("Css Value is : "+CssValue);
		
		String AttVal = TextBox.getAttribute("name");
		System.out.println("Attrivalue for current text box :"+AttVal);
		
		Dimension Size = TextBox.getSize();
		System.out.println("Height:"+Size.height+ " and " +"Width:"+Size.width);
		
		Point Location = TextBox.getLocation();
		System.out.println("X cordinate:" +Location.x+ " and " +"Y cordinate:"+Location.y);
		
	    TextBox.clear();
		
		//String PageSource = wd.getPageSource();
		//System.out.println("Page Source is :"+PageSource);

		
		//wd.close();
	}
	
	public static void main(String str[])
	{
		MavenClass mv = new MavenClass();
		mv.chromesetup();
		//mv.firefoxsetup();
		mv.indeed();
	}

    
}
