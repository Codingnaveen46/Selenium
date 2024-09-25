package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
    //xpath is nothing but XML Path two different xpaths
        //1 Absolute xpath  ==>  Full xml path starts with /


        //2 Relative xpath  ==>  Starts with // ==>
            //basic syntax for relative xpath
                // 1: //tagName[@Attribute = 'Attribute-value']
                // 2: //tagName[text() = 'text-value']

    //Advance level
    //syntax3 ; //tag name[contains(@Attribute, 'Partial-Attribute

    //Xpath ==> Absolute Xpath, Relative Xpath ==> Start with //

    /******************** Basic Syntaxes **********************/

    //Syntax 1: //tagName[@Attribute = 'Attribute-Value']
    //Syntax 2: //tagName[text()='text-value']

    /********************* Level 2 - contains/start-with **********************/
    // lengthy attribute /text values can be cut-short by using contains/start-with

    //Syntax 3://tagName[contains(@Attribute , 'Partial-Attribute-Value')]
    //Syntax 4://tagName[contains(text(),'partial-text-value')]

    //Syntax 5://tagName[starts-with(@Attribute , 'Partial-Attribute-Value')]
    //Syntax 6://tagName[starts-with(text(),'partial-text-value')]

    /********************* Level 3 - using multiple attribute & text values using and **********************/
    //Syntax 7: //tagName[@Attribute1 = 'Attribute-Value' and @Attribute2 = 'Attribute-Value' and text()='text-value']


    public static void main(String[] args) {

//        1. Launch the Browser window (Browser = Chrome)
        WebDriver driver = new ChromeDriver();

//        2. Maximize the browser window
        driver.manage().window().maximize();

//        3. Delete all browser cookies
        driver.manage().deleteAllCookies();

//        4. Enter URL and Launch the Application (https://www.google.co.in/)
        driver.get("https://www.google.co.in/&quot");

//        5. Locate google search textbox using 'syntax1'
                driver.findElement(By.xpath("//textarea[@title='Search']"));

//        6. Locate gmail link using 'syntax2'
        driver.findElement(By.xpath("//a[text()='Gmail']"));

//        7. Locate how search work link using 'syntax3'
        driver.findElement(By.xpath("//a[contains(@href,'howsearchworks')]"));

//        9. Locate how search work link using 'syntax4'
        driver.findElement(By.xpath("//a[contains(text(),'Search works')]"));

//        10. Locate how search work link using 'syntax5'
        driver.findElement(By.xpath("//a[starts-with(@href,'https://google')]&quot"));

//        11. Locate how search work link using 'syntax6'
                driver.findElement(By.xpath("//a[starts-with(text(),' How')]"));

//        12. Locate google search textbox using 'syntax7'
        driver.findElement(By.xpath("//textarea[@title='Search'  and @aria-label='Search' and @role='combobox']"));

//        13. Locate gmail link using 'syntax7'
        driver.findElement(By.xpath("//a[@aria-label='Gmail ' and text()='Gmail']"));
    }
}


