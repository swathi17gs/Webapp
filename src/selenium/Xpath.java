package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();												 // mimimise , maximise window 
		driver.get("http://127.0.0.1/login.do");	 										 // get()= url
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin") ;            //findElement = locators + web element
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager") ;
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click() ;
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click() ;
		Thread.sleep(2000);																	 //sleep - holds time in milliseconds 

																				// close the program
		
		driver.navigate().back();															// back arrow , frwrd arrow , refresh the page 
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}

}
