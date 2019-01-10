import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class GoogleSearchTest {
    public static WebDriver driver;

    @Before
    public void SetUp(){
        driver = new BrowserAbstractPage(driver).getWebDriver(BrowserAbstractPage.Browser.CHROME);
    }

    @Test
    public void GoogleSearch(){
        GoogleSearchPage gooSearch = new GoogleSearchPage(driver);
        Assert.assertEquals(gooSearch.GoogleSearchh("yandex.ru").toString(), "https://www.yandex.ru/");
    }

    @After
    public void TearDown(){
        driver.quit();
    }

}
