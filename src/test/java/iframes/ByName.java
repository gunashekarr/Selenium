/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package iframes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseClass;

public class ByName extends BaseClass {
	
	@Test
	public static void Index()
	{
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		int countIframes =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames:" + countIframes);
		driver.switchTo().frame("iframe1");
	}

}
