package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Check 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin") ;           
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager") ;
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click() ;
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click() ;
		
		Thread.sleep(2000);	
		
		
		
	    List<WebElement> names=driver.findElements(By.xpath("//div[@class='label']"));
	    
	    System.out.println(names.size());
	    
	    for (int i=0;i<=names.size()-1;i++)
	    {
	         System.out.println(names.get(i).getText());
	         
	    }
	    
	    List<WebElement> links=driver.findElements(By.xpath("//a"));
	    
        System.out.println(links.size());
	    
	    for (int i=0;i<=links.size()-1;i++)
	    {
	    	if(!links.get(i).getText().startsWith(" "));
	    	{
	    		if(links.get(i).getText()!=" ");
	    		{	
	    			System.out.println(links.get(i).getText().trim());
	    		}
	    				
	    	}
	         System.out.println(links.get(i).getText());
	     }
		
	    List<WebElement> checkbox =driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	    
	    System.out.println(checkbox.size());
	    
	    for (int i=0;i<=checkbox .size()-1;i++)
	    {
	    	if(!checkbox.get(i).isSelected());
	    	{
	    	 checkbox.get(i).click();
	    	 
	    	
	    	}
	     }
	   
		
		
		
		
		
		

	}

}
