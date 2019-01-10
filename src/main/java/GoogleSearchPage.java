import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage extends BrowserAbstractPage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String GoogleSearchh(String search) {
        driver.get("http://google.com");
        WebElement gelement = driver.findElement(By.name("q"));
        gelement.sendKeys(search);
        gelement.submit();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement FirstLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")));
        String output = FirstLink.getText();
        return output;
    }
}