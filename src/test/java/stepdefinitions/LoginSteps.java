package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver = null;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is successfully logged in");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        System.out.println("user enter");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
        System.out.println("clicks on login button");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println(driver.getTitle());
        System.out.println("Inside Step - user is navigated to the home page");
        driver.close();
    }
}
