package tests;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest extends BaseTest {

    public void searchGoogle() {
        driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Perform search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium OOP concepts");
        searchBox.submit();

        System.out.println("Page title is: " + driver.getTitle());
    }

    public static void main(String[] args) {
        GoogleSearchTest test = new GoogleSearchTest();
        test.setup();
        test.searchGoogle();
        test.tearDown();
    }
}

