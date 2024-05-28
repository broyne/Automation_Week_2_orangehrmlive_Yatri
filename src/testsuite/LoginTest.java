package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Admin"); //Enter valid username
        driver.findElement(By.name("password")).sendKeys("admin123"); //Enter valid password
        driver.findElement(By.tagName("button")).click();
        String expectedLoginText = "Dashboard";  //expected Result
        String actualLoginText = driver.findElement(By.tagName("h6")).getText(); //Actual Result
        Assert.assertEquals("Invalid credential", expectedLoginText, actualLoginText);  //Compare both Result
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
