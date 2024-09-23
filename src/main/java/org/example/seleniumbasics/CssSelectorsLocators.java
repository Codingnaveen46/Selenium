package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsLocators {

    //Syntax 1 : tagName#id
    //Syntax 2 : tagName .className
    //Syntax 3 : tagName [attribute = attribute-value]


    //Syntax 4 :  ancestors > parent ancestors > parent > target
    public static void main(String[] args) {

        //locate google search using css locators


        WebDriver DRIVER = new ChromeDriver();
        DRIVER.get("https://www.google.com/");
        DRIVER.findElement(By.cssSelector("textArea#APjFqb"));
        DRIVER.findElement(By.cssSelector("textArea.gLFyf"));
        DRIVER.findElement(By.cssSelector("textArea[title = 'Search']" ));



    }
}
