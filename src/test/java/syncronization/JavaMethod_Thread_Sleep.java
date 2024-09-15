/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * Thread.sleep(5000) - Pause the execution for specified seconds( 5 seconds ).
 * Thread.Sleep() is a java method
 * 
 * Adv : Easy to Use
 * 
 * Disadv 
 * 1) If the time is not sufficient then you will get exception
 * 2) It will wait for maximum time out, this will reduce the performance script
 * 3) Multiple times need to use
 */
public class JavaMethod_Thread_Sleep {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Guna");
		driver.close();

	}

}
