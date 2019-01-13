/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webdriverapplication;

import static java.lang.System.exit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverApplication {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/yogi1/Programs/Selenium Projects/chromedriver");
        // Set local location of ChromDriver executable here
        
        String baseUrl = "http://newtours.demoaut.com";
        WebDriver driver = new ChromeDriver();
        
        // Open a Chrome browser and open URL
        driver.manage().window().maximize();
        driver.get(baseUrl);
        
        Thread.sleep(1000);
        

        // 1. To check if correct page is visited :-
        String expectedTitle = "Sign-on: Mercury Tours";
        String actualTitle;
        
        driver.findElement(By.name("login")).click();
        actualTitle = driver.getTitle();
        System.out.println("actual title " + actualTitle);
        
        if(actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Text case passed - Correct page is visited");
        }
        else {
            System.out.println("Test case failed - Correct page is NOT visited");
            driver.quit();
            exit(1);
        }
        

        // 2. To check login credentials :-
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("tutorial");
        
        Thread.sleep(1000);     // To let the user actually see something
        
        driver.findElement(By.name("login")).click();
                
        // To go back to Home page and quit
        driver.findElement(By.linkText("Home")).click();
        
        Thread.sleep(1000);
        
        driver.quit();
        
    }
    
}
