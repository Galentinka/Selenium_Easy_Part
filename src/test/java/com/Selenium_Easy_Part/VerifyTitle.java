package com.Selenium_Easy_Part;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.macys.com/");
    }

    @Test
    public void verifyPageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
