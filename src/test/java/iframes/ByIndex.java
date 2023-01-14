/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseClass;

public class ByIndex extends BaseClass {
	
	@Test
	public static void Index() throws InterruptedException
	{
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement textBox = driver.findElement(By.xpath("/html/body/input"));
		textBox.sendKeys("QaFactory");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
	    WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
	    Select elm = new Select(dropDown);
	    elm.selectByVisibleText("Baby Cat");
		Thread.sleep(5000);
	}

}
