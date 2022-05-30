package Com.OrangeHRM5.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class Myinfo extends BaseClass
{
	
	@Test(priority =1,description = "Verify user should be able to login")
	public void Login() throws Exception 
	{
		
		WebElement txtusername=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		txtusername.sendKeys("Admin");
		System.out.println("Enter User Name");
		Thread.sleep(2000);
		
		WebElement txtpassword=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		txtpassword.sendKeys("admin123");
		System.out.println("Enter Password");
		Thread.sleep(2000);
		
		WebElement btnlogin=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		btnlogin.click();
		System.out.println("Click On Login CTA");
		Thread.sleep(2000);
		
	CaptureScreenShort(driver, "login");
		
		
	
}
	@Test(priority = 2,description = "Verify MYInfo Page")
	public void MyInfo() throws Exception
	
	{
		
		WebElement dashboardtext=driver.findElement(By.xpath("//li[@class='current main-menu-first-level-list-item']//a//b"));
	    String dashboard=dashboardtext.getText();
	    System.out.println(dashboard+"Page is showing");
	    
	    String dashurl=driver.getCurrentUrl();
	    System.out.println(dashurl);
	     
	    CaptureScreenShort(driver, "dashurl");
		
	    WebElement Myinfo=driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']//b"));
	    Myinfo.click();
	    System.out.println(" Click On Myinfo CTA");
	    
	    
		
		WebElement personaldetailtext=driver.findElement(By.xpath("//div[@id='pdMainContainer']//div//h1"));
		String personaldetails=personaldetailtext.getText();
		System.out.println(personaldetails);
		Thread.sleep(2000);
		
		String MYinfourl=driver.getCurrentUrl();
		System.out.println(MYinfourl);
		
		
		WebElement btnsave=driver.findElement(By.xpath("//input[@id='btnSave']"));
		btnsave.click();
		System.out.println("Click On Edit CTA");
		Thread.sleep(2000);
		
		 WebElement txtname=driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
			txtname.clear();
			txtname.sendKeys(RandomStringUtils.randomAlphabetic(5));
			System.out.println("Enter The First Name");
			Thread.sleep(1000);
			WebElement txtmiddlename=driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
			txtmiddlename.sendKeys("Balwant");
			System.out.println("Enter The Middle Name");
			Thread.sleep(2000);
		
		WebElement txtlastname=driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		txtlastname.clear();
		txtlastname.sendKeys("Sarode");
		System.out.println("Enter The Last Name");
		Thread.sleep(1000);
		
		
		WebElement txtempid=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
		txtempid.clear();
		txtempid.sendKeys(RandomStringUtils.randomNumeric(7));
		System.out.println("Enter The Emp Id");
		Thread.sleep(1000);
		
		
		WebElement txtotherid=driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
		txtotherid.sendKeys("456");
		System.out.println("Enter The Other Id");
	    Thread.sleep(1000);
	
	
		WebElement licenseno=driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
		licenseno.clear();
		licenseno.sendKeys("12345");
		System.out.println("Enter The License No");
		Thread.sleep(1000);
		WebElement licenseexpdate=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
		licenseexpdate.clear();
		licenseexpdate.sendKeys("2022-04-14",Keys.ENTER);
		System.out.println("Enter The Expiry Date");
		Thread.sleep(1000);
		WebElement empsnnno=driver.findElement(By.xpath("//input[@id='personal_txtNICNo']"));
		empsnnno.clear();
		empsnnno.sendKeys("9090");
		System.out.println("Enter The Snn No");
		Thread.sleep(1000);
		
		
		WebElement sinno=driver.findElement(By.xpath("//input[@id='personal_txtSINNo']"));
		sinno.sendKeys("8787");
		System.out.println("Enter The Sin No");
		Thread.sleep(1000);
		
		
		WebElement rdofemale=driver.findElement(By.xpath("//input[@id='personal_optGender_2']"));
		rdofemale.click();
		System.out.println("Female is selected");
		Thread.sleep(1000);
		
		//code for drop down
		Select Maritalstatus=new Select(driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")));
		Maritalstatus.selectByIndex(1); 
		System.out.println("Marital Status is selected");
		Thread.sleep(2000);
		
		
		Select Nationality=new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
		Nationality.selectByIndex(2);
		System.out.println("Nationality is selectes");
		Thread.sleep(2000);
		
		WebElement dob=driver.findElement(By.xpath("//input[@id='personal_DOB']"));
		dob.clear();
		dob.sendKeys("2024-4-21",Keys.ENTER);
		System.out.println("Date of Birth is Selected");
		Thread.sleep(2000);
		WebElement nickname=driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']"));
		nickname.clear();
		nickname.sendKeys("Monu");
		System.out.println("Enter The Nick Name");
		Thread.sleep(2000);
			
		
		WebElement Militaryser=driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']"));
		Militaryser.sendKeys("army");
		System.out.println("Enetr The Military Service");
		Thread.sleep(2000);
		
		
		WebElement chksmoker=driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']"));
		chksmoker.click();
		System.out.println("Click On Chk Smoker Box");
		Thread.sleep(2000);
		
		
         WebElement clickimg=driver.findElement(By.xpath("//img[@id='empPic']"));
         clickimg.click();
         System.out.println("Click On Profile Photo");
         Thread.sleep(2000);
         WebElement phototext=driver.findElement(By.xpath("//div[@id='content']//div[@class='head']"));
         String photograph=phototext.getText();
         System.out.println(photograph);
         Thread.sleep(2000);
         
         
         String photourl=  driver.getCurrentUrl();
         System.out.println(photourl);
         
         WebElement txtupload=driver.findElement(By.xpath("//input[@id='photofile']"));
         txtupload.sendKeys("C:\\Users\\LENOVO\\Downloads\\IMG-20220302-WA0014.jpg");
         System.out.println("Click On profie Pic");
         Thread.sleep(2000);
         
         WebElement btnupload=driver.findElement(By.xpath("//input[@id='btnSave']"));
         btnupload.click();
         System.out.println("Click On Upload CTA");
         Thread.sleep(2000);
		
	}
	@Test(priority = 3,description = "Verify User should be able to logout")
	public void Logout() throws Exception 
	{
		WebElement btnwelcome=driver.findElement(By.xpath("//a[@id='welcome']"));
        btnwelcome.click();
        System.out.println("Click On Welcome CTA");
        Thread.sleep(2000);

        WebElement btnabout=driver.findElement(By.xpath("//a[@id='aboutDisplayLink']"));
        btnabout.click();
        System.out.println("Click On About CTA");
        Thread.sleep(4000);

       WebElement btnclose=driver.findElement(By.xpath("//div[@id='displayAbout']//div//a"));
       btnclose.click();
       System.out.println("Click On Close CTA");
       Thread.sleep(2000);

       WebElement btnsupport=driver.findElement(By.xpath("//div[@id='welcome-menu']//ul//li[2]//a"));
       btnsupport.click();
       System.out.println("Click On Suppor CTA");
      Thread.sleep(2000);

     driver.navigate().back();
     Thread.sleep(2000);
     
     WebElement welcomecta=driver.findElement(By.xpath("//a[@id='welcome']"));
     welcomecta.click();
     System.out.println("Click On Welcome CTA");
     Thread.sleep(2000);

     WebElement btnlogout=driver.findElement(By.xpath("//div[@id='welcome-menu']//ul//li[3]//a"));
     btnlogout.click();
     System.out.println("Click On Logout CTA");
     Thread.sleep(2000);
	}
	
	
}