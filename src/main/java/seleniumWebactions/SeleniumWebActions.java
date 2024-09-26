package seleniumWebactions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class SeleniumWebActions {

    //WebElements

    //Buttons
    //textbox
    //Dropdown
    //RadioButtons
    //Checkbox
    //Images
    //Labels/text
    //Hyperlinks
    //ScrollBars
    //Web tables
    //calendars

    public static void main(String[] args) {

//        1. Launch the Browser window (Browser = Chrome)
        WebDriver driver = new ChromeDriver();

//        2. Maximize the browser window
        driver.manage().window().maximize();

//        3. Delete all browser cookies
        driver.manage().deleteAllCookies();

//        4. Enter URL and Launch the Application (https://www.google.co.in/)
        driver.get("https://www.google.co.in/");

//        5. Locate google search textbox using 'syntax1'
      //  driver.findElement(By.xpath("");
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]"));

        // common web actions

        //whether element is displayed in the page ?
        boolean isElementDisplayed = element.isDisplayed();

        //whether element is enabled in the page ?
        boolean isElementEnabled = element.isEnabled() ;


        //regular element actions

        //Button
        //check label of the button
        String Iflabelastext = element.getText();
        String IflabelasAttribute = element.getAttribute("value");


        //click action

        element.click(); //normal click

        //click on the hidden element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);

        //Scroll to the element
        js.executeScript("arguments[0].scrollIntoView()",element);

        //type in the disabled element
        js.executeScript("arguments[0].value-'text'",element);

        //click using actions class
        Actions action = new Actions(driver);
        action.click(element).perform();

        //doubleclick
        action.doubleClick(element).perform();

        //rightclick
        action.contextClick(element).perform();

        //clickandhold
        action.clickAndHold(element).perform();

        //drag and drop
        action.dragAndDrop(element,element).perform();

        //mouse hover
        action.moveToElement(element).perform();

        //type
        action.sendKeys("ttext").keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).perform();


        // if the element is text box

        //clear the textbox
        element.clear();

        //enter the text into textbox
        element.sendKeys("textbox" + Keys.ENTER);

        // dropdown element

        //select one of the option from dropdown
        Select s = new Select(element);
        s.selectByIndex(1);
        s.selectByValue("ws");
        s.selectByVisibleText("web services");


        //verifiy the selected options

        String selectedoptions = s.getFirstSelectedOption().getText();

        //verifiy total options available

        List<WebElement> options = s.getOptions();
        int totaloptions = options.size();

        for (WebElement option : options){
            System.out.println(option.getText());
        }


        //when dropdown is multimultiple options

        boolean isDropdownmultiselect = s.isMultiple();
        s.selectByIndex(1);
        s.selectByValue("ws");
        s.selectByVisibleText("web services");

        s.deselectByIndex(0);
        s.selectByValue("ws");
        s.selectByVisibleText("web services");


    }
}
