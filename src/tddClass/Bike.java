package tddClass;
public class Bike {
    public int gears = 15;

    public String bikeStart(String turnOn) {
        return turnOn;
    }

    public String switchOn() {
        return "turnOn";
    }

    public int gearOneIncrease() {
        if (gears <= 15) {
            return gears + 1;
        }
        return gearOneIncrease();
    }

    public int gearTwoIncrease() {
        if (gears <= 15) {
            return gears + 2;
        }
        return gearTwoIncrease();
    }

    public int gearThreeIncrease() {
        if (gears <= 15) {
            return gears + 3;
        }
        return gearThreeIncrease();
    }

    public int gearFourIncrease() {
        if (gears <= 15) {
            return gears + 4;
        }
        return gearFourIncrease();
    }

    public int gearOneDecrease() {
        if (gears == 15) {
            return gears - 1;
        }
        return gearOneDecrease();
    }
}






















//    public String offBike(String turnOff) {
//        return turnOff;
//    }
//    public String setSwitchOff() {
//        return "turnOff";
//    }