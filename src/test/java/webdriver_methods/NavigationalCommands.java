/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * Navigational Commands
 * 
0) get() - accepts URL in string format only
1) navigate().to() - accepts URL in string format & URL object format
2) navigate().back()
3) navigate().forward()
4) navigate().refresh()
 *
 get(String Url)
{
..........
}

navigate().to(URL)
{
if(URL==String)
{
  No need to convert to string, pass to get directly
}
if else(URL==OBJECT)
{
 Convert to string and pass it to get method
}

get(String Url)
{
}

}
 * URL is a class from java.net
 */


public class NavigationalCommands {
	public static void main(String[] args) throws MalformedURLException {
            WebDriver driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    URL myURl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
//		    1st Approach when we have URL as string 
		    driver.navigate().to("https://www.saucedemo.com/");
		    
//		    2nd Approach when we have URL as URL Object 
		    driver.navigate().to(myURl);
		    
		    driver.navigate().back();
		    System.out.println("After hitting back-->"+driver.getCurrentUrl());
		    
		    driver.navigate().forward();
		    System.out.println("After hitting forward-->"+driver.getCurrentUrl());
		    
		    driver.navigate().refresh();
		    
		    driver.close();

	}

}
