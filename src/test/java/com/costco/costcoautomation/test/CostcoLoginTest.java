/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.costco.costcoautomation.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CostcoLoginTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\work\\softwares\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void loginTest() throws Exception {
    driver.get("https://www.costco.com/");
    
    WebElement e = driver.findElement(By.id("header_sign_in"));
    System.out.println("isDisplayed : " + e.isDisplayed());
    System.out.println("isEnabled : " + e.isEnabled());
    
    //WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    //t.until(ExpectedConditions.visibilityOf(e));  
    //t.until(ExpectedConditions.elementToBeClickable(e));
    
    e.click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_500/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=DM_PersistentCookieCreated%3Dtrue%26URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=NewdBHoWnpqSybT2&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.findElement(By.id("signInName")).clear();
    driver.findElement(By.id("signInName")).sendKeys("test_itex@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Test@123");
    driver.findElement(By.id("next")).click();
      
    Assert.assertTrue(driver.getCurrentUrl().contains("https://signin.costco.com"));
    
    //driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_500/api/CombinedSigninAndSignup/confirmed?rememberMe=true&csrf_token=bEYyVk1DdE9SM2pkeVoxQkI0RzJQNnBQMmtKOUx4QnRWVnhzVDlqRjlXQnhwR1RpZG4vdUNrTXZuaWVQbmduWU4wMUVSNWNJNGF5bUhxc3Y3OEthdnc9PTsyMDIyLTA4LTAzVDE2OjQ0OjAwLjE1MTIxMDZaOzN0RllNMXg5Nkd1b3dCSmo1dEJ2a0E9PTt7Ik9yY2hlc3RyYXRpb25TdGVwIjo0fQ==&tx=StateProperties=eyJUSUQiOiJkM2M3YmYyMC0yMTk2LTQxNDMtYWYzZC1jYTYzYjgwNDg4NzMifQ&p=B2C_1A_SSO_WCS_signup_signin_500&diags=%7B%22pageViewId%22%3A%22acad91de-91da-4a69-b69c-c7d26ec331d7%22%2C%22pageId%22%3A%22CombinedSigninAndSignup%22%2C%22trace%22%3A%5B%7B%22ac%22%3A%22T005%22%2C%22acST%22%3A1659545040%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T021%20-%20URL%3Ahttps%3A%2F%2Fsignin-ui.costco.com%2Fecomssoui%2F500%2FSignIn.html%3FisTC%3D0%22%2C%22acST%22%3A1659545040%2C%22acD%22%3A57%7D%2C%7B%22ac%22%3A%22T019%22%2C%22acST%22%3A1659545040%2C%22acD%22%3A5%7D%2C%7B%22ac%22%3A%22T004%22%2C%22acST%22%3A1659545040%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T003%22%2C%22acST%22%3A1659545040%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T035%22%2C%22acST%22%3A1659545041%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T030Online%22%2C%22acST%22%3A1659545041%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T002%22%2C%22acST%22%3A1659545068%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T018T010%22%2C%22acST%22%3A1659545066%2C%22acD%22%3A1134%7D%5D%7D");
    //driver.get("https://www.costco.com/LinkYourMembershipInterruptView?langId=-1&krypto=hsFuEHU0wow1%2BXRqn0DXPPI9FEdsOekOPAa5ZRi4%2FWcVt9Q7YnC88bZdHAaMElHdnz%2BY%2BJ4XbeRZnyd8zek5wESDTHcTf5P%2FG1UcQJrRwsQfC1JnJkX33SrhFCeMoxgIGl85%2FCGt8E%2FI3%2F%2F4JcD4siV4hmOfpErKgWICf0kCES7Np6HoJOeASRMYCfwLGSLMvdxnOgsvBrestYwUs6VXGqxWZ5QZ1sGoPEvpEl%2FQkX8UO6ArHqgCzzzmgM6WdD6jCGxZJj9Z7pUgGryggWndWGXC8KSDyfHnkoIkQyj618ZjNMrlGIVy8bVgkS4YUhF6l8H7%2FXiX6yFmtPTSLa8CLQ%3D%3D&ddkey=http%3AOAuthLogonCmd");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}