import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SourceType;

public class ScriptB {

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

        WebElement dashboard = driver.findElement(By.id("tab-AdminDashboard"));
        dashboard.click();
        Thread.sleep(1000);
        String pageTitleDashboard = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleDashboard + " page after refresh: " + pageTitleDashboard.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();
        Thread.sleep(1000);
        String pageTitleOrders = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleOrders + " page after refresh: " + pageTitleOrders.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement catalog = driver.findElement(By.id("subtab-AdminCatalog"));
        catalog.click();
        Thread.sleep(1000);
        String pageTitleCatalog = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleCatalog + " page after refresh: " + pageTitleCatalog.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement customers = driver.findElement(By.xpath("//span[text()='Клиенты']/ancestor::li"));
        customers.click();
        Thread.sleep(1000);
        String pageTitleCustomers = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleCustomers + " page after refresh: " + pageTitleCustomers.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement support = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        support.click();
        Thread.sleep(1000);
        String pageTitleSupport = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleSupport + " page after refresh: " + pageTitleSupport.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement statistic = driver.findElement(By.id("subtab-AdminStats"));
        statistic.click();
        Thread.sleep(1000);
        String pageTitleStatistic = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleStatistic + " page after refresh: " + pageTitleStatistic.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement modules = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        modules.click();
        Thread.sleep(1000);
        String pageTitleModules = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleModules + " page after refresh: " + pageTitleModules.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement design = driver.findElement(By.xpath("//span[text()='Design']/ancestor::li"));
        design.click();
        Thread.sleep(1000);
        String pageTitleDesign = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleDesign + " page after refresh: " + pageTitleDesign.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement shipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        shipping.click();
        Thread.sleep(1000);
        String pageTitleShipping = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleShipping + " page after refresh: " + pageTitleShipping.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement payment = driver.findElement(By.id("subtab-AdminParentPayment"));
        payment.click();
        Thread.sleep(1000);
        String pageTitlePayment = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitlePayment + " page after refresh: " + pageTitlePayment.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement international = driver.findElement(By.id("subtab-AdminInternational"));
        international.click();
        Thread.sleep(1000);
        String pageTitleInternational = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleInternational + " page after refresh: " + pageTitleInternational.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement shopParams = driver.findElement(By.id("subtab-ShopParameters"));
        shopParams.click();
        Thread.sleep(1000);
        String pageTitleShopParams = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleShopParams + " page after refresh: " + pageTitleShopParams.equals(driver.findElement(By.tagName("h2")).getText()));

        WebElement config = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        config.click();
        Thread.sleep(1000);
        String pageTitleConfig = driver.findElement(By.tagName("h2")).getText();
        driver.navigate().refresh();
        System.out.println("On the " + pageTitleConfig + " page after refresh: " + pageTitleConfig.equals(driver.findElement(By.tagName("h2")).getText()));

        driver.quit();

    }
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }

}
