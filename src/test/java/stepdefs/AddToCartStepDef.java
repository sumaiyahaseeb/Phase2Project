package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {
	WebDriver driver =Hooks.driver;
	@When("I select the product name as {string}")
	public void i_select_the_product_name_as(String itemname) {
		WebElement item = driver.findElement(By.cssSelector("a[id='item_4_title_link']"));
		item.click();
	}

	@When("I click on add to cart")
	public void i_click_on_add_to_cart() {
		WebElement item = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		item.click();
	}

	@When("then I go to cart")
	public void then_I_go_to_cart() {
		WebElement item = driver.findElement(By.cssSelector("a[class='shopping_cart_link']"));
		item.click();
	}

	@Then("I verify that same item is displayed in the cart")
	public void i_verify_that_same_item_is_displayed_in_the_cart() {
		WebElement item = driver.findElement(By.cssSelector("a[id='item_4_title_link']"));
		String Actualitem=item.getText();
		String expitem="Sauce Labs Backpack";
		Assert.assertEquals(Actualitem,expitem);
	}


}
