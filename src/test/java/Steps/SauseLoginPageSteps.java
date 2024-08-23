package Steps;

import org.junit.Assert;

import com.pages.SauseAddToCartPage;
import com.pages.SauseCheckoutPage;
import com.pages.SauseCheckoutoverviewPage;
import com.pages.SauseLoginpage;
import com.pages.SauseProductPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauseLoginPageSteps {
	private static String title;
	private SauseLoginpage loginPage=new SauseLoginpage(DriverFactory.getDriver());
	private SauseProductPage productPage=new SauseProductPage(DriverFactory.getDriver());
	private SauseAddToCartPage addtocartPage=new SauseAddToCartPage(DriverFactory.getDriver());
	private SauseCheckoutPage checkoutPage=new SauseCheckoutPage(DriverFactory.getDriver());
	private SauseCheckoutoverviewPage overviewPage= new SauseCheckoutoverviewPage(DriverFactory.getDriver());
	
	
	
	@Given("user in login page")
	public void user_in_login_page() {
	    DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}
	
	

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) throws InterruptedException {
	    loginPage.enterUserName(username);
	}

	@When("user enters pasword {string}")
	public void user_enters_pasword(String password) throws InterruptedException {
	    loginPage.enterPassword(password);
	}
	
	@When("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		loginPage.clickOnLogin();
	}

	@When("user is on the Swag Labs product page")
	public void user_is_on_the_swag_labs_product_page() {
	    DriverFactory.getDriver().get("https://www.saucedemo.com/inventory.html");
	}


	@When("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() throws InterruptedException {
	productPage.clickOnAddToCart();
}
	@When("user is on add to cart page")
	public void user_is_on_add_to_cart_page() {
	    DriverFactory.getDriver().get("https://www.saucedemo.com/cart.html");
	}

	@Then("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
		addtocartPage.clickoncheckout();
	    
	}

	@Then("user is on checkout page")
	public void user_is_on_checkout_page() {
	    DriverFactory.getDriver().get("https://www.saucedemo.com/checkout-step-one.html");
	    
	}

	@Then("user enters First {string}")
	public void user_enters_first(String first) throws InterruptedException {
		checkoutPage.enterfirstName(first);
		
	    
	}

	@Then("user enters Last {string}")
	public void user_enters_last(String last) throws InterruptedException {
	    checkoutPage.enterlastName(last);
	}

	@Then("user enters Postalcode {string}")
	public void user_enters_postalcode(String post) throws InterruptedException {
	    checkoutPage.enterpostalCode(post);
	}

	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button() {
	    checkoutPage.clickOncontinue();
	}

	@Then("user is on overview page")
	public void user_is_on_overview_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/checkout-step-two.html");
	    
	    
	}

	@Then("user clicks on first button")
	public void user_clicks_on_first_button() {
	
	}



}
