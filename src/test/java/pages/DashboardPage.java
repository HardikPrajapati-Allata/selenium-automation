package pages;

import org.openqa.selenium.WebDriver;
import utils.PageActions;

public class DashboardPage implements PageActions {
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void openPage(String url) {
        driver.get(url);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }

    public void performAction() {
        System.out.println("Performing action on the dashboard.");
    }
}

