package com.cgi.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	
	@Given("User have browser with OrangeHRM application")
	public void user_have_browser_with_orange_hrm_application() {
	    
	}

	@When("User enter username as {string}")
	public void user_enter_username_as(String username) {
	    System.out.println(username);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as(String password) {
		System.out.println(password);
	}

	@When("User click on PIM menu")
	public void user_click_on_pim_menu() {
	    
	}

	@When("User click on Add Employee")
	public void user_click_on_add_employee() {
	    ;
	}

	@When("User fill the employee form")
	public void user_fill_the_employee_form(DataTable dataTable) {
	    System.out.println(dataTable);
	}

	@When("User clicks on save employee")
	public void user_clicks_on_save_employee() {
	   
	}

	@Then("User should get the profile name as {string}")
	public void user_should_get_the_profile_name_as(String profileName) {
		System.out.println(profileName);
	    
	}

	@Then("User should get the personal details as per the form filled")
	public void user_should_get_the_personal_details_as_per_the_form_filled() {
	   
	}

	
	
}