/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class Nested extends BaseClass{

	@Test
	public static void Id()
	{
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		int countIframes =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames:" + countIframes);
        
		driver.switchTo().frame("frame1");
		WebElement textBox = driver.findElement(By.xpath("/html/body/input"));
		textBox.sendKeys("QaFactory");
		
		// Switching directly to Frame3 as the Frame3 inside Frame1
		driver.switchTo().frame("frame3");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"a\"]"));
		checkBox.click();
		Assert.assertTrue(checkBox.isSelected(), "Pass");
		
       // Switch to default frame as you need to interact with independent frame
       // driver.switchTo().defaultContent(): This will pass the control to the main document which contains the iframes.
       // driver.switchTo().parentFrame(): This will pass the control to the immediate parent frame of the current frame.
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
	    WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"animals\"]/option"));
		System.out.println("Test");
	}
}
