package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOverloadingExample {
    WebDriver driver;

    public MethodOverloadingExample() {
        driver = new ChromeDriver();
    }

    // Method to find element by ID
    public WebElement findElement(String id) {
        return driver.findElement(By.name(id));
    }

    // Method to find element by XPath
    public WebElement findElement(String locator, boolean isXPath) {
        if (isXPath) {
            return driver.findElement(By.xpath(locator));
        }
        return driver.findElement(By.cssSelector(locator));
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        example.driver.get("https://www.google.com");

        // Using overloaded methods
        WebElement searchBox = example.findElement("q"); // By ID
        WebElement searchButton = example.findElement("//input[@name='btnK']", true); // By XPath

        searchBox.sendKeys("Selenium Polymorphism");
        searchButton.click();

        example.driver.quit();
    }
}
