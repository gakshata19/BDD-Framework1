package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseClass1 {
	
	@Given("Open cogmento crm application")
	public void open_orange_hrm_application() {
		BaseClass1.initialization();
	}

	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String uname, String pass) {
		 driver.findElement(By.name("email")).sendKeys(uname);
		 driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Then("Go to home page")
	public void go_to_home_page() {
	   String actualTitle=driver.getTitle();
	   Assert.assertEquals(actualTitle, "Cogmento CRM1");
	}

	@Then("Close browser")
	public void close_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui basic button floating item dropdown']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		Thread.sleep(2000);
	    driver.close();
	}
}
