package ActionItems;

import PageObjects.Ai_BaseClass;
import PageObjects.BaseClass;
import ReusableClasses.ReusableAnnotationsClass;
import org.testng.annotations.Test;

public class AI7_PrudentialUseCasePOM extends ReusableAnnotationsClass {

        @Test
        public void StartNow() {
            driver.navigate().to("https://www.prudential.com/personal/retirement/calculator");
            Ai_BaseClass.ai7_startNowCalculator().startNowClick();
            Ai_BaseClass.ai7_startNowCalculator().switchTabs();
            Ai_BaseClass.ai7_startNowCalculator().verifyTitle();
        }//end of test 1

     @Test(dependsOnMethods = "StartNow")
        public void BirthdayPage() {
            Ai_BaseClass.ai7_birthdayPage().verifyText();
            Ai_BaseClass.ai7_birthdayPage().birthdayLetterTest();
            Ai_BaseClass.ai7_birthdayPage().continueNext();
     }//end of test 2

    @Test(dependsOnMethods = "BirthdayPage")
    public void InputPage() {
            Ai_BaseClass.ai7_inputPage().clickAnnualIncome();
            Ai_BaseClass.ai7_inputPage().annualIncomeIterating();
            Ai_BaseClass.ai7_inputPage().clickHouseholeIncome();
            Ai_BaseClass.ai7_inputPage().householdIncomeIterating();
            Ai_BaseClass.ai7_inputPage().clickSaved();
            Ai_BaseClass.ai7_inputPage().savedIncomeIteration();
            Ai_BaseClass.ai7_inputPage().clickInvest();
            Ai_BaseClass.ai7_inputPage().investedIterating();
    }//end of test 3

}//end of class
