package amazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseTest {

    @Test
    public void searchLaptop() {
        driver.get("https://www.amazon.in");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");

        driver.findElement(By.id("nav-search-submit-button")).click();

        // Corrected line below
        String browserName = ((RemoteWebDriver) driver).getCapabilities().getBrowserName();
        System.out.println("Test executed successfully on: " + browserName);
    }
}
