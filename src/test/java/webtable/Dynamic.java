/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class Dynamic extends BaseClass {
	
	@Test
	public void iteration() {
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html#:~:text=Practice%20Exercise%20with%20Solution%20Code%20-%20How%20to,the%20tallest%20structure%20in%20the%20table%20with%20Selenium");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		System.out.println("Size--->"+rows.size());
		for (int i = 1; i < rows.size(); i++) {
			//*[@id="customers"]/tbody/tr[2]/td[1]
		}
		
	}

}
