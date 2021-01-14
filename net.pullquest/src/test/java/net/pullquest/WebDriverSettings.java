package net.pullquest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("start_test");
    }

    @After
    public void close () {
        System.out.println("End_test");
        driver.quit();
    }
}
