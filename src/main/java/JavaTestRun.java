import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTestRun {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String nameField = "//*[@id=\"name\"]";
        String emailField = "//*[@id=\"myform\"]/div[2]/input";
        String phoneField = "//*[@id=\"phone\"]";

        driver.get("https://qxf2.com/selenium-tutorial-main");

        driver.findElement(By.xpath(nameField)).sendKeys("Joey Rodriguez");
        driver.findElement(By.xpath(emailField)).sendKeys("jrodriguez6242@gmail.com");
        driver.findElement(By.xpath(phoneField)).sendKeys("305.807.7045");

        System.out.println(driver.findElement(By.xpath("//*[@id=\"name\"]")).getText());

    }

}