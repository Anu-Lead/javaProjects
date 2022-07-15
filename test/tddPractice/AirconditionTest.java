package tddPractice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirconditionTest {
    @Test
    @DisplayName("This Project is Testing for Air Conditioning - if it ON")

    public void TestingACOn() {

        AirCondition myAC = new AirCondition();
        myAC.isOnAC();
        assertEquals(true, myAC.isOnAC());
    }

    @Test
    @DisplayName("This Project is Testing for Air Conditioning - Increase in Temperature")
    public void TestingACTemperatureInc() {
        AirCondition myAC = new AirCondition();
        myAC.temperatureIncreases();
        assertEquals(21, myAC.temperatureIncreases());
    }

    @Test
    @DisplayName("This Project is Testing for Air Conditioning - Decrease in Temperature")
    public void TestingACTemperatureDec() {
        AirCondition myAC = new AirCondition();
        myAC.temperatureDecreases();
        assertEquals(19, myAC.temperatureDecreases());
    }

    @Test
    @DisplayName("This Project is Testing for Air Conditioning: When I increase temperature beyond 30, the Temperature is still 30")
    public void TestingACTemperatureBeyond30() {
        AirCondition myAC = new AirCondition();
        myAC.temperatureBeyond30();
        assertEquals(30, myAC.temperatureBeyond30());
    }

    @Test
    @DisplayName("This Project is Testing for Air Conditioning: When I decrease temperature below 16, the Temperature is still 16")
    public void TestingACTemperatureBelow16() {
        AirCondition myAC = new AirCondition();
        myAC.temperatureBelow16();
        assertEquals(16, myAC.temperatureBelow16());
    }
}
