package StepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPage1 extends BaseClass1 {

		
	@Given("Launch Cogmento Application")
	public void launch_cogmento_application() {
		BaseClass1.initialization();
	}

	@When("User provide valid {string}")
	public void user_provide_valid(String uname, DataTable dataTable) {
		driver.findElement(By.name("email")).sendKeys(uname);
	}

	@When("Valid {string}")
	public void valid(String pass, DataTable dataTable) {
		 driver.findElement(By.name("password")).sendKeys(pass);
	  
	}

	@Then("Click on LoginButton")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@When("User is on Home Page")
	public void user_is_on_home_page() {
	    String actualTitle=driver.getTitle();
	    Assert.assertEquals(actualTitle, "Cogmento CRM");    
	    
	    String actualUrl=driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl, "https://ui.cogmento.com/");
	}

	@Then("Click on ContactLink and CreateButton")
	public void click_on_contact_link_and_create_button() {
	    driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	    driver.findElement(By.xpath("//button[@class='ui linkedin button'][text()='Create']")).click();
	}

	@Then("Enter All Details")
	public void enter_all_details() {
	    driver.findElement(By.name("first_name")).sendKeys("Vinod");
	    driver.findElement(By.name("last_name")).sendKeys("Khandare");
	    driver.findElement(By.name("middle_name")).sendKeys("Bhagwan");
	}

	@Then("Click on SaveButton")
	public void click_on_save_button() {
	    driver.findElement(By.xpath("//button[@class='ui linkedin button'][text()='Save']")).click();
	}
	
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
