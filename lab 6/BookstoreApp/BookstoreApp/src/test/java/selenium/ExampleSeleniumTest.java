package selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

class ExampleSeleniumTest {

  static Process server;
  private WebDriver driver;

  @BeforeAll
  public static void setUpBeforeClass() throws Exception {
    ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
    server = pb.start();
  }

  @BeforeEach
  void setUp() {
    // Pick your browser
    // driver = new FirefoxDriver();
    // driver = new SafariDriver();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8080/");
    // wait to make sure Selenium is done loading the page
    WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
  }

  @AfterEach
  public void tearDown() {
    driver.close();
  }

  @AfterAll
  public static void tearDownAfterClass() throws Exception {
    server.destroy();
  }

  @Test
  void test1() {
    WebElement element = driver.findElement(By.id("title"));
    String expected = "YAMAZONE BookStore";
    String actual = element.getText();
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    WebElement welcome = driver.findElement(By.cssSelector("p"));
    String expected = "Welcome";
    String actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
    WebElement langSelector = driver.findElement(By.id("locales"));
    langSelector.click();
    WebElement frSelector = driver.findElement(By.cssSelector("option:nth-child(3)"));
    frSelector.click();
    welcome = driver.findElement(By.cssSelector("p"));
    expected = "Bienvenu";
    actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
  }



@Test

public void myFirstTest() {

  driver.get("http://localhost:8080/admin");

  String currentURL = driver.getCurrentUrl();
  String expectedURL = "http://localhost:8080/login";
  assertEquals(expectedURL, currentURL);

  WebElement username = driver.findElement(By.id("loginId"));
  username.sendKeys("admin");

  WebElement password = driver.findElement(By.name("password"));
  password.sendKeys("password");

  WebElement loginbutton = driver.findElement(By.id("loginBtn"));
  loginbutton.click();


  expectedURL = "http://localhost:8080/admin";
  currentURL = driver.getCurrentUrl();
  assertEquals(expectedURL, currentURL);

        }



@Test

public void Testcase2() {

  driver.get("http://localhost:8080/admin");

  String currentURL = driver.getCurrentUrl();
  String expectedURL = "http://localhost:8080/login";
  assertEquals(expectedURL, currentURL);

  WebElement username = driver.findElement(By.id("loginId"));
  username.sendKeys("admi");

  WebElement password = driver.findElement(By.name("password"));
  password.sendKeys("passwor");

  WebElement loginbutton = driver.findElement(By.id("loginBtn"));
  loginbutton.click();


  expectedURL = "http://localhost:8080/login?error";
  currentURL = driver.getCurrentUrl();
  assertEquals(expectedURL, currentURL);

        }
















        


private String[] getWords(String s) {
    return s.split("\\s+");
        }
        
      }