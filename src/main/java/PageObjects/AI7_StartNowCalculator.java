package PageObjects;

import ReusableClasses.ReusableActions_POMLoggers;
import ReusableClasses.ReusableAnnotationsClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AI7_StartNowCalculator extends ReusableAnnotationsClass {
    //declare the Extent Test for each page object class
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class so you can make your
    //page object class static when you call it in your test class
    public AI7_StartNowCalculator(WebDriver driver){
        //page factory fc for page object
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotationsClass.logger;
    }//end of constructor

    //define all the WebElmenets using @find by concept
    @FindBy(xpath = "//*[@id='leftCTA2']")
    WebElement StartNow;


    public void startNowClick() {
        ReusableActions_POMLoggers.clickAction(driver, StartNow, logger, "Start Now");
    }//end of StartNow

    public void switchTabs () {
        ReusableActions_POMLoggers.switchToTabIndex(driver, 1);
    }//end of submit on google search

    public void verifyTitle () {
        ReusableActions_POMLoggers.verifyTitle(driver, " Prudential Financial", logger, "Verify Title");
    }//end of submit on google search

}


