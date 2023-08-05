package JavaSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectActivity5 {

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
        driver.findElement(By.xpath(".//a[contains(text(),'My Account')]")).click();
        String pageTitle = driver.findElement(By.xpath(".//h1[@class='uagb-ifb-title']")).getText();

        Assert.assertEquals(pageTitle,"My Account");
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
