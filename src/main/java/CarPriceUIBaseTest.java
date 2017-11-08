import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ramin on 11/7/2017.
 */
public class CarPriceUIBaseTest {
    protected WebDriver driver;
    protected String uiWebLocation = "http://107.170.231.89";

    //UI element IDs
    protected String paymentFormElement = "payment";
    protected String rateFormElement = "rate";
    protected String timeFormElement = "time";
    protected String milesFormElement = "miles";
    protected String ppgFormElement = "ppg";
    protected String yearsFormElement = "years";

    protected String carsRowElement = "cars";

    protected String priceFormElement = "price";
    protected String mpgFormElement = "mpg";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void cleanup() {
        driver.quit();
    }
}
