package tests;

import base.BaseTest;
import pages.GoogleHomePage;

public class GoogleSearchTestWithAbstraction extends BaseTest {
    public static void main(String[] args) {
        GoogleSearchTestWithAbstraction test = new GoogleSearchTestWithAbstraction();
        test.setup();

        GoogleHomePage googleHomePage = new GoogleHomePage(test.driver);
        googleHomePage.search("Selenium Abstraction Example");
        System.out.println("Page title is: " + googleHomePage.getPageTitle());

        test.tearDown();
    }
}

