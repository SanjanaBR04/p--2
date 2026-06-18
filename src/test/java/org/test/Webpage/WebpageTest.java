package org.test.Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebpageTest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://sanjanabr04.github.io/PROGRAM-2/");
    }

    @Test
    public void testTitle() {
        Assert.assertEquals(driver.getTitle(), "Tripillar Solutions");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
