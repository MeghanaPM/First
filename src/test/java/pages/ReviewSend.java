
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewSend {
	WebDriver driver;
	
	public ReviewSend(WebDriver driver){
		
		this.driver = driver;
		
	}
	public void submit() throws Exception {
		Thread.sleep(10000);
		By ele = By.xpath("//textarea[@placeholder='Subject']");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMinutes(2));
		WebElement sen =wait.until(ExpectedConditions.elementToBeClickable(ele));
		sen.sendKeys("Test Sample");
		driver.findElement(By.xpath("//textarea[@placeholder='Type your text here']")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='Send Document']")).click();
		
	}
	
}
