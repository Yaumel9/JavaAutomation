import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObjects.TutorialPageObjects;
import static org.testng.AssertJUnit.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.List;

public class SeleniumTutorialLander {

    WebDriver driver;
    TutorialPageObjects tpo;

    @BeforeMethod (groups = {"sanity", "smoke"})
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        this.driver = new ChromeDriver();

        this.tpo = new TutorialPageObjects(driver);
        this.tpo.testGoToSite();
        //this.tpo.explicitWait();
    }

    @Test(groups = {"sanity"})
    public void fillInTextFields(){
        //Fill text fields
        this.tpo.nameField().sendKeys(this.tpo.testUserName());
        this.tpo.emailField().sendKeys(this.tpo.testUserEmail());
        this.tpo.phoneField().sendKeys(this.tpo.testPhoneNo());

        assertEquals(this.tpo.testUserName(), this.tpo.nameField().getAttribute("value"));
        assertEquals(this.tpo.testUserEmail(), this.tpo.emailField().getAttribute("value"));
        assertEquals(this.tpo.testPhoneNo(), this.tpo.phoneField().getAttribute("value"));
    }

    @Test(groups = {"smoke"})
    public void selectGender(){
        this.tpo.dropDownMenu().click();

        if(tpo.testGender() == 'M' || tpo.testGender() =='m')
            this.tpo.dropDownMale().click();
        else if(tpo.testGender() == 'F' || tpo.testGender() =='f')
            this.tpo.dropDownFemale().click();
        else
            System.out.println("Gender Selection Error");
    }

    @Test(groups = {"smoke"})
    public void clickOptCb(){

        this.tpo.chbTermsAndConditions().click();
    }

    @Test(groups = {"sanity"})
    //Identify elements without ids
    public void selectNameFieldByClassName(){
        this.tpo.nameFieldC().clear();
        this.tpo.nameFieldC().sendKeys("It Works");
        System.out.println(this.tpo.nameFieldC().getAttribute("value"));
        assertTrue("Text does not match", this.tpo.nameFieldC().getAttribute("value").contains("It Works"));
    }

    @Test(groups = {"sanity"})
    //Check for form validation messages
    public void formValidationMessages(){
        this.tpo.nameField().clear();
        this.tpo.phoneField().clear();
        this.tpo.emailField().clear();

        this.tpo.chbTerbClickMe().click();

        assertTrue(this.tpo.tNameValidationWarning().isDisplayed());
        assertTrue(this.tpo.tEmailValidationWarning().isDisplayed());
        assertTrue(this.tpo.tPhoneNoValidationWarning().isDisplayed());
    }

    //Check for successful form submit
    @Test
    public void successfulSubmission(){
        //Fill text fields
        this.tpo.nameField().sendKeys(this.tpo.testUserName());
        this.tpo.emailField().sendKeys(this.tpo.testUserEmail());
        this.tpo.phoneField().sendKeys(this.tpo.testPhoneNo());

        this.tpo.chbTerbClickMe().click();

        assertEquals("https://qxf2.com/selenium-tutorial-redirect", this.driver.getCurrentUrl());
    }

    //Hover and click
    @Test
    public void hoverAndClick(){

        Actions actions = new Actions(this.driver);
        actions.moveToElement(this.tpo.menuDropDown()).click();
        actions.moveToElement(this.tpo.menuResource()).perform();
        actions.moveToElement(this.tpo.menuGUIAutomation()).click().build().perform();

        assertEquals("https://qxf2.com/gui-automation-diy", this.driver.getCurrentUrl());
    }


    @Test
    //Count the number of rows in a table
    public void countRowsInTableExample(){
        //List <WebElement> rows = this.driver.findElements(By.xpath("/html/body/div[4]/div/div/table/tbody/tr/td[1]"));
        System.out.println("Number of rows " + this.tpo.rowsTableExample().size());
        System.out.println("Number of col " + this.tpo.colTableExample().size());
    }

    @Test
    //Get the text from a table row
    public void textTableExampleRowOne(){

        WebElement tableElement = this.driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody"));
        List<WebElement> tr_collection = tableElement.findElements(By.xpath("/html/body/div[4]/div/div/table/tbody/tr"));

        System.out.println("Numbers of rows in this table = "+ tr_collection.size());
        int rowNum = 1;
        int colNum;

        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            System.out.println("Number of colums = "+td_collection.size());
            colNum=1;
            for(WebElement tdElement : td_collection)
            {
                System.out.println("row # "+rowNum+", col # "+colNum+ "text= "+tdElement.getText());
                colNum++;
            }
        rowNum++;
    }
    }

    @AfterMethod (groups = {"sanity", "smoke"})
    void tearDown(){
        driver.close();
        driver.quit();
    }
}
