package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	//	List <Web Elements>list=driver.findElement(By.tagName("a"));
	//	System.out.println( list).size();
	//	System.out.println("Your all links are"+list.size());
	//	for(WebElement links:list)
		{
	//		System.out.println(links.getAttribute("href"));
	//		System.out.println(links.getText());
	    }
	}
}
