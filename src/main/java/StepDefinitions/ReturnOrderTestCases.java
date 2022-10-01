package StepDefinitions;

import org.testng.Assert;
import ObjectRepository.ReturnOrderObjects;
import Utils.Global;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ReturnOrderTestCases extends Global implements ReturnOrderObjects {
	
	@Before("@regression")
	public void invokeBrowser() {
		
		launchBrowser("chrome", "https://return-order-app.herokuapp.com/");
		
		
	}

	@Given("User is on the find product page")
	public void User_is_on_the_find_product_page() {
		
		Assert.assertEquals(driver.getTitle(), "Return Order Request Problem - Skillenza");

	}
	
	@When("The user enters order id and finding the product")
	public void The_user_enters_order_id_and_finding_the_product() {
		
		sendKeys(orderIdField, "1257945872");
		
		click(findOrderBtn);
		
	}
	
	@Then("User clicks on return product button for returing the product")
	public void User_clicks_on_return_product_button_for_returing_the_product() {
		
		click(returnOrderBtn);
		
	}
	
	@And("User gets his return confirmation id")
	public void User_gets_his_return_confirmation_id() {
		
		String actual = getElement(returnConfirmationId).getText();
		
		Assert.assertEquals(actual, "Return Order Placed");
		
	}
	
	@After("@regression")
	public void tear() {
		
		driver.quit();
		
	}

}
