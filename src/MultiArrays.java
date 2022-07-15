public class MultiArrays {
    public static void main(String [] args) {
        int[][] mangoes = {{40, 56, 12}, {90, 76, 34, 88, 67, 34}, {70, 56, 78}};
        int[][] oranges = {{5, 7, 1, 8,}, {4, 7, 9, 0,}, {2, 1, 6, 4, 8, 5, 7, }};

            System.out.println("============================================================");
            System.out.printf("The Values of Mangoes by ROW is 3 and by COLUMN is 6%n");
            viewFruits(mangoes); // Displays mangoes by row
            System.out.printf("=============================================================");
            System.out.printf("%nThe Values in Oranges by ROW is 3 and by COLUMN is 7%n");
            viewFruits(oranges); // Displays oranges by row
        }

    public static void viewFruits(int [][] allFruits) {
        for (int newMangoes = 0; newMangoes < allFruits.length; newMangoes++) {
            for (int newOrange = 0; newOrange < allFruits[newMangoes].length; newOrange++) {
                System.out.printf("%d  ", allFruits[newMangoes][newOrange]);
    }
            System.out.println();
        }
        }
}
