package com.Selenium_Easy_Part;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateToDifferentPage {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://misterz.shop/");
    }

    @Test
    public void verifyPageTitle() throws InterruptedException {
        driver.findElement(By.xpath("//li[@id='menu-item-1023']//a[@class='menu-link'][normalize-space()='About']")).click();

        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='About Zeljko']")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
