package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.className("orangehrm-login-forgot-header")).click(); //Click on link
        String expectedResetPasswordText = "Reset Password"; //expected Result
        String actualResetPasswordText = driver.findElement(By.tagName("h6")).getText(); //Actual Result
        Assert.assertEquals("Password not reset", expectedResetPasswordText, actualResetPasswordText); //Compare both Result
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
