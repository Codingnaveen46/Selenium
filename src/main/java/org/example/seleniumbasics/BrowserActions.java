package org.example.seleniumbasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserActions {

    public static void main(String[] args) {

//        1. Launch the Browser window (Browser = Chrome)
        WebDriver driver = new ChromeDriver();

//        2. Minimize browser window
        driver.manage().window().minimize();

//        3. Maximize to specific resolution(800X400)
        driver.manage().window().setSize(new Dimension(430, 932));

//        4. Maximize the browser window
        driver.manage().window().maximize();

//        5. Delete all browser cookies
        driver.manage().deleteAllCookies();

//        6. Enter URL and Launch the Application (https://www.google.co.in/)
        driver.get("https://www.google.co.in/");

//        7. Verify the application title (Google)
        String expected = "Google";
        String actual = driver.getTitle();

        Assert.assertEquals(expected, actual);

        System.out.println(actual);

//        8. Navigate to Different application (https://www.selenium.dev/)
        driver.navigate().to("https://www.selenium.dev/");
//        9. Go back to previous application
        driver.navigate().back();
//        10. Move forward to next application
        driver.navigate().forward();
//        11. Refresh the application
        driver.navigate().refresh();

//        12.collect the main window id
        String mainwindow = driver.getWindowHandle();
        System.out.println("Main window: " + mainwindow);

//        13.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://in.search.yahoo.com/&quot;");

//        14. Switch back to the main window
        driver.switchTo().window(mainwindow);

//        15.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://parabank.parasoft.com/parabank/index.htm&quot");
//        16.Switch back to main window
        driver.switchTo().window(mainwindow);
//        17.Print browser window URL
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
//        18. Get the Size of window
        Dimension size = driver.manage().window().getSize();
        System.out.println(size.getWidth());
        System.out.println(size.getHeight());

//        19. Close Current Window

        driver.close();

//        20. Close all remaining windows

        driver.quit();


    }
}
