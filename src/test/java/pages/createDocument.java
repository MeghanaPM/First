package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createDocument {
	WebDriver driver;

	public createDocument(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateDoc() throws Exception {
		Thread.sleep(10000);

		By Element = By.xpath("//span[normalize-space()='Create Document']");
		WebDriverWait hold = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement canc = hold.until(ExpectedConditions.elementToBeClickable(Element));
		canc.click();
	}

	public boolean VerifyCreateDocSucess() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

		WebElement name = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//h3[@class=\"text-center text-dark fw-normal fs-4 mb-1\"]")));
		System.out.println("click on Create Document Sucessfull");
		return name.isDisplayed();
	}
}
