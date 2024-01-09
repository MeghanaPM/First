package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReceiverSide {
	WebDriver driver;

	public ReceiverSide(WebDriver driver) {
		this.driver=driver;
	}
	public void login() {
		By ele = By.xpath("//input[@placeholder=\"Enter 6 letters code\"]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement c = wait.until(ExpectedConditions.elementToBeClickable(ele));
		c.sendKeys("slgrd8");
		driver.findElement(By.xpath("//button[@class=\"el-button type-2 w-100 fs-6 el-button--primary is-disabled\"]")).click();
	}
}
