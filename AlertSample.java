package Week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertSample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simple=driver.switchTo().alert();
		simple.accept();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmation=driver.switchTo().alert();
		confirmation.accept();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promt=driver.switchTo().alert();
		
		
		promt.sendKeys("Abilash");
		promt.accept();
		WebElement result=driver.findElement(By.xpath("//span[@id='confirm_result']"));
		System.out.println(result.getText());
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
	}

}
