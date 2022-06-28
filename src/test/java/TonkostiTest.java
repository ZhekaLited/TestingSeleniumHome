import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class TonkostiTest {
        public static WebDriver driver;
        private final String baseUrl = "https://tonkosti.ru/";

        @Test
        @Order(1)
        public void openbrowser() {
            System.setProperty("webdriver.chrome.driver", "D:\\New\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();

        }

        @Test
        @Order(2)
        public void getTitle() {
            Assertions.assertTrue(driver.getTitle().toUpperCase().contains("Тонкости туризма — энциклопедия курортов, описания отелей, отзывы туристов и экспертов".toUpperCase()));
        }

        @Test
        @Order(3)
        public void gotoLing() {
            driver.get(baseUrl + "/myaccount/");
        }


        @Test
        @Order(4)
        public void putRegistr() {
            driver.findElement(By.xpath("//a[@id='ttAuth_tab_registration']")).click();
        }

        @Test
        @Order(5)
        public void regisr() {
            WebElement input = driver.findElement(By.id("ttAuth_email"));
            input.sendKeys("zhenkekd@gmail.com");
            input = driver.findElement(By.id("ttAuth_password"));
            input.sendKeys("qwerty20026565");
            input = driver.findElement(By.id("ttAuth_password_new"));
            input.sendKeys("qwerty20026565");

        }

        @Test
        @Order(6)
        public void putReg() {
            driver.findElement(By.xpath("//input[@id='ttAuth_btn']")).click();
            driver.quit();
        }

//     // @Test
//      @Order(7)
//      public void signOut() throws InterruptedException {
//                      driver.findElement(By.xpath("//a[@class='myaccount-logout']")).click();
//         //  driver.quit();
//       }
    }

