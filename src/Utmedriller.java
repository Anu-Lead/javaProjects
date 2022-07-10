public class Utmedriller {
    private int totalCost;
    private final int discount = 200;
    private final int discount1 = 400;
    private final int discount2 = 500;
    private final int discount3 = 700;
    private final int discount4 = 800;
    private final int discount5 = 900;
    private final int discount6 = 1000;


    public int unitPrice = 2000;

    public void calPrice(int unit){
        if (unit >= 1 && unit <= 4) totalCost = unitPrice * unit;
        else if (unit >= 5 && unit <= 9) {
            totalCost = (unitPrice - discount) * unit;
        } else if (unit >= 10 && unit <= 29) {
            totalCost = (unitPrice - discount1) * unit;
        } else if (unit >= 30 && unit <= 49) {
            totalCost = (unitPrice - discount2) * unit;
        } else if (unit >= 50 && unit <= 99) {
            totalCost = (unitPrice - discount3) * unit;
        } else if (unit >= 100 && unit <= 199) {
            totalCost = (unitPrice - discount4) * unit;
        } else if (unit >= 200 && unit <= 499) {
            totalCost = (unitPrice - discount5) * unit;
        } else if (unit >= 500) {
            totalCost = (unitPrice - discount6) * unit;
        }
    }
    public int totalUnitCost(){
        return totalCost;
    }
}



