package Utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Global extends Browsers {

	public static WebElement getElement(By obj) {

		return driver.findElement(obj);

	}

	public static void click(By obj) {

		getElement(obj).click();
	}

	public static void sendKeys(By obj, String value) {

		getElement(obj).sendKeys(value);
	}
	
	public static void takeScreen(String screenName) {

		try {
			TakesScreenshot shot = (TakesScreenshot) driver;

			File source = shot.getScreenshotAs(OutputType.FILE);

			File destination = new File(System.getProperty("user.dir") + "/ScreenShots/" + screenName + ".png");

			FileHandler.copy(source, destination);
			
			System.out.println("Screenshot taken!!!");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public static String readProperty(String key) {

		String value = null;

		try {

			Properties prop = new Properties();

			prop.load(new FileReader("Data/MyDetails.properties"));

			value = prop.getProperty(key);
			
			System.out.println(value);

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		return value;
	}


}
