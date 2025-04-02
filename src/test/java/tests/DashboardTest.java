package tests;

import base.BaseTest;
import pages.DashboardPage;

public class DashboardTest extends BaseTest {
    public static void main(String[] args) {
        DashboardTest test = new DashboardTest();
        test.setup();

        DashboardPage dashboardPage = new DashboardPage(test.driver);
        dashboardPage.openPage("https://example.com/dashboard");
        System.out.println("Page title is: " + dashboardPage.getPageTitle());
        dashboardPage.performAction();

        test.tearDown();
    }
}

