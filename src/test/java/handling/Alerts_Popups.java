/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * Selenium Alerts - 3 Types ( Normal alert, Confirmation alert & prompting alert)
 * 
 * Alert windows are not web elements, can't locate the webelements
 */
public class Alerts_Popups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        //Handle simple normal alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        String alertMsg = driver.switchTo().alert().getText();
        System.out.println("Simple Alert Message : "+alertMsg);
        driver.switchTo().alert().accept();
        
        //Handle confirmation  alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        String alertMsg1 = driver.switchTo().alert().getText();
        System.out.println("Confirmation Alert Message : "+alertMsg1);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        
        //Handle Prompting  alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        String alertMsg2 = driver.switchTo().alert().getText();
        System.out.println("Confirmation Alert Message : "+alertMsg2);
        driver.switchTo().alert().sendKeys("Guna Testing");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        
        //Closing the browser
        driver.close();

	}

}
