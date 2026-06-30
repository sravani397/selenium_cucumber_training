package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();


    }

    @And("user is on login home page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");

    }

    @When("^user enters (.*)and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username.trim());
        driver.findElement(By.id("password")).sendKeys(password.trim());

    }

    @And("user clicks on login")
    public void user_clicks_on_login() {
        driver.findElement(By.id("login-button")).click();

    }

@Then("user is validated home page")
    public void user_is_navigated_to_the_home_page(){
    System.out.println(driver.getTitle());
}

}
