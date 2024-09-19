package org.example.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsConcepts {

    // Assertions

    // Hard Assertions ==> will fail the program immediately
    // when there is a failure

    // Soft Assertions ==> will fail the program at
    // the end even though there are multiple failure


    //soft Assertions









    //Hard assertions



    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        String expectedString = "Google";
        String actualString = driver.getTitle();

        Assert.assertEquals(expectedString, actualString);




    }
}
