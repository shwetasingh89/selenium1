package First;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestDemo {
	WebDriver driver;
  @Test
  public void logincheck() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.name("email")).sendKeys("shwetaniwai8@yahoo.com");
	  driver.findElement(By.name("pass")).sendKeys("sannurani");
  }
    @Test
    public void registration() {
    	driver.findElement(By.id("u_0_j")).sendKeys("Sona");
    	driver.findElement(By.name("lastname")).sendKeys("Gulathi");
    	driver.findElement(By.name("reg_email_")).sendKeys("7011929657");
    	driver.findElement(By.name("reg_passwd_")).sendKeys("sarla");
    }
  @BeforeTest
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void closebrowser() {
	  driver.quit();
  }

}
