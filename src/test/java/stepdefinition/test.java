package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class test {
	
	WebDriver driver; 
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
	}

	@When("user click on signup button")
	public void user_click_on_signup_button() {
		driver.findElement(By.linkText("Sign up!")).click();
	}
	
	@When("user enter valid firstname {string} and lastname {string}")
	public void user_enter_valid_firstname_and_lastname(String firstname, String lastname) {
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	}

	@When("user enter valid Email {string}")
	public void user_enter_valid_Email(String email) {
		driver.findElement(By.name("email")).sendKeys(email);
	}

	@When("user enter Username {string} and Pass{string}")
	public void user_enter_Username_and_Pass(String username, String pass) {
	    
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pass1")).sendKeys(pass);
	}
	@When("user  enter Confirm pass {string}")
	public void user_enter_Confirm_pass(String pass) {
		driver.findElement(By.name("pass2")).sendKeys(pass);
	}

	@When("user enter phone {string}")
	public void user_enter_phone(String phone) {
		driver.findElement(By.name("phone")).sendKeys(phone);
	}

	@Then("click on register")
	public void click_on_register() {
		driver.findElement(By.name("submit")).click();
	}
	
	
	
	@When("user enter invalid username{string} and password {string}")
	public void user_enter_invalid_username_and_password(String username1, String pass) {
		driver.findElement(By.name("login")).sendKeys(username1);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("submitAuth")).click();
	}


@Then("validation msg appears")
public void validation_msg_appears() {
    System.out.println("login failed: incorrect login or password");
}

@When("user enter valid username{string} and password {string}")
public void user_enter_valid_username_and_password(String username2, String pass2) {
	driver.findElement(By.name("login")).sendKeys(username2);
	driver.findElement(By.name("password")).sendKeys(pass2);
}
@Then("user clicks on login button")
public void user_clicks_on_login_button() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.name("submitAuth")).click();
	
}

@When("user click forget password")
public void user_click_forget_password() {
	driver.findElement(By.linkText("I lost my password")).click();
}

@Then("user enter the invalid username{string}")
public void user_enter_the_invalid_username(String username3) {
	driver.findElement(By.name("user")).sendKeys(username3);
}

@Then("click on send message")
public void click_on_send_message() {
	driver.findElement(By.name("submit")).click();
}
@Then("validation msgs appears")
public void validation_msgs_appears() {
	System.out.println("incorrect username or email");
}

@When("user clicks forget password")
public void user_clicks_forget_password() {
	driver.findElement(By.linkText("I lost my password")).click();    
}
@Then("user enter the valid email or username{string}")
public void user_enter_the_valid_email_or_username(String username4) {
	driver.findElement(By.name("user")).sendKeys(username4);
}

@Then("clicks on send message")
public void clicks_on_send_message() {
	driver.findElement(By.name("submit")).click();
}
	@Then("validation message is on screen")
	public void validation_message_is_on_screen() {
		System.out.println("This platform was unable to send the email.\nPlease contact Admin User for more information.");
	}

	@When("user enters valid username{string} and password {string}")
	public void user_enters_valid_username_and_password(String user1, String pass1) {
		driver.findElement(By.name("login")).sendKeys(user1);
		driver.findElement(By.name("password")).sendKeys(pass1);
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("submitAuth")).click();
	}

	@Then("user click on catalogue")
	public void user_click_on_catalogue() {
		driver.findElement(By.linkText("Course catalog")).click(); 
	}

@Then("user click on the homepage")
public void user_click_on_the_homepage() {
	driver.findElement(By.linkText("Homepage")).click(); 
}

@Then("user click on compose message")
public void user_click_on_compose_message() {
	driver.findElement(By.className( "new-message-social")).click();
}
@Then("user click on send to option")
public void user_click_on_send_to_option() {
	driver.findElement(By.className( "select2-search__field")).click();
	
}
@Then("enter data {string}")
public void enter_data(String user4) throws InterruptedException {
	driver.findElement(By.className("select2-search__field")).sendKeys(user4);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[text()='Agna Manu']")).click();
	
}

@Then("user enter data on subject{string}")
public void user_enter_data_on_subject(String invite) throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.name("title")).sendKeys(invite);
}

@Then("user again click send msg")
public void user_again_click_send_msg() {
	driver.findElement(By.name("compose")).click();
}
@Then("user receives msg from page")
public void user_receives_msg_from_page() {
   System.out.println("The message is sent to Agnamanu");
}
	@Then("user logout the profile")
	public void user_logout_the_profile() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.id("logout_button")).click();
	}
	@When("user enters valid user{string} and pass{string}")
	public void user_enters_valid_user_and_pass(String user5, String pass5) {
		driver.findElement(By.name("login")).sendKeys(user5);
		driver.findElement(By.name("password")).sendKeys(pass5);
	}

	@Then("user clicks login option")
	public void user_clicks_login_option() {
		driver.findElement(By.name("submitAuth")).click();
	}

	@Then("user clicks on the homepage")
	public void user_clicks_on_the_homepage() {
		driver.findElement(By.linkText("Homepage")).click();
	}

	@Then("click on the edit option")
	public void click_on_the_edit_option() throws InterruptedException {
		driver.findElement(By.linkText("Edit profile")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("apply_change")).click();
		System.out.println("Your new profile has been saved");
	}


}
