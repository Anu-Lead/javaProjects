public class SevenSegmentDisplay {


String [][] figure = {{"#", "#", "#", "#", "#"}, {"#", "#", "#", "#", "#"}, {"#", "#", "#", "#", "#"}, {"#", "#", "#", "#", "#"}, {"#", "#", "#", "#", "#"}};

    public static void main(String[] args) {

        int[][] figure = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};

        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setScreen(11011111);
        sevenSegmentDisplay.Display();

        display(figure);


    }

    private void Display() {
    }


    private void setScreen(int digit) {

    }

    private static void display(int[][] printDigit) {
        for (int i = 0; i <= printDigit.length; i++) {
            System.out.println(printDigit[i]);
        }
    }
}




