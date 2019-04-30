import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObjects.TutorialPageObjects;

public class SeleniumTutorialLander {

    TutorialPageObjects tpo = new TutorialPageObjects(driver);

    //Fill text fields
        driver.findElement().sendKeys("Joey Rodriguez");
        driver.findElement().sendKeys("jrodriguez6242@gmail.com");
        driver.findElement().sendKeys("305.807.7045");

    private void testGoToSite(WebDriver driver){
        driver.get("https://qxf2.com/selenium-tutorial-main");
    }

    private void testFillInTextFields(WebDriver driver, String nameField, String emailField, String phoneField){
        //Fill text fields
        driver.findElement(nameField()).sendKeys("Joey Rodriguez");
        driver.findElement(By.xpath(emailField)).sendKeys("jrodriguez6242@gmail.com");
        driver.findElement(By.xpath(phoneField)).sendKeys("305.807.7045");
    }
}
