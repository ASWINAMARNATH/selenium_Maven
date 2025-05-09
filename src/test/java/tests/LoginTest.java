package tests;

import io.qameta.allure.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import base.BaseClass;
import pages.WorkSpace;
import org.openqa.selenium.*;
import io.qameta.allure.testng.*;
//
@Listeners({ AllureTestNg.class })
public class LoginTest extends BaseClass  {
	public WebDriver driver;
	@Step("testcase 1")
	@BeforeMethod
	public void browserSetup() {
		this.driver=initialize();
		
	}
    @Epic("Authentication")
    @Feature("Login")
    @Story("Valid login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test to verify that a user can log in with valid credentials")
    @Step("test case 3")
	@Test
	public void goToWorkspace() {
		WorkSpace workSpace=new WorkSpace(driver);
		workSpace.clickWorkSpace();
		
	}
    @Step("testcase 2")	
    @Test(priority=1)
	public void teardown() {
		tearDown(driver);
	}
	

}

