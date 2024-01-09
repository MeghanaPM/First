package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uploadGdive {
	WebDriver driver;

	public uploadGdive(WebDriver driver) {
		this.driver = driver;
	}

	public void upload() throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@placeholder=\"top-start\"]")).click();
		Thread.sleep(10000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(10000);
		String Parentwindowid = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[normalize-space()=\"Sign in with Google\"]")).click();
		Set<String> allwindowhandles = driver.getWindowHandles();
		for (String childwindow : allwindowhandles) {
			if (!childwindow.endsWith(Parentwindowid)) {
				driver.switchTo().window(childwindow);
				Thread.sleep(10000);
				driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("n180894@rguktn.ac.in");
				
				driver.findElement(By.xpath("//span[normalize-space()=\"Next\"]")).click();
				Thread.sleep(10000);
				Set<String> windowHandles1 = driver.getWindowHandles();
				for (String handle : windowHandles1) {
					driver.switchTo().window(handle);
				
				}
				driver.findElement(By.xpath("//input[@name=\"Passwd\"]")).sendKeys("meghu@123");
				driver.findElement(By.xpath("//span[normalize-space()=\"Next\"]")).click();
				Thread.sleep(10000);
				Set<String> windowHandles11 = driver.getWindowHandles();
				for (String handle : windowHandles11) {
					driver.switchTo().window(handle);
				
				}
				Thread.sleep(10000);
				driver.findElement(By.xpath("//span[normalize-space()=\"Allow\"]")).click();
				Thread.sleep(10000);
				Set<String> windowHandles111 = driver.getWindowHandles();
				for (String handle : windowHandles111) {
					driver.switchTo().window(handle);
				
				}
				driver.findElement(By.xpath("//span[normalize-space()=\"N180894-resume.pdf\"]")).click();
				Thread.sleep(10000);
				Set<String> windowHandles2 = driver.getWindowHandles();
				for (String handle : windowHandles2) {
					driver.switchTo().window(handle);
				
				}
				driver.findElement(By.xpath("//span[@class=\"fsp-button fsp-button--primary fsp-button-upload\"]")).click();
				
			}
		}
	}
}

//		By ele = By.xpath("//*[@id=\"identifierId\"]");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
//		WebElement c = wait.until(ExpectedConditions.elementToBeClickable(ele));
//		c.click();
//		driver.findElement(By.xpath("//div/div/div/button/span")).click();
//		
//		driver.navigate().to("https://accounts.google.com/v3/signin/identifier?opparams=%253F&dsh=S1358964303%3A1704278464345196&access_type=offline&approval_prompt=force&client_id=48305303614-9iu05rp8g0oe1pd2llpu56mhktepvoo3.apps.googleusercontent.com&o2v=1&redirect_uri=https%3A%2F%2Fwww.filestackapi.com%2Fapi%2Fclient%2Fgoogledrive%2FauthCallback%2Fopen&response_type=code&scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fdrive.readonly&service=lso&state=ekj6KVPXmdi6Y-pOXBDBTEHxKplBBAez3JQCE3qOdxpDW0CljziPMRebE1e7TIlk7kVsuRYFnyJuEPv4nlgi5xr30VrgmY6iDRL4mljtx3tZaXzdCP4rnK4dSZl29rNjYwyoliZ4L6ZqKTUo54mF8FtZwdfTGOCrILpnVMgeBzx_EaA0sFAMsxTT7vqXNa_3A97ZfLhRXwWl5Fx3CboeOGwv1IONH9PEqNd1XRp85e4rwPUbOUzW&theme=glif&flowName=GeneralOAuthFlow&continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAPfREwn18YTI_yPz3_Tae5Zr6L_EaOnXbeRSXlx4RzLtLjSb9_eYXQxUAn1R5jivIiYazUraalPhZCmj6iV8Caf6SBCFY6VfpdcuQnN1Rs-YHPxwp8Rz3pTKATT42CNecbuuy7cF6CWM5RaAg3M-Pfz_1rLHX9jwgmWirucMqRBOcEbq7kwxSHrYp9WRKkbGXRvqfy4miD8PqUCmYNIKxPaCP32Ra0kx7gD9ph99ZWig_MawxLxYui17uJ-DS5kJS5lTMFLDiVEkT066EtHEpRzCp0OvdwTkt-RDtN7gvAF6xHGj2TOq_u5jzjC437RW3-IN-_2i8tNPSi_sJviYQwPPRtrFCemiXQ9LegTPiZxV2GtUCLGLGLn20BQi2VTPQyKsaJWDsQPcb0cudzXIoh0bhWL8Qgtppr9hA2SmnlPUhWAMMt1u0lC2R0duWZP98YPQajp-4Qy3c4qq2OS5orBBGcvTqq7eN9fuZPOT8pHD87Kt20%26as%3DS1358964303%253A1704278464345196%26client_id%3D48305303614-9iu05rp8g0oe1pd2llpu56mhktepvoo3.apps.googleusercontent.com%26theme%3Dglif%23&app_domain=https%3A%2F%2Fwww.filestackapi.com&rart=ANgoxcfTkAUgl9Q_BfPxfGExmml3aJchCNTVo8DXT9ftpVy7Xs9KMvVckgyRRVaRk_mQonwNuGmsKVGB0-C9I-LnmUzj3XujoSv55qXrQ2knfjAtXHVSIVo");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("n180894@rguktn.ac.in");
