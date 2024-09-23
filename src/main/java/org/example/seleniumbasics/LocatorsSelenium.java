package org.example.seleniumbasics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelenium {

    public static void main(String[] args) {

        // webelement ==> elements displayed in the UI ==> Webelement signbutton = driver.findELement(By.locatorType("LOCATOR VALUE")
        // Locators ==> selenium methods used to locate the webelements : by signinnbutton = By ie store Type("locatorsvalue)

        /*
        1 id => id attribute value of the element html code
        2 name => name of the attribute value of element html code
        3 className => class attribute value of the html code
        4 tagName ==> html tag values of element html code

        5 LinkText => text value of hyper link
        6 PartialLinkText => partial text value of hyperlink


        7 cssSelectors
        8 Xpath
        9 RelativeLocator


        //Purple color = "Html elements"
         */
        //5 locate google search textbox using id locator
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb"));
        driver.findElement(By.name("q"));
        driver.findElement(By.className("gLFyf"));
        driver.findElement(By.tagName("TextArea"));

        //locate safe link using linktextlocators

        driver.findElement(By.linkText("Watch and learn how to stay safe from scammers"));

        //locate safe link using partial link text locator
        driver.findElement(By.partialLinkText("stay safe from scammers"));









    }
}
