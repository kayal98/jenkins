package Jencu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login {
	WebDriver driver;
	
	@Given("user launches chrome")
	public void user_launches_chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}

	@Given("user navigates to TestMe App")
	public void user_navigates_to_TestMe_App() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("user clicks on signin link")
	public void user_clicks_on_signin_link() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("user enters username as {string} in un")
	public void user_enters_username_as_in_un(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);  
	}

	@Given("user enters password as {string} in pw")
	public void user_enters_password_as_in_pw(String pw) {
		driver.findElement(By.name("password")).sendKeys(pw);
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.name("Login")).click();
	}



	


}
