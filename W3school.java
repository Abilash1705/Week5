package Week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3school {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	   driver.manage().window().maximize();
	   driver.switchTo().frame("iframeResult");
	   driver.findElement(By.xpath("//button[text()='Try it']")).click();
	 Alert prompt=driver.switchTo().alert();
	   prompt.sendKeys("Abilash");
	   prompt.accept();
	   String name=driver.findElement(By.id("demo")).getText();
	   driver.switchTo().defaultContent();
	   System.out.println(name);
	   driver.navigate().to("https://www.google.com/");
	   
	   
	  
	   

	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	

}
