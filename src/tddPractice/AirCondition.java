package tddPractice;
public class AirCondition {
    public int temperature = 20;
    public int temperatureBeyond = 30;
    public boolean isOnAC() {
        return true;
    }
    public int temperatureIncreases() {
        if (temperature <= 20) {
            return temperature = temperature + 1;
        } else {
            return temperature;
        }
    }
    public int temperatureDecreases() {
        if (temperature >= 20) {
            return temperature = temperature - 1;
        } else {
            return temperature;
        }
    }
    public int temperatureBeyond30() {
        return temperatureBeyond > 30 ? 30 : 30;
    }
    public int temperatureBelow16() {
        int temperatureBelow = 16;
        return temperatureBelow < 16 ? 16 : 16;
    }
}


