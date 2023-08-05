package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ProjectActivity7 {

    static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\002PV6744\\FST_Selenium\\chrome.exe");
    }
    @BeforeTest
    public void launchBrowser(){
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
    }
    @Test
    public void validateHeader(){
        driver.findElement(By.xpath(".//a[contains(text(),'All Courses')]")).click();
        List number = driver.findElements(By.xpath(".//div[contains(@class,'ld_course_grid col-')]"));
        System.out.println("Total number of courses"+ number.size());
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
