import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        // createArrayForEach();
        // printArrayDirectly();
        // createArrayTwoDimensionalForEach();
        printArrayDirectlyWithTwoDimensional();
    }

    static void createArrayForEach() {
        // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Tambien se puede
        // declarar el arreglo de esta forma
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Sintaixs de for each en Java
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    static void printArrayDirectly() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(Arrays.toString(numbers));
    }

    static void createArrayTwoDimensionalForEach() {
        int[][] allNumbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rowIndex = 0;

        for (int[] rowNum: allNumbers) {
            System.out.print("[ROWINDEX]: " + rowIndex + " => ");
            rowIndex++;
            for (int columnNum: rowNum) {
                System.out.print("Number: " + columnNum + " ");
            }
            System.out.println();
        }
    }

    static void printArrayDirectlyWithTwoDimensional() {
        int[][] allNumbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int[] rowNum: allNumbers) {
            System.out.println(Arrays.toString(rowNum));
        }

    }
}
