import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScriptA {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = initChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement loginBtn = driver.findElement(By.name("submitLogin"));

        email.sendKeys("webinar.test@gmail.com");
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        loginBtn.click();

        Thread.sleep(1000);

        WebElement userBox = driver.findElement(By.id("header_employee_box"));
        WebElement exit = driver.findElement(By.id("header_logout"));

        userBox.click();
        exit.click();

        driver.quit();

    }
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }

}
