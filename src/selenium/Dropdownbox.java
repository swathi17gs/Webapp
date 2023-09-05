
package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 class Dropdownbox
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
		//sel.selectByValue(null);   
		// sel.selectByIndex(0);
		
		// driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		//sel.getOptions();
		driver.findElement(By .xpath("(//input[@type='button'])[6]")).click();	
			
		
		Alert alt=driver.switchTo().alert();
	   System.out.println(alt.getText());
	   Thread.sleep(2000);
        Alert alt1 =driver.switchTo().alert();
        alt1.accept();
	}

}

