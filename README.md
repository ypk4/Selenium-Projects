# Selenium-Projects
Repository contains sample Selenium WebDriver and TestNG projects for Automation Testing of web application on Chrome browser.

1. WebDriverApplication - Contains code for testing one functionality of website "http://newtours.demoaut.com/" using Selenium WebDriver

2. TestNGApplication - Contains code for testing functionality of the same website using Selenuim TestNG.

To setup Selenium WebDriver :-
1. Download latest Selenium library for Java from https://www.seleniumhq.org/download/ and extract the zip.
2. Add all JAR files inside extracted folder and inside libs folder to the project.
3. Download appropriate ChromeDriver depending on your OS from http://chromedriver.chromium.org/downloads
4. Add local path of ChromeDriver to 'Dwebdriver.chrome.driver' system variable in the program. 
This can be done by adding this line initially in the code:- 
System.setProperty("webdriver.chrome.driver", "local/location/of/chromedriver");
You can use FirefoxDriver or IEDriver alternatively if you want to run automation test on browser other than Chrome. Here, tests are written for Chrome.

To setup TestNG :-
1. Download latest Selenium library for Java from https://www.seleniumhq.org/download/ and extract the zip.
2. Add all JAR files inside extracted folder and inside libs folder to the project.
3. Download appropriate ChromeDriver depending on your OS from http://chromedriver.chromium.org/downloads
4. Add local path of ChromeDriver to 'Dwebdriver.chrome.driver' system variable in the program. 
This can be done by adding this line initially in the code:- 
System.setProperty("webdriver.chrome.driver", "local/location/of/chromedriver");
You can use FirefoxDriver or IEDriver alternatively if you want to run automation test on browser other than Chrome. Here, tests are written for Chrome.
5. Add TestNG library to the project. If the library is not available by default in your IDE, you need to install it. It is usually there in NetBeans by default. In Eclipse, you may need to install it by following Help -> Add plugin / Install -> Add repository -> TestNG
