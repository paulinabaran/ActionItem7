package PageObjects;

import ReusableClasses.ReusableActions_POMLoggers;
import ReusableClasses.ReusableAnnotationsClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AI7_InputPage extends ReusableAnnotationsClass {
    //declare the Extent Test for each page object class
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class so you can make your
    //page object class static when you call it in your test class
    public AI7_InputPage(WebDriver driver) {
        //page factory fc for page object
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotationsClass.logger;
    }//end of constructor

    //define all the WebElements using @find by concept
    @FindBy(xpath = "//*[@placeholder='Amount']")
    WebElement annualIncomeClick;

    @FindBy(xpath = "//*[@placeholder='Amount']")
    WebElement annualIncomeIteration;

    @FindBy(xpath = "//*[@id='monthlyExpense']")
    WebElement householdIncomeClick;

    @FindBy(xpath = "//*[@id='monthlyExpense']")
    WebElement houseHoldIncomeIteration;

    @FindBy(xpath = "//*[@id='addtnlRetmntSavings']")
    WebElement savedClick;

    @FindBy(xpath = "//*[@id='addtnlRetmntSavings']")
    WebElement savedIteration;

    @FindBy(xpath = "//*[@id='outsideAnnlCntbAmt']")
    WebElement investClick;

    @FindBy(xpath = "//*[@id='outsideAnnlCntbAmt']")
    WebElement investIteration;

    public void clickAnnualIncome() {
        ReusableActions_POMLoggers.clickAction(driver, annualIncomeClick, logger, "Annual Income Click");
    }//end of annual income click

    public void annualIncomeIterating() {
        //create Array List to test multiple send keys actions
        ArrayList<String> annual = new ArrayList<>();
        annual.add("abc");
        annual.add("100000");

        for (int i = 0; i < annual.size(); i++) {
            ReusableActions_POMLoggers.sendKeysActionIteration(driver, annualIncomeIteration, annual, i, logger, "Annual Income Iteration");
        }//end of for loop
    }//end of annual income

    public void clickHouseholeIncome() {
        ArrayList<String> houseHold = new ArrayList<>();
        houseHold.add("abc");
        houseHold.add("1000");

        ReusableActions_POMLoggers.clickAction(driver, householdIncomeClick, logger, "Household Income Click");

        }//end of household income click

    public void householdIncomeIterating() {
        ArrayList<String> houseHold = new ArrayList<>();
        houseHold.add("abc");
        houseHold.add("1000");

        for (int i = 0; i < houseHold.size(); i++) {
            ReusableActions_POMLoggers.sendKeysActionIteration(driver, houseHoldIncomeIteration, houseHold, i, logger, "Household Income Iteration");
        }//end of for loop
    }//end of household

    public void clickSaved() {
        ReusableActions_POMLoggers.clickAction(driver, savedClick, logger, "Saved Income Click");
    }//end of saved income click

    public void savedIncomeIteration() {
        ArrayList<String> houseHold = new ArrayList<>();
        houseHold.add("abc");
        houseHold.add("1000");

        for (int i = 0; i < houseHold.size(); i++) {
            ReusableActions_POMLoggers.sendKeysActionIteration(driver, houseHoldIncomeIteration, houseHold, i, logger, "Household Income Iteration");
        }//end of for loop
    }//end of household

    public void clickInvest() {
        ReusableActions_POMLoggers.clickAction(driver, investClick, logger, "invested click");
    }//end of invested click

    public void investedIterating() {
        //create Array List to test multiple send keys actions
        ArrayList<String> Invest = new ArrayList<>();
        Invest.add("abc");
        Invest.add("1000");

        for (int i = 0; i < Invest.size(); i++) {
            ReusableActions_POMLoggers.sendKeysActionIteration(driver, investIteration, Invest, i, logger, "Invested Iteration");
        }//for loop

    }//end of investing iteration

}//end of class