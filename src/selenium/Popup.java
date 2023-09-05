package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();												 // mimimise , maximise window 
		driver.get("http://127.0.0.1/login.do");	 										 // get()= url
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin") ;            //findElement = locators + web element
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager") ;
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click() ;
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click() ;
		Thread.sleep(2000);	
		
		
		// WINDOW POPUP //
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		Thread.sleep(2000);	

         driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
         
        driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
        
        WebElement Choosefile= driver.findElement(By.xpath("(//input[@type='file'])[1]"));
         
         Actions act= new Actions(driver);
         if(Choosefile.isEnabled())
         {
        	 act.click(Choosefile).perform();
        	 Thread.sleep(2000);
         }
         
        Runtime.getRuntime().exec(".upload/upload.exe");
         
         
	}

}
