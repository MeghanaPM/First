package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadFileFromPc {
	WebDriver driver;

	public uploadFileFromPc(WebDriver driver) {
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void uploadFile() throws Exception{
		Thread.sleep(10000);

		By ele = By.xpath("//h4[@class=\"fw-normal blue pb-2\"]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement c = wait.until(ExpectedConditions.elementToBeClickable(ele));
		c.click();	
		Runtime.getRuntime().exec("C:\\Users\\meghana.pemma\\OneDrive - Nimble Accounting\\Desktop\\practice\\esigns\\src\\test\\resources\\fileupload.exe");	
		Thread.sleep(5000);
		By ele1 = By.xpath("//button[@class=\"el-button text-center upload-btn el-button--danger\"]");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement c1 = wait1.until(ExpectedConditions.elementToBeClickable(ele1));
		c1.click();	
	}
	public boolean VerifyFileUploadSucess() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

		WebElement name = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class=\"fw-bold fs-24\"]")));
		System.out.println("File uploaded Sucessfull");
		return name.isDisplayed();
	}


}
