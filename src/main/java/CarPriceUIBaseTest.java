import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Ramin on 11/7/2017.
 */
public class CarPriceUIBaseTest {
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
    }

    protected WebDriver driver;
    protected final String UI_WEB_LOCATION = "http://127.0.0.1:3000";

    //UI element IDs
    protected final String USER_CAR_VALUES = "user-values";

    protected final String PAYMENT_FORM_ELEMENT = "payment";
    protected final String RATE_FORM_ELEMENT = "rate";
    protected final String TIMES_FORM_ELEMENT = "time";
    protected final String MILES_FORM_ELEMENT = "miles";
    protected final String PPG_FORM_ELEMENT = "ppg";
    protected final String YEARS_FORM_ELEMENT = "years";

    protected final String ADD_CAR = "ADD_CAR";

    protected final String CARS_FORM_ELEMENT = "cars";
    protected final String RT_CAR_FORM_ELEMENT = "rt-car-info";
    protected final String PRICE_FORM_ELEMENT = "price";
    protected final String MPG_FORM_ELEMENT = "mpg";

    protected final String PAYMENT_COST = "paymentCost";
    protected final String GAS_COST = "gasCost";
    protected final String TOTAL_MONTHLY_COST = "totalMonthlyCost";
    protected final String TOTAL_MONTHLY_COST_AFTER_SOME_YEARS = "totalCostAfterSomeYears";

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get(UI_WEB_LOCATION);
    }

    @After
    public void cleanup() {
        driver.quit();
    }
}
