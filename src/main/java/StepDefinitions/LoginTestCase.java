package StepDefinitions;

import org.testng.Assert;

import ObjectRepository.LoginObjects;
import Utils.Global;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTestCase extends Global implements LoginObjects {

	@Before("@smoke")
	public void invokeBrowser() {

		launchBrowser("chrome", "http://the-internet.herokuapp.com/login");

	}

	// first scenario

	@Given("User enter his username and password")
	public void user_enter_his_username_and_password() {

		sendKeys(userName, "tomsmith");
		sendKeys(passWord, "SuperSecretPassword!");

	}

	@Then("User click on login button")
	public void user_click_on_login_button() {

		click(loginButton);

	}

	@And("User verifies his login")
	public void user_verifies_his_login() {

		Assert.assertTrue(getElement(alertMessage).isDisplayed());

	}

	// second scenario
	
	
	@Before("@sanity")
	public void invokeBrowser1() {

		launchBrowser("chrome", "http://the-internet.herokuapp.com/login");

	}

	@Given("User enter his invalid username and invalid password")
	public void user_enter_his_invalid_username_and_invalid_password() {

		sendKeys(userName, "invalid");
		sendKeys(userName, "invalid!!!");

	}
	
	@After("@sanity")
	public void tear1() {

		driver.quit();

	}

	@After("@smoke")
	public void tear() {

		driver.quit();

	}

}
