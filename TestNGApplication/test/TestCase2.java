/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author yogi1
 */
public class TestCase2 {
    
    WebDriver driver;
    String baseUrl = "http://newtours.demoaut.com";
    
    public TestCase2() {
    }

    @Test
    public void testLogin1() throws InterruptedException {
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("tutorial");
        
        Thread.sleep(1000);     // To let the user actually see something
        
        driver.findElement(By.name("login")).click();
        
        // Check the title of page - If login is successful, expectedTitle will be title of page        
        String expectedTitle = "Find a Flight: Mercury Tours:";
        String actualTitle;
        
        driver.findElement(By.tagName("title"));
        actualTitle = driver.getTitle();
        
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    
    @Test
    public void testLogin2() throws InterruptedException {
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("wrong_password");
        
        Thread.sleep(1000);     // To let the user actually see something
        
        driver.findElement(By.name("login")).click();
        
        // Check the title of page - If login is successful, expectedTitle will be title of page        
        String expectedTitle = "Find a Flight: Mercury Tours:";
        String actualTitle;
        
        driver.findElement(By.tagName("title"));
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
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        // To go back to Home page and quit
        driver.findElement(By.linkText("Home")).click();
        
        Thread.sleep(1000);
        
        driver.quit();
    }
}
