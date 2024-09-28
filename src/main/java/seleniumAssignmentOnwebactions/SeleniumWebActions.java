package seleniumAssignmentOnwebactions;

import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SeleniumWebActions {

    public static By cell(int row, int col) {
        return By.xpath("//div[@id='rightPanel']//table[2]//tr["+row+"]//td["+col+"]");
    }

    public static By dbaMode(String option) {
        return By.xpath("//input[@value='"+option+"']");
    }

    public static void main(String[] args) {

        //        1. Launch browser window(Chrome)
        WebDriver driver = new ChromeDriver();

        //        2. Maximize the browser window
        driver.manage().window().maximize();

        //        3. Delete all the cookies
        driver.manage().deleteAllCookies();

        //        4. Enter URL and Launch the application
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //        5. Verify application title (ParaBank | Welcome | Online Banking)

        String expected = "ParaBank | Welcome | Online Banking";
        String title =   driver.getTitle();
        Assert.assertEquals(expected,title);
        System.out.println(title);

//        6. Verify application logo
        WebElement element  = driver.findElement(By.xpath("//img[@alt = 'ParaBank']"));
        boolean IsLogoDisplayed = element.isDisplayed();
        System.out.println(IsLogoDisplayed);

//        7. Verify application caption (Experience the difference)
        String actual  = driver.findElement(By.xpath("//p[@class = 'caption']")).getText();
        String ExpectedCaption = "Experience the difference";
        Assert.assertEquals(ExpectedCaption,actual);
        System.out.println(actual);

//        8. Enter Invalid credentials in Username and Password textboxes
        WebElement usernametext =  driver.findElement(By.xpath("//input[@name = 'username']"));
        WebElement passwordtxt =  driver.findElement(By.xpath("//input[@name = 'password']"));

        usernametext.click();
        usernametext.sendKeys("sdfsdffsdf");
        passwordtxt.clear();
        passwordtxt.sendKeys("sdfsdfsdf");

//        9. Verify button label (LOG IN) and Click on Login Button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

        String expValue = "LOG IN";
        String actValue = loginBtn.getAttribute("value").toUpperCase();
        Assert.assertEquals(actValue, expValue);

        loginBtn.click();

//        10. Verify error message is coming
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));

//        11. Click on Admin page link
      WebElement adminpagelink =   driver.findElement(By.xpath("//a[text()='Admin Page']"));
      adminpagelink.click();
//        12. Wait for admin page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        13. Select Data access mode as ' SOAP'
        WebElement dbaMode = driver.findElement(By.linkText("Soap"));
        dbaMode.click();
//        14. Scroll-down till Loan provider
        WebElement loanproviderdrop = driver.findElement(By.xpath("//select[@id='loanProvider']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollintoView()",loanproviderdrop);

//        15. Select Loan provider as 'Web Service'
        Select s = new Select(loanproviderdrop);
        s.selectByVisibleText("Web Service");
//        16. Click on Submit button
        WebElement submitbtn = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitbtn.click();
//        17. wait for Successful submission message
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
//        18. Click on Services Link
        WebElement serviceLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
        serviceLink.click();
//        19. Wait for Services page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        20. Scroll-down till Bookstore services
        WebElement scrolldownbook = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
        js.executeScript("arguments[0].scrollintoView()",scrolldownbook);
//        21. Get total rows, columns in the bookstore service table
        List<WebElement> rows = driver.findElements(By.xpath("//div[@id='rightPanel']//table[2]//tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//div[@id='rightPanel']//table[2]//tr[1]//td"));

        int totalrows = rows.size();
        int totalColumns = columns.size();
        Assert.assertEquals(totalrows,8);
        Assert.assertEquals(totalColumns,3);

//        22. Get Column headers of book store services table

        for(WebElement col : columns){
            System.out.println(col.getText());
        }
//        23. Get all the data from book store service table
        for(int r=1; r<= totalrows; r++) {
            for(int c=1; c<=totalColumns;c++) {
                WebElement Cell = driver.findElement(cell(r,c));
                System.out.println(" Row "+r+" Column "+c+" value is : "+Cell.getText());
            }
        }
//        24. Close browser window
        driver.quit();




    }
}
