package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");	
		WebElement Un = driver.findElement(By.xpath("//input[@type='text']"));
	
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']")) ;
	
		WebElement chkbx = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		WebElement click = driver.findElement(By.xpath("//a[@id='loginButton']")) ;
		
		Thread.sleep(2000);
		
		Un.sendKeys("admin") ;
		pwd.sendKeys("manager");
		chkbx.click();
		click.click();
		
		
		
      

	}

}
