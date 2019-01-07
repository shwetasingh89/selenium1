package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("email")).sendKeys("shwetaniwai8@rediffmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"js_0\"]/ul/li[20]/a")).click();
	}
		
	}


