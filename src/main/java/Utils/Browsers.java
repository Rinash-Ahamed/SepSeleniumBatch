package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName, String URL) {

		switch (browserName) {

		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			break;

		}
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;

	}

}
