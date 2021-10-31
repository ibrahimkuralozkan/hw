package com.tests;

import com.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Checkbox_Homework_with_TestNG  {


/*
SeleniumEasy Checkbox Verification – Section 1 and 2 1.Open Chrome browser
2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
3.Verify “Success – Check box is checked” message is NOT displayed.
4.Click to checkbox under “Single Checkbox Demo” se ction
5.Verify “Success – Check box is checked” message is displa yed.
SeleniumEasy Checkbox Verification –Section 2 1.Open Chrome browser
2.Go to http://www.seleniumeasy.com/test/basic-checkbox-d emo.html
3.Verify “Check All” button text is “Check All” 4.Click to
“Check All” button 5.Verify all check boxes are checked 6.Veri fy button text changed to “Uncheck All”
 */


    WebDriver driver;


    @BeforeClass
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
       // driver.close();

    }


    @Test
    public void test1(){





    }










}
