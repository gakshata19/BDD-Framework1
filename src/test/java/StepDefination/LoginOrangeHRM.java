package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginOrangeHRM {
public WebDriver driver;
	
@Given("Open OrangeHRM application")
	public void open_orange_hrm_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@When("user enter valid credientials")
	public void user_enter_valid_credientials(DataTable dataTable) {
		List<List<String>> data=dataTable.asLists();
		
		String uname=data.get(0).get(0);
		String pass=data.get(0).get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);;
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}
	
	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	   String title=driver.getTitle();
	   Assert.assertEquals(title, "OrangeHRM1");
	}
	@Then("Close Application")
	public void close_application() throws InterruptedException {
	    Thread.sleep(3000);
		driver.close();
	}

}