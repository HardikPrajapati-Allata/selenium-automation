package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BaseTest {
    WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public void tearDown() {
        driver.quit();
    }
}

class GoogleSearchTest extends BaseTest {
    @Override
    public void setup() {
        super.setup();
        System.out.println("Google Search Test Setup");
    }

    @Override
    public void tearDown() {
        System.out.println("Google Search Test Teardown");
        super.tearDown();
    }

    public void searchTest() {
        System.out.println("Performing Google Search Test");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        GoogleSearchTest test = new GoogleSearchTest();
        test.setup();
        test.searchTest();
        test.tearDown();
    }
}
