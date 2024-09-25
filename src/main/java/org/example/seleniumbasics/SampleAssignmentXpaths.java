package org.example.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAssignmentXpaths {

    //locating using xpaths

    //ul[@class='leftmenu']/child::li/child::a[text()='Services']
    //ul[@class='leftmenu']//a[text()='Services']
    //li[@class='Solutions']/following-sibling::li/child::a[text()='Services']

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");

        driver.findElement(By.xpath("//li[@class = 'Solutions']"));
        driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text() = 'About Us']")).click();
        driver.findElement(By.xpath("//ul[@class = 'leftmenu']//a[text() = 'Services']"));
        driver.findElement(By.xpath("//ul[@class = 'leftmenu']/child::li/child::a[text() = 'Products']"));
        driver.findElement(By.xpath("//li[@class = 'Solutions']/following-sibling::li/child::a[text() = 'Locations']"));
        driver.findElement(By.xpath("//li[@class='Solutions']/following-sibling::li/child::a[text() = 'Admin Page']"));


        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[1]/form/table/tbody/tr/td[1]/button")); //this one i doubt how to select when we have tablebody






    }
}
