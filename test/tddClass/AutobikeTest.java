package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutobikeTest {
    @Test
    @DisplayName("This Project is Testing for Starting the Bike - ON")
    @BeforeEach

    public void startTesting() {
        Bike myBike = new Bike();
        myBike.bikeStart("turnOn");
        assertEquals("turnOn", myBike.switchOn());
    }

    @Test
    @DisplayName("This Project is Testing for an Bike's Gear 1 Acceleration.")
    public void startTestingAcceleration() {
        Bike myBike = new Bike();
        myBike.gearOneIncrease();
        assertEquals(16, myBike.gearOneIncrease());
    }

    @Test
    @DisplayName("This Project is Testing for Bike's Gear 2 Acceleration.")
    public void accelerationGearTwo() {
        Bike myBike = new Bike();
        myBike.gearTwoIncrease();
        assertEquals(17, myBike.gearTwoIncrease());
    }

    @Test
    @DisplayName("This Project is Testing for Bike's Gear 3 Acceleration.")
    public void accelerationGearThree() {
        Bike myBike = new Bike();
        myBike.gearThreeIncrease();
        assertEquals(18, myBike.gearThreeIncrease());
    }

    @Test
    @DisplayName("This Project is Testing for Bike's Gear 4 Acceleration.")
    public void accelerationGearFour() {
        Bike myBike = new Bike();
        myBike.gearThreeIncrease();
        assertEquals(19, myBike.gearFourIncrease());
    }

    @Test
    @DisplayName("This Project is Testing for Bike's Gear 1 Deceleration.")
    public void deceleratingGearOne() {
        Bike myBike = new Bike();
        myBike.gearOneDecrease();
        assertEquals(14, myBike.gearOneDecrease());
    }
    }
