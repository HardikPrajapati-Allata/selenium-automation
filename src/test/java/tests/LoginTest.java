package tests;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.setup();

        test.driver.get("https://example.com/login");

        LoginPage loginPage = new LoginPage(test.driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();

        System.out.println("Login test completed.");
        test.tearDown();
    }
}

