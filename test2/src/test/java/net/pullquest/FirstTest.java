package net.pullquest;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/Frontend/IdeaProjects/driver/chromedriver/chromedriver.exe");
        driver.get("https://stage.pullquest.net");
    }
}
