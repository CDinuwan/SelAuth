package login;

import BaseTest.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertTest().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
