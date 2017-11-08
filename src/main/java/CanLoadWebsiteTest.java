import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Ramin on 11/7/2017.
 */
public class CanLoadWebsiteTest extends CarPriceUIBaseTest {

    @Test
    public void CanFindPaymentElementTest() {
        driver.get(uiWebLocation);

        WebElement element = driver.findElement(By.id(paymentFormElement));
        assertNotNull(element);
    }
}
