package amazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    @org.testng.annotations.Parameters({"browser"})
    public void setUp(@org.testng.annotations.Optional("chrome") String browser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
