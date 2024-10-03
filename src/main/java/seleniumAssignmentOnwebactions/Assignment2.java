package seleniumAssignmentOnwebactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Assignment2 {

    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException, AWTException {

//        1. Launch browser window(Chrome)
        driver = new ChromeDriver();

//        2. Maximize the browser window
        driver.manage().window().maximize();

//        3. Delete all the cookies
        driver.manage().deleteAllCookies();

//        4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
        driver.get("https://demoqa.com/automation-practice-form");

//        5. Wait for Page-load
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        6. Enter First name and Last name
        WebElement firstNameTxtb = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lastNameTxtb = driver.findElement(By.xpath("//input[@id='lastName']"));

        firstNameTxtb.sendKeys("Bharath");
        lastNameTxtb.sendKeys("Reddy");

//        7. Enter Email
        WebElement emailTxtb = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailTxtb.sendKeys("BharathTechAcademy@gmail.com");

//        8. Select Gender (Male)
        selectGender("Male");

//        9. Enter mobile number
        WebElement phoneTxtb = driver.findElement(By.xpath("//input[@id='userNumber']"));
        phoneTxtb.sendKeys("9553220022");

//        10.Select DOB (1-Feb-1991)
        selectDOB("1", "February", "1991");

//        11.Search and Select Computer Science
        selectSubject("Computer Science");

//        12.Select Hobbies as Sports and Reading
        String [] hobbies = {"Sports","Reading"};
        selectHobbies(hobbies);

        String filePath =System.getProperty("user.dir")+"\\Files\\images.jpeg";

//        13.Upload photo
//        WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//        uploadPhoto.sendKeys(filePath);

        WebElement uploadPhoto = driver.findElement(By.xpath("//label[@for='uploadPicture']"));
        uploadPhoto.click();

//        14. Wait till window open to upload the file
        Thread.sleep(5000);

//        15. Upload file
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(filePath), null);

        Robot robo = new Robot();

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);

        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);

        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);

//        16. Wait till file upload
        Thread.sleep(5000);

//        17.Submit Details
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", submitBtn);

//        18. Close browser window
        driver.quit();

    }

    public static void selectGender(String option) {
        WebElement emailTxtb = driver.findElement(By.xpath("//label[text()='"+option+"']"));
        emailTxtb.click();
    }

    public static void selectDOB(String date, String month, String year) {

        //open the calendar
        WebElement calendar = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        calendar.click();

        //select the month
        WebElement monthDrp = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
        Select selectMonth = new Select(monthDrp);
        selectMonth.selectByVisibleText(month);

        //select the year
        WebElement yearDrp = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
        Select selectYear = new Select(yearDrp);
        selectYear.selectByVisibleText(year);

        //Select the date
        WebElement dateField = driver.findElement(By.xpath("//div[text()='"+date+"' and contains(@aria-label,'"+month+"')]"));
        dateField.click();
    }

    public static void selectSubject(String subject) {
        WebElement subjectsSuggBox = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()", subjectsSuggBox);

        Actions action = new Actions(driver);
        action.sendKeys(subjectsSuggBox,subject).perform();

        //wait for option
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"), 0));

        //select the option
        WebElement option = driver.findElement(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"));
        option.click();
    }

    public static void selectHobbies(String [] hobbies) {
        for (String hobby : hobbies) {
            WebElement hobbyChkb = driver.findElement(By.xpath("//label[text()='"+hobby+"']"));
            if(!hobbyChkb.isSelected()) {
                hobbyChkb.click();
            }
        }

    }

}