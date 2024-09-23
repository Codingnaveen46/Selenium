package org.example.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {

    // Assertions

    // Hard Assertions ==> will fail the program immediately
    // when there is a failure

    // Soft Assertions ==> will fail the program at
    // the end even though there are multiple failure



    //Hard assertions













     //soft Assertions



    public static void main(String[] args) {
/*
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        String expectedString = "Google";
        String actualString = driver.getTitle();

        Assert.assertEquals(expectedString, actualString);*/

        //Hard assertions
      //  Assert.assertEquals("Yahoo","Google");
       // Assert.assertNotEquals("Yahoo" ,"Google");
       // Assert.assertTrue(2>1);
       // Assert.
      //  Assert.
       // Assert.fail("i want to fail this test");


        //soft Assertions

       SoftAssert softassert = new SoftAssert();

/*         softassert.assertEquals("Yahoo","Google");
         softassert.assertNotEquals("Google","yahoo");
         softassert.assertTrue(2>1);
         softassert.assertFalse(1>3);
         softassert.assertNotNull(null);
         softassert.fail("i want to fail this test");
       softassert.assertAll();*/

        //        6. Enter URL and Launch the Application (https://www.google.co.in/)
 /*       WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");

//        7. Verify the application title (Google)
        String expected = "google";
        String actual = driver.getTitle();

        Assert.assertEquals(expected, actual);

        System.out.println(expected);
*/








    }
}
