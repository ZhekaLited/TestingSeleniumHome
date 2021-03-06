import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class ChromeTest {
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
            input.sendKeys("zhenkek@gmail.com");
            input = driver.findElement(By.id("ttAuth_password"));
            input.sendKeys("qwerty20026565");
            input = driver.findElement(By.id("ttAuth_password_new"));
            input.sendKeys("qwerty20026565");

        }

        @Test
        @Order(6)
        public void putReg() {
            driver.findElement(By.xpath("//input[@id='ttAuth_btn']")).click();

        }

        @Test
        @Order(7)
        public void putWeb() {
            driver.get("https://tonkosti.ru/%D0%96%D1%83%D1%80%D0%BD%D0%B0%D0%BB");
            driver.get("https://tonkosti.ru/%D0%92%D0%BE%D0%BF%D1%80%D0%BE%D1%81_%E2%80%94_%D0%BE%D1%82%D0%B2%D0%B5%D1%82");
        }

        @Test
        @Order(8)
        public void putWebSecond() {
            driver.get("https://tonkosti.ru/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8_%D1%82%D1%83%D1%80%D0%B8%D0%B7%D0%BC%D0%B0");
            driver.get("https://tonkosti.ru/%D0%9F%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0");
        }

        @Test
        @Order(9)
        public void putWebThird() {
            driver.get("https://tonkosti.ru/%D0%9A%D0%B0%D1%80%D1%82%D1%8B");
            driver.get("https://tonkosti.ru/%D0%A1%D0%BF%D0%B5%D1%86%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D1%8B");
        }

        @Test
        @Order(10)
        public void PutMoskw() {
            driver.get("https://tonkosti.ru/%D0%93%D0%B8%D0%B4%D1%8B");
            driver.findElement(By.xpath("//span[@class='c-guide-card__title-text']")).click();

        }

        @Test
        @Order(11)
        public void PutBela() {
            driver.get("https://tonkosti.ru/%D0%93%D0%B8%D0%B4%D1%8B");
            driver.findElement(By.xpath("//span[@class='c-bar-list__txt']")).click();
            driver.quit();
            System.out.println("---------------------THE END TEST---------------------");
        }
    }

