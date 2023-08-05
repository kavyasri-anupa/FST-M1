package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectActivity2 {

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
        String title = driver.findElement(By.xpath("//h1[contains(@class,'title')]")).getText();
        System.out.println(title);
        Assert.assertEquals(title,"Learn from Industry Experts");
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
