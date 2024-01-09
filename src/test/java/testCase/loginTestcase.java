package testCase;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.login;
import pages.multipleFilesUpload;
import pages.uploadFileFromPc;
import pages.DragAndDrop;
import pages.ReviewSend;
import pages.addRecipient;
import pages.createDocument;
import testBase.testCaseBase;

public class loginTestcase extends testCaseBase{
	login Loginpage;
	createDocument UploadDocumentFromPC;
	uploadFileFromPc UploadFile;
	addRecipient Add;
	DragAndDrop Drag;
	ReviewSend send;
	multipleFilesUpload mulupload;
	@BeforeMethod
	public void initalize() {
		setUp();
		Loginpage=new login(driver);
		UploadDocumentFromPC=new createDocument(driver);
		UploadFile=new uploadFileFromPc(driver);
		Add=new addRecipient(driver);
		Drag=new DragAndDrop(driver);
		send=new ReviewSend(driver);
		mulupload=new multipleFilesUpload(driver);

	}
	@Test
	public void verifyLoginWithInvalidCredentials() {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
	}
	@Test
	public void verifyCreateDocument() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
	}
	
	@Test
	public void verifyUploadFilePC() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
		UploadFile.uploadFile();
	}
	@Test
	public void verifyAddRecipient() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
		UploadFile.uploadFile();
		Add.recipient();
		Add.VerifyAddRecipientSucess();
		//Add.receiver();
		//Add.Details();
		
	}
	@Test
	public void drags() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
		UploadFile.uploadFile();
		UploadFile.VerifyFileUploadSucess();
		Add.recipient();
		Add.VerifyAddRecipientSucess();
		Drag.draging();
		Drag.VerifyDragSucess();
		send.submit();

		
	}
	//recipients multiple add
	@Test
	public void mulRecipients() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
		UploadFile.uploadFile();
		Add.mulRecipient();
		
	}
	@Test
	public void multifiles() throws Exception {
		Loginpage.Login("n180894@rguktn.ac.in","Meghana@123");
		Loginpage.VerifyLoginSucess();
		UploadDocumentFromPC.CreateDoc();
		UploadDocumentFromPC.VerifyCreateDocSucess();
		mulupload.uploadFile();
		Add.mulRecipient();

		
	}
	
//	
//	@AfterMethod
//	public void cleanUp() {
//		driver.quit();
//	}
}

