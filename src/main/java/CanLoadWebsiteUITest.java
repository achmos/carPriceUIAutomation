import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Ramin on 11/7/2017.
 */
public class CanLoadWebsiteUITest extends CarPriceUIBaseTest {

    public void verifyElementExistsOnPageByID(String id) {
        WebElement element = driver.findElement(By.id(id));
        assertNotNull(element);
    }

    @Test
    public void CanVerifyGlobalUserElementsTest() {
        //verify the user values form exists
        verifyElementExistsOnPageByID(USER_CAR_VALUES);

        //verify children elements of the form
        verifyElementExistsOnPageByID(PAYMENT_FORM_ELEMENT);
        verifyElementExistsOnPageByID(RATE_FORM_ELEMENT);
        verifyElementExistsOnPageByID(TIMES_FORM_ELEMENT);
        verifyElementExistsOnPageByID(MILES_FORM_ELEMENT);
        verifyElementExistsOnPageByID(PPG_FORM_ELEMENT);
        verifyElementExistsOnPageByID(YEARS_FORM_ELEMENT);
    }

    @Test
    public void CanVerifyCarInfoElementsExistsTest() {
        //verify the cars section exists
        verifyElementExistsOnPageByID(CARS_FORM_ELEMENT);

        //verify the rt-car-info element
        WebElement element = driver.findElement(By.tagName(RT_CAR_FORM_ELEMENT));
        assertNotNull(element);

        //verify rt-car-info children
        verifyElementExistsOnPageByID(PRICE_FORM_ELEMENT);
        verifyElementExistsOnPageByID(MPG_FORM_ELEMENT);
    }

    @Test
    public void CanVerifyAddCarButtonExists() {
        verifyElementExistsOnPageByID(ADD_CAR);
    }
}
