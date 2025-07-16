package com.cgi.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
	@Given("User have browser with OrangeHRM Application")
	public void user_have_browser_with_orangeHRM_application() {
		System.out.println("Luanching URL ");
	}

	@When("User enter username {string}")
	public void user_enter_user_name(String username) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When" + username);
	}

	@When("User enter password {string}")
	public void user_enter_password(String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When" + password);
	}

	@When("User click on login")
	public void user_click_on_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("logging In");
	}

	@Then("User should get access to dashboard with content as {string}")
	public void user_should_get_access_to_dashboard_with_content_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged In successfully");
	}

	@Then("User should have error message as {string}")
	public void user_should_have_error_message_as(String errorMessage) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then" + errorMessage);
	}

}
