package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestClass {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test() {
        driver.get("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(), "DuckDuckGo");
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }

}
