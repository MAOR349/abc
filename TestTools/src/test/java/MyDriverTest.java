import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyDriverTest {
    private static WebDriver driver;

    @BeforeClass
    public static void bc() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaorYakobov\\IdeaProjects\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.GOOGLE.co.il/");


    }

    @Test
    public void test01() {
        driver.quit();
    }
}
