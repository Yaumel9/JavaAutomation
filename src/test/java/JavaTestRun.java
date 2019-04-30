import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import PageObjects.TutorialPageObjects;

public class JavaTestRun {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        //Selects Click Me Button
        driver.findElement(By.xpath(bClickMe)).click();

////        //Navigate to a specific URL
////        driver.get("https://qxf2.com/selenium-tutorial-main");
//
////        //Fill text fields
////        driver.findElement(By.xpath(nameField)).sendKeys("Joey Rodriguez");
////        driver.findElement(By.xpath(emailField)).sendKeys("jrodriguez6242@gmail.com");
////        driver.findElement(By.xpath(phoneField)).sendKeys("305.807.7045");
//
////        System.out.println(driver.findElement(By.xpath("//*[@id=\"name\"]")).getAttribute("value"));
//
////        //Set a dropdown
////        Select drpGender = new Select(driver.findElement(By.xpath(dropDownMenu)));
////        drpGender.selectByIndex(1);
//
//        //Set a ul dropdown
//        driver.findElement(()).click();
//        driver.findElement(By.xpath(dropDownMale)).click();
//
//        //Check Terms and Conditions Box
//        driver.findElement(By.xpath(chbTermsAndConditions)).click();
//
//        //Identify elements without ids
//
//
//        //Check for form validation messages
//
//        driver.findElement(By.xpath(nameField)).clear();
//        driver.findElement(By.xpath(emailField)).clear();
//        driver.findElement(By.xpath(phoneField)).clear();
//
//        //Selects Click Me Button
//        driver.findElement(By.xpath(bClickMe)).click();
//
//        //verify Name, Email, and Phone No validation messages appear
//        if(!(driver.findElement(By.xpath(tNameValidationWarning)).isDisplayed()))
//           System.out.println("Name Validation is not displayed");
//
//        if(!(driver.findElement(By.xpath(tEmailValidationWarning)).isDisplayed()))
//           System.out.println("Email Validation is not displayed");
//
//        if(!(driver.findElement(By.xpath(tPhoneNoValidationWarning)).isDisplayed()))
//            System.out.println("Phone No Validation is not displayed");



        //Selects Click Me Button
        driver.findElement(By.xpath(bClickMe)).click();


//        driver.close();
//        driver.quit();

    }
}