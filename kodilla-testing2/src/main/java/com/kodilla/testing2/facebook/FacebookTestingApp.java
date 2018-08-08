package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Select date = new Select(driver.findElement(By.xpath("id('day')")));
        date.selectByVisibleText("2");
        Select month = new Select(driver.findElement(By.xpath("id('month')")));
        month.selectByVisibleText("Jan");
        Select year = new Select(driver.findElement(By.xpath("id('year')")));
        year.selectByVisibleText("1999");
    }
}
