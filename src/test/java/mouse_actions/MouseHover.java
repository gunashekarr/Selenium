/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author 91895
 *
 */
public class MouseHover {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		WebElement desktopLink = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement macLink = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse Hover
		act.moveToElement(desktopLink).moveToElement(macLink).click().build().perform();
		
		//Sleep
		Thread.sleep(3000);
		
		driver.close();

	}

}
