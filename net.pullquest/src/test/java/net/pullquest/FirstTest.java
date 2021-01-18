package net.pullquest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends WebDriverSettings {
    @Test

    public void firstTest() {
        driver.get("https://dev.pullquest.net");

        WebElement header = driver.findElement(By.className("_HRzlow"));
        header.findElement(By.cssSelector("[href=\"/login\"]")).click();

    }
}