package com.Selenium_Easy_Part;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifySuccessfulLogin {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.macys.com/");
    }

    @Test
    public void verifyLoginWithValidCredential() throws InterruptedException {

        driver.findElement(By.xpath("//a[contains(@class, 'link-rail-item signin-rail-item')]/span[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("galentinka1@gmail.com");
        driver.findElement(By.xpath("//input[@id='pw-input']")).sendKeys("Galentinka1");
        driver.findElement(By.xpath("//button[@id='sign-in']")).click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
