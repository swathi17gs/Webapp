package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Run 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin") ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager") ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click() ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click() ;
		Thread.sleep(2000);
		
		driver.findElement(By.className("tasks")).click();
		
		driver.findElement(By.linkText("Projects & Customers")).click();
		
		WebElement customer = driver.findElement(By.name("selectedCustomer"));
		
		Select sel=new Select(customer);
		
		sel.selectByVisibleText("Internal");
		
		sel.getOptions();
		driver.findElement(By .xpath("(//input[@type='button'])[6]")).click();
		
		
						
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
//driver.findElement(By.name("username")).sendKeys("admin");	
//driver.findElement(By.name("pwd")).sendKeys("manager");
//driver.findElement(By.id("LoginButton")).click();