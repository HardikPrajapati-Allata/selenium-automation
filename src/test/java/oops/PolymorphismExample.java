package oops;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class PolymorphismExample {

    public static void main(String[] args) throws InterruptedException {
        //https://googlechromelabs.github.io/chrome-for-testing/#stable
        //https://github.com/dreamshao/chromedriver
        //System.setProperty("webdriver.chrome.driver","D:\\Hardik\\Imriel\\Testing Purpose\\intelliJ Testing\\OOPS_WITH_SELENIUM_JAVA\\src\\resources\\chromedriver\\chrome.exe");

        WebDriverManager.chromedriver().clearDriverCache().setup();

        // Using WebDriver reference for ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(5000);
        System.out.println("Title: " + driver.getTitle());
        driver.quit();

        // Using WebDriver reference for FirefoxDriver
//        driver = new FirefoxDriver();
//        driver.get("https://www.google.com");
//        System.out.println("Title: " + driver.getTitle());
//        driver.quit();
    }
}

