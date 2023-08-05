package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectActivity4 {

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
        String secondPopularCourse = driver.findElement(By.xpath(".//div[contains(@class,'ld-')]/div[2]/article[1]/div[2]/h3[1]")).getText();
        System.out.println(secondPopularCourse);
        Assert.assertEquals(secondPopularCourse,"Email Marketing Strategies");
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
