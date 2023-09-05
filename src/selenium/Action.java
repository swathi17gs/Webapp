package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();												 
		driver.get("http://127.0.0.1/login.do");	 										 
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin") ;           
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager") ;
		
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click() ;
		
		Thread.sleep(2000);
   
	    Actions act = new Actions(driver);
	    WebElement Users=driver.findElement(By.linkText("Users"));
	    act.moveToElement(Users).perform();
	    
	    												//	    act.doubleClick().perform();
	    												//    act.doubleClick(Users).perform();
	          // RIGHT CLICK //
	    
	    act.contextClick(Users).perform();                           
	    											    // keyboard & Mouse ACtions //
	    Robot rbt=new Robot();
	    rbt.keyPress(KeyEvent.VK_DOWN);
	    rbt.keyPress(KeyEvent.VK_DOWN);
	    rbt.keyPress(KeyEvent.VK_DOWN);
	    rbt.keyPress(KeyEvent.VK_ENTER);
	    
	   // WINDOWHANDLING //
	    
	    Set<String> s=driver.getWindowHandles();
	    Iterator<String> it= s.iterator();
	    
	       String parent=it.next();
	       String child=it.next();
	       System.out.println(parent);
	       System.out.println(child);
	      driver.switchTo().window(child);
	      driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	      
	
	    
	    
		
		
		
	}

}
