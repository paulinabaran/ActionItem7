package PageObjects;

import ReusableClasses.ReusableActions_POMLoggers;
import ReusableClasses.ReusableAnnotationsClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AI7_BirthdayPage extends ReusableAnnotationsClass {
    //declare the Extent Test for each page object class
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class so you can make your
    //page object class static when you call it in your test class
    public AI7_BirthdayPage(WebDriver driver){
        //page factory fc for page object
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotationsClass.logger;
    }//end of constructor

    //define all the WebElmenets using @find by concept
    @FindBy(xpath = "//*[@id='dateOfBirth']")
    WebElement birthdayLetterTest;

    @FindBy(xpath= "//*[text()= '(MM/DD/YYYY)']")
    WebElement verifyBirthdayPageText;

    @FindBy(xpath= "//*[@class='btn btn-block btn-primary mt-4 mb-4']")
    WebElement Continue;

    public void verifyText(){
        ReusableActions_POMLoggers.verifyText(driver, "(MM/DD/YYYY)", verifyBirthdayPageText, logger, "Birthday Format");
    }//end of verify text

    public void birthdayLetterTest(){
        //create array list to test multiple send keys actions
        ArrayList<String> date = new ArrayList<>();
        date.add("abc");
        date.add("08022001");

        //create for loop to go through array list above in the Birthday input
        for(int i = 0; i< date.size(); i++) {
            ReusableActions_POMLoggers.sendKeysActionIteration(driver, birthdayLetterTest, date, i, logger, "Birthday Letter Test ");
        }//end of for loop
    }//end of birthdaylettertest

    public void continueNext(){
        ReusableActions_POMLoggers.clickAction(driver, Continue, logger, "Continue Next");
    }//end of continue


}
