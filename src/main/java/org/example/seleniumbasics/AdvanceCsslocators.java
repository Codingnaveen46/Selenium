package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceCsslocators {
    public static void main(String[] args) {



        WebDriver DRIVER = new ChromeDriver();
        DRIVER.get("https://parabank.parasoft.com/parabank/admin.htm");
        DRIVER.findElement(By.cssSelector("ul[class='leftmenu']>li>a[href ='services.htm']"));
       /* DRIVER.findElement(By.cssSelector("textArea#APjFqb"));
        DRIVER.findElement(By.cssSelector("textArea.gLFyf"));
        DRIVER.findElement(By.cssSelector("textArea[title = 'Search']" ));
        DRIVER.findElement(By.linkText("Services"));
        DRIVER.findElement(By.cssSelector("a[href = 'service.htm']"));*/

    }
}
