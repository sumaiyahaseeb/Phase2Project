package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLoginStepDef {
	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
		driver.get("  https://www.saucedemo.com/");
		Thread.sleep(3000);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String userNameval) {
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys(userNameval);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String passval) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(passval);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		WebElement loginbuttton = driver.findElement(By.name("login-button"));
		loginbuttton.click();
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
		String homepagetitle=driver.getTitle();
		String expectedtitle="Swag Labs";
		Assert.assertEquals(homepagetitle, expectedtitle);
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpError) {
		WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
		String ActError = error.getText();
		Assert.assertEquals(ActError, ExpError);
	}

}
