package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OmayoLoginSteps {
	public WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("I navigate to the omayo website")
	public void i_navigate_to_the_omayo_website() {
		
		driver.get("http://www.omayo.blogspot.com");
		
		
	}

	@When("I enter Username as {string} and Password as {string} into the fields")
	public void i_enter_username_as_and_password_as_into_the_fields(String username, String password) {
		driver.findElement(By.name("userid")).sendKeys(username);
        driver.findElement(By.name("pswrd")).sendKeys(password);   

	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();
	}

	@Then("User should login based on expected {string} status")
	public void user_should_login_based_on_expected_status(String expectedLoginStatus) {

		String expectedStatus=expectedLoginStatus;
		String actualStatus=null;
		try {
			Alert alert = driver.switchTo().alert();
			String actualText = alert.getText();
			if(actualText.equals("Error Password or Username")) {
				actualStatus="failure";
			}else {
				actualStatus="success";
			}
		}catch(Exception e) {
			actualStatus="success";		
		}
		
		if(actualStatus.equals(expectedStatus)) {
			//Do nothing
		}else {
			Assert.fail("Actual login status is not equal to the expected login status");
		}
		
		
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}
}


