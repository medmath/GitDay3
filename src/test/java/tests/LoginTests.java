package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
//Login tests are maintained here
//Without Page object approach
public class LoginTests {
Map<Integer,String> myMap= new HashMap<>();
    Map<Integer,String> map= new HashMap<>();
    Map<Integer,String> map1= new HashMap<>();
    Map<Integer,String> map2= new HashMap<>();
    Map<Integer,String> map21= new HashMap<>();


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void loginTest1() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "Web Orders");
    }

    @Test
    public void logOutTest() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

        driver.findElement(By.id("ctl00_logout")).click();

        Assert.assertEquals(driver.getTitle(), "Web Orders Login");

    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }


    @Test
    public void logOutTest2() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");


    }



    public void logOutTestRed() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

        driver.findElement(By.id("ctl00_logout")).click();

        Assert.assertEquals(driver.getTitle(), "Web Orders Login");

    }



    
    @Test
    public void logOutTest3() {

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");


    }



    @Test
    public void logOutREMOTEREPO() {

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");


    }




}



