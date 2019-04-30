package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialPageObjects {

    WebDriver driver;

    public TutorialPageObjects(WebDriver driver){
        this.driver = driver;
    }

    By tbName = By.xpath("//*[@id=\"name\"]");
    By tbemail = By.xpath("//*[@id=\"myform\"]/div[2]/input");
    By tbPhone = By.xpath("//*[@id=\"phone\"]");
    By ddGender = By.xpath("//*[@id=\"myform\"]/div[4]/button");
    By ddMale = By.xpath("//*[@id=\"myform\"]/div[4]/ul/li[1]/a");
    By ddFemale = By.xpath("//*[@id=\"myform\"]/div[4]/ul/li[2]/a");
    By chbTac = By.xpath("//*[@id=\"myform\"]/div[5]/label/input");
    By bClick = By.xpath("//*[@id=\"myform\"]/p/button");
    By tNameWarning = By.xpath("//*[@id=\"myform\"]/div[1]/label[2]");
    By tEmailWarning = By.xpath("//*[@id=\"myform\"]/div[2]/label[2]");
    By tPhoneNoWarning = By.xpath("//*[@id=\"myform\"]/div[3]/label[2]");

    public WebElement nameField() {
        return driver.findElement(tbName);
    }

    public WebElement emailField() {
        return driver.findElement(tbemail);
    }

    public WebElement phoneField() {
        return driver.findElement(tbPhone);
    }

    public WebElement dropDownMenu() {
        return driver.findElement(ddGender);
    }

    public WebElement dropDownMale() {
        return driver.findElement(ddMale);
    }

    public WebElement dropDownFemale() {
        return driver.findElement(ddFemale);
    }

    public WebElement chbTerbClickMe() {
        return driver.findElement(bClick);
    }

    public WebElement chbTermsAndConditions() {
        return driver.findElement(chbTac);

    public WebElement tNameValidationWarning() {
        return driver.findElement(tNameWarning);
    }

    public WebElement tEmailValidationWarning() {
        return driver.findElement(tEmailWarning);
    }

    public WebElement tPhoneNoValidationWarning() {
        return driver.findElement(tPhoneNoWarning);
    }

    public Boolean explicitWait() {
        WebDriverWait w=new WebDriverWait(driver,2);
        return w.until(ExpectedConditions.invisibilityOfElementLocated(bClickMe));
    }
}
