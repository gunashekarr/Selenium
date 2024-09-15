/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 *
 * implictlyWait() = 
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
 * 
 */
public class ImplicitlyWait {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Guna");
		driver.close();

	}

}
