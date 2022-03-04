package fi.Exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\SoftWareEngineering\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.co.in");
//		    Thread.sleep(5000);
		  //  driver.findElement(By.id("newtab-search-box-handoff-text")).sendKeys("www.javatpointtutorials");
			driver.get("https://www.javatpoint.com");
			Thread.sleep(1000);
			driver.findElement(By.id("google_ads_iframe_/103512698,22511567001/22485466990_0 ")).sendKeys("selenium-tutorial") ;
			driver.findElement(By.name("google_ads_iframe_/103512698,22511567001/22485466990_0")).click();
		    driver.close();
		      
	}
    public static void main( String[] args ) throws InterruptedException
    {
       App ob=new App();
       ob.launchBrowser();
    }
}
