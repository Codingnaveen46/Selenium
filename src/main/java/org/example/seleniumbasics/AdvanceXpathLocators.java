package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathLocators {

    //Advanced Xpath : refrenceElement/relationship::targetElement

    //child
    //parent
    //ancestor
    //following-sibling
    //preceding-sibling
    //following
    //preceding
    // (with in the family)
    //=> / (child)

    //==> sibling ==> parent  ==>ancestor ==> ancestor's parent


    //ancestor: //ul[@class='leftmenu']
    //parent: //li
    //sibling:
    //target : //a[text()='Services']

    //ul[@class='leftmenu']/child::li/child::a[text()='Services']
    //ul[@class='leftmenu']//a[text()='Services']
    //li[@class='Solutions']/following-sibling::li/child::a[text()='Services']

    public static void main(String[] args) {

//        1. Launch the Browser window (Browser = Chrome)
        WebDriver driver = new ChromeDriver();

//        2. Maximize the browser window
        driver.manage().window().maximize();

//        3. Delete all browser cookies
        driver.manage().deleteAllCookies();

//        4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)
        driver.get("https://parabank.parasoft.com/parabank/index.htm&quot");

//        5. Locate google search textbox
                driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));



    }

}
