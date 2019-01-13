/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author yogi1
 */
public class TestCase1 {
    
    WebDriver driver;
    String baseUrl = "http://newtours.demoaut.com";

    
    public TestCase1() {
    }

    // 1. To check if correct page is visited :-
    @Test
    public void verifyHomePage() throws InterruptedException {
        
        // Open a Chrome browser and open the URL
        driver.manage().window().maximize();
        driver.get(baseUrl);
        
        Thread.sleep(1000);

        String expectedTitle = "Sign-on: Mercury Tours";
        String actualTitle;
        
        driver.findElement(By.name("login")).click();
        actualTitle = driver.getTitle();
        
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        // Set local location of ChromDriver executable here
        System.setProperty("webdriver.chrome.driver", "/home/yogi1/Programs/Selenium Projects/chromedriver");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        // To go back to Home page and quit
        driver.findElement(By.linkText("Home")).click();
        
        Thread.sleep(1000);
        
        driver.quit();
    }
}
