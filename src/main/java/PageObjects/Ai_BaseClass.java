package PageObjects;

import ReusableClasses.ReusableAnnotationsClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Ai_BaseClass extends ReusableAnnotationsClass {
    public Ai_BaseClass(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //end of constructor class

    //create static reference for startNow page
    public static AI7_StartNowCalculator ai7_startNowCalculator(){
        AI7_StartNowCalculator ai7_startNowCalculator = new AI7_StartNowCalculator(driver);
        return  ai7_startNowCalculator;
    }//end of ai7_StartNowCalc method


    //create static reference for birthday page
    public static AI7_BirthdayPage ai7_birthdayPage(){
        AI7_BirthdayPage ai7_birthdayPage = new AI7_BirthdayPage(driver);
        return  ai7_birthdayPage;
    }//end of birthday page

    //create static reference for Input page
    public static AI7_InputPage ai7_inputPage(){
        AI7_InputPage ai7_inputPage = new AI7_InputPage(driver);
        return  ai7_inputPage;
    }//end of birthday page


} //end of class

