package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.createDocument;
import pages.login;
import pages.uploadGdive;
import testBase.testCaseBase;

public class upload extends testCaseBase {
	login Loginpage;
	createDocument UploadDocumentFromPC;
	uploadGdive upload;
	
	@BeforeMethod
	public void initalize() {
		setUp();
		Loginpage=new login(driver);
		UploadDocumentFromPC=new createDocument(driver);
		upload=new uploadGdive(driver); 
	}
	
	@Test
	public void verify() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
		upload.upload();
	}
	
}
