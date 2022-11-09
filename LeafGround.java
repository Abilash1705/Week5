package Week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		   driver.manage().window().maximize();
		   driver.switchTo().frame(0);
		    driver.findElement(By.id("Click")).click();
		   
		    
		    
		    
		    
		   driver.switchTo().frame(1).switchTo().frame(0);
		   
		   driver.findElement(By.id("Click1")).click();
		   
		   
	}

}
