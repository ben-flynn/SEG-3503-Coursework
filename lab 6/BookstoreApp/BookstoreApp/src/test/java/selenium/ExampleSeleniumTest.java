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

public void testcase1() {

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

public void testcase2() {

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




@Test

public void testcase3() {

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

  WebElement logoutbutton = driver.findElement(By.xpath("//input[@value='Sign out']"));
  logoutbutton.click();

  expectedURL = "http://localhost:8080/login?logout";
  currentURL = driver.getCurrentUrl();
  assertEquals(expectedURL, currentURL);
}



@Test
public void testcase4() {

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

  WebElement category = driver.findElement(By.id("addBook-category"));
  category.sendKeys("hello");
  WebElement bookId = driver.findElement(By.id("addBook-id"));
  bookId.sendKeys("123456");
  WebElement title = driver.findElement(By.id("addBook-title"));
  title.sendKeys("hello");
  WebElement author = driver.findElement(By.id("addBook-authors"));
  author.sendKeys("Ben");
  WebElement cost = driver.findElement(By.id("cost"));
  cost.sendKeys("12");
  WebElement addButton = driver.findElement(By.name("addBook"));
  addButton.click();

  WebElement search = driver.findElement(By.id("search"));
  search.sendKeys("hello");
  WebElement searchButton = driver.findElement(By.id("searchBtn"));
  searchButton.click();

  WebElement addedBook = driver.findElement(By.id("title-123456"));
  String expectedText = "hello";
  assertEquals(expectedText, addedBook.getText());

  WebElement deleteButton = driver.findElement(By.id("del-123456"));
  deleteButton.click(); 
  expectedURL = "http://localhost:8080/admin/catalog";
  currentURL = driver.getCurrentUrl();

}



@Test

public void testcase5() {

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

  WebElement languageSelect = driver.findElement(By.id("locales"));
  languageSelect.click();

  WebElement frenchSelect = driver.findElement(By.xpath("//input[@value='fr-CA']"));  
  frenchSelect.click();
  

  WebElement frenchTitle = driver.findElement(By.id("title"));
  String title = languageSelect.getText();
  String expectedText = "Librairie Y'AMAZONE";
  assertEquals(expectedText, title);

}











        





private String[] getWords(String s) {
    return s.split("\\s+");
        }
        
      }