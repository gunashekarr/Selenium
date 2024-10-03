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
public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copyButton = driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
		
		//Right Click
		Actions act = new Actions(driver);
		act.contextClick(rightClickButton).build().perform();
		
		//Click Copy Button
		copyButton.click();
		
		Thread.sleep(3000);
		
		//Handle the alert
		System.out.println("Alert Message : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Close the browser
		driver.close();

	}

}
