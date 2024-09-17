/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package solutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author 91895
 *
 */
public class AmazonDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
        Thread.sleep(10000);
//        WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//        Select slt = new Select(dropDown);
//        slt.selectByVisibleText("Baby");
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ALexa");
        List<WebElement> drpValues = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div/div[1]"));
        
        System.out.println("Autpsuggestions");
        for(WebElement value:drpValues)
        {
        	System.out.println(value.getText());
        }
        driver.close();
	}

}
