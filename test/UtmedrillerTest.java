import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtmedrillerTest {
    @Test
    @DisplayName("This Test is Testing for Calculation of UTMETestDriller Per Price")

    public void calculateUnitPrice(){
        Utmedriller subjectCopy = new Utmedriller();
        subjectCopy.calPrice(15);
        assertEquals(24000, subjectCopy.totalUnitCost());





    }
}
