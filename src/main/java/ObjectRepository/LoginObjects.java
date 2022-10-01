package ObjectRepository;

import org.openqa.selenium.By;

public interface LoginObjects {

	public static By userName = By.id("username");

	public static By passWord = By.id("password");

	public static By loginButton = By.className("radius");

	public static By alertMessage = By.id("flash");

}
