/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseClass;

public class ByIDName extends BaseClass {
	
	@Test
	public static void Index() throws InterruptedException
	{
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		int countIframes =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames:" + countIframes);
		driver.switchTo().frame("frame1");
		WebElement textBox = driver.findElement(By.xpath("/html/body/input"));
		textBox.sendKeys("QaFactory");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
	    WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
	    Select elm = new Select(dropDown);
	    elm.selectByVisibleText("Baby Cat");
	    System.out.println("Bat Cat Selected!!");
		Thread.sleep(5000);
	}

}
