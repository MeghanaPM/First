package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	static WebDriver driver;

	@SuppressWarnings("static-access")
	public login(WebDriver driver) {
		this.driver=driver;
	} 
	public static void highlight(WebElement element) {
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid blue;');", element);
	}

	public void Login(String Email, String password) {
	    try {
	        WebElement emailInput = driver.findElement(By.xpath("//input[@placeholder=\"Ex: johnwesley@abc.com\"]"));
	        highlight(emailInput); // Highlight the email input
	        emailInput.sendKeys("n180894@rguktn.ac.in");

	        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder=\"Enter Password\"]"));
	        highlight(passwordInput); // Highlight the password input
	        passwordInput.sendKeys("Meghana@123");

	        WebElement loginButton = driver.findElement(By.xpath("//button[@class=\"el-button type-2 w-100 fs-6 el-button--danger\"]"));
	        highlight(loginButton); // Highlight the login button
	        loginButton.click();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public boolean VerifyLoginSucess() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

		WebElement name = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@class='fw-large blue-dark mb-3 fs-10']")));
		System.out.println("Login Sucessfull");
		return name.isDisplayed();
	}
		


}
