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
public class DoubleClick {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		WebElement box1 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
        // Clear the box1 and enter the text
		box1.clear();
		box1.sendKeys("Guna");
		
		// Double click
		Actions act = new Actions(driver);
		act.doubleClick(button);
		
		// Validation 
		
		String text = 
	}

}
