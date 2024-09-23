package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnSelectors {
    public static void main(String[] args) {

        // locating all the elements in para bank using csslocators manpage and admin page

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        driver.findElement(By.cssSelector("#topPanel > a:nth-child(2) > img"));
        driver.findElement(By.tagName("p[class='caption']"));
        driver.findElement(By.cssSelector("#headerPanel > ul.button > li.home > a"));
        driver.findElement(By.cssSelector("#headerPanel > ul.button > li.aboutus > a"));
        driver.findElement(By.cssSelector("#headerPanel > ul.button > li.contact > a"));
        driver.findElement(By.className("Solutions"));
        driver.findElement(By.cssSelector("ul[class='leftmenu'] > li >a[href='about.htm']"));
        driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));
        driver.findElement(By.cssSelector("ul[class = 'leftmenu'] > li > a[href = \"http://www.parasoft.com/jsp/products.jsp\"]"));
        driver.findElement(By.cssSelector("ul[class = 'leftmenu'] > li > a[href = \"http://www.parasoft.com/jsp/pr/contacts.jsp\"]"));
        driver.findElement(By.linkText("Admin Page "));
        driver.findElement(By.linkText("Customer Login"));
        driver.findElement(By.cssSelector("#loginPanel > form > p:nth-child(1) > b")); //doubt
        driver.findElement(By.cssSelector("div[class='login'] > input[name='username']"));
        driver.findElement(By.cssSelector("#loginPanel > form > p:nth-child(3) > b"));
        driver.findElement(By.cssSelector("div[class='login'] > input[name='password']")); //doubt
        driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input"));
        driver.findElement(By.cssSelector("#loginPanel > p:nth-child(2) > a"));
        driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a"));
        //Atm services locators
        driver.findElement(By.className("captionone"));
        driver.findElement(By.cssSelector("#rightPanel > ul.services > li:nth-child(2) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.services > li:nth-child(3) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.services > li:nth-child(4) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.services > li:nth-child(5) > a"));
        //Online services
        driver.findElement(By.className("captiontwo"));
        driver.findElement(By.cssSelector("#rightPanel > ul.servicestwo > li:nth-child(2) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.servicestwo > li:nth-child(3) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.servicestwo > li:nth-child(4) > a"));
        driver.findElement(By.cssSelector("#rightPanel > p:nth-child(4) > a"));
        //LatestNews
        driver.findElement(By.cssSelector("#rightPanel > ul.events > li:nth-child(2) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.events > li:nth-child(3) > a"));
        driver.findElement(By.cssSelector("#rightPanel > ul.events > li:nth-child(4) > a"));
        driver.findElement(By.cssSelector("#rightPanel > p:nth-child(7) > a"));

        //Footer page
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(1) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(2) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(3) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(3) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(4) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(5) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(6) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(7) > a"));
        driver.findElement(By.cssSelector("#footerPanel > ul:nth-child(1) > li:nth-child(8) > a"));
        driver.findElement(By.className("copyright"));
        driver.findElement(By.className("visit"));

        //Admin panel
        driver.findElement(By.cssSelector("#rightPanel > h1"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(1) > h3"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(2) > h3"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(1) > form > table > tbody > tr > td:nth-child(1) > button"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(1) > form > table > tbody > tr > td:nth-child(2) > button"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(2) > form > table > tbody > tr > td:nth-child(1) > b"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(2) > form > table > tbody > tr > td:nth-child(1) > b "));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(2) > form > table > tbody > tr > td:nth-child(2)"));
        driver.findElement(By.cssSelector("#rightPanel > table > tbody > tr > td:nth-child(2) > form > table > tbody > tr > td:nth-child(3) > input"));

        //Data Access Mode
        driver.findElement(By.cssSelector("#adminForm > h3:nth-child(1)"));
        driver.findElement(By.cssSelector("input[value='soap']"));
        driver.findElement(By.cssSelector("input[value='restxml']"));
        driver.findElement(By.id("accessMode3"));
        driver.findElement(By.id("accessMode4"));

        //Web service
        driver.findElement(By.cssSelector("#adminForm > table:nth-child(5) > tbody > tr:nth-child(1) > td > a:nth-child(2)"));
        driver.findElement(By.cssSelector("#adminForm > table:nth-child(5) > tbody > tr:nth-child(1) > td > a:nth-child(3)"));
        driver.findElement(By.cssSelector("#adminForm > table:nth-child(5) > tbody > tr:nth-child(1) > td > a:nth-child(4)"));
        driver.findElement(By.id("soapEndpoint"));
        driver.findElement(By.id("restEndpoint"));
        driver.findElement(By.cssSelector("[name='endpoint']"));

        //Application Setting

        driver.findElement(By.id("initialBalance"));
        driver.findElement(By.id("minimumBalance"));

        //loan provider and loan processer did not completed becaue its drop down
        driver.findElement(By.id("loanProcessorThreshold"));
        driver.findElement(By.tagName("input[value='Submit'"));































    }
}
