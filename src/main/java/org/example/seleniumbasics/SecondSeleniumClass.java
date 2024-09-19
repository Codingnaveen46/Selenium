package org.example.seleniumbasics;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumClass {

    public static void main(String[] args) {

        /*
        	WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		//unimplemented method is empty body
		driver.manage().window().setSize(new Dimension(430, 932)); //iphone if need to open
	//	driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		 String expectedString = "Google";
	        String actualString = driver.getTitle();

	        Assert.assertEquals(expectedString, actualString);



         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(430, 932));
        driver.navigate().to("www.google.com");


    }
}
