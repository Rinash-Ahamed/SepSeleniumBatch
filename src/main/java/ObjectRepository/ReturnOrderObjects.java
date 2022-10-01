package ObjectRepository;

import org.openqa.selenium.By;

public interface ReturnOrderObjects {
	
	public static By orderIdField = By.id("order-id");
	
	public static By findOrderBtn = By.xpath("//button[text()='Find Order']");
	
	public static By returnOrderBtn = By.xpath("//button[text()='Return This Product']");
	
	public static By returnConfirmationId = By.xpath("(//h1)[2]");
 
}
