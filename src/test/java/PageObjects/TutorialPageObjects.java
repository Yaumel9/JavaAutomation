package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TutorialPageObjects {

    WebDriver driver;

    public TutorialPageObjects(WebDriver driver){

        this.driver = driver;
    }

    private By tbName = By.xpath("//*[@id=\"name\"]");
    private By tbNameClass = By.id("name");
    private By tbeMail = By.xpath("//*[@id=\"myform\"]/div[2]/input");
    private By tbPhone = By.xpath("//*[@id=\"phone\"]");
    private By ddGender = By.xpath("//*[@id=\"myform\"]/div[4]/button");
    private By ddMale = By.xpath("//*[@id=\"myform\"]/div[4]/ul/li[1]/a");
    private By ddFemale = By.xpath("//*[@id=\"myform\"]/div[4]/ul/li[2]/a");
    private By chbTac = By.xpath("//*[@id=\"myform\"]/div[5]/label/input");
    private By bClick = By.xpath("//*[@id=\"myform\"]/p/button");
    private By tNameWarning = By.xpath("//*[@id=\"myform\"]/div[1]/label[2]");
    private By tEmailWarning = By.xpath("//*[@id=\"myform\"]/div[2]/label[2]");
    private By tPhoneNoWarning = By.xpath("//*[@id=\"myform\"]/div[3]/label[2]");
    private By menuMouseOver = By.xpath("/html/body/div[1]/div[3]/img");
    private By menuResourceOption = By.xpath("/html/body/div[1]/div[3]/ul/li[3]/a");
    private By menuGUIAutomationOption = By.xpath("/html/body/div[1]/div[3]/ul/li[3]/ul/li[7]/a");
    private By rowsTableExampleName = By.xpath("/html/body/div[4]/div/div/table/tbody/tr");
    private By colTableExampleName = By.xpath("/html/body/div[4]/div/div/table/thead/tr[1]/th");
    private By fullTableExample = By.xpath("/html/body/div[4]/div/div/table/tbody");

    private String userName ="Jose Rodriguez";
    private String userEmail = "jrodrig12@gmail.com";
    private String userPhoneNo = "305.807.7045";
    private char gender = 'M';

    public void testGoToSite(){
        driver.get("https://qxf2.com/selenium-tutorial-main");
    }

    public WebElement nameField() {
        return driver.findElement(this.tbName);
    }

    public WebElement nameFieldC(){
        return driver.findElement(this.tbNameClass);
    }

    public WebElement emailField() {
        return driver.findElement(this.tbeMail);
    }

    public WebElement phoneField() {
        return driver.findElement(this.tbPhone);
    }

    public WebElement dropDownMenu() {
        return driver.findElement(this.ddGender);
    }

    public WebElement dropDownMale() {
        return driver.findElement(this.ddMale);
    }

    public WebElement dropDownFemale() {
        return driver.findElement(this.ddFemale);
    }

    public WebElement chbTerbClickMe() {
        return driver.findElement(this.bClick);
    }

    public WebElement chbTermsAndConditions() {
        return driver.findElement(this.chbTac);
    }

    public WebElement tNameValidationWarning() {return driver.findElement(this.tNameWarning); }

    public WebElement tEmailValidationWarning() {return driver.findElement(this.tEmailWarning); }

    public WebElement tPhoneNoValidationWarning() {return driver.findElement(this.tPhoneNoWarning); }

    public WebElement menuDropDown() {return driver.findElement(this.menuMouseOver); }

    public WebElement menuResource() {return driver.findElement(this.menuResourceOption); }

    public WebElement menuGUIAutomation() {return driver.findElement(this.menuGUIAutomationOption); }

    public List<WebElement> rowsTableExample() {return driver.findElements(this.rowsTableExampleName); }

    public List<WebElement> colTableExample() {return driver.findElements(this.colTableExampleName); }

    public WebElement tableExample() {return driver.findElement(this.fullTableExample); }

    public String testUserName(){return this.userName; }

    public String testUserEmail(){return this.userEmail; }

    public String testPhoneNo(){ return this.userPhoneNo; }

    public char testGender(){ return this.gender; }

    public Boolean explicitWait() {
        WebDriverWait w=new WebDriverWait(driver,5);
        return w.until(ExpectedConditions.invisibilityOfElementLocated(this.bClick));
    }
}
