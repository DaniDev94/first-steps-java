import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        // createArray(107);
        // createArrayWithObject(new String[] { "A", "B", "C", "D", "E" });
        // createArrayRandom(5);
        createArrayTwoDimensional(new int[11][9]);
        // With Object:
        // createArrayTwoDimensional(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
    }

    static void createArray(int arrSize) {
        int[] allNumbers = new int[arrSize];
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = i;
            // Obtenemos el último número del arreglo
            if (i == allNumbers.length - 1)
                System.out.println("[LAST-NUM]: " + allNumbers[allNumbers.length - 1]);
        }
        // Accedemos a un índice específico
        System.out.println("[RANDOM-NUM]: " + allNumbers[7]);
    }

    static void createArrayWithObject(String[] arrStrings) {
        String[] allNumbers = arrStrings;
        System.out.println();
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.print("My array => ");
        for (int i = 0; i < allNumbers.length; i++) {
            if (i == 0)
                System.out.print(" [ ");
            System.out.print(allNumbers[i]);
            if (i < allNumbers.length - 1)
                System.out.print(", ");
            if (i == allNumbers.length - 1)
                System.out.println(" ]");
        }
        System.out.println("/////////////////////////////////");
    }

    static void createArrayRandom(int arrSize) {
        int[] allNumbers = new int[arrSize];
        Random selectedRandomNum = new Random();
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = selectedRandomNum.nextInt(107);
        }
        /*
         * Utilizamos la clase java.util.Arrays para imprimir el arreglo, ya que no
         * podemos imprimirlo directamente con System.out.println(allNumbers);
         */
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(" My array => " + java.util.Arrays.toString(allNumbers));
        System.out.println("/////////////////////////////////");
    }

    static void createArrayTwoDimensional(int[][] arrTwoDimensional) {
        int[][] allNumbers = arrTwoDimensional;
        System.out.println();
        for (int rowIndex = 0; rowIndex < allNumbers.length; rowIndex++) {
            allNumbers[rowIndex] = new int[rowIndex + 1];
            for (int columnIndex = 0; columnIndex < allNumbers[rowIndex].length; columnIndex++) {
                allNumbers[rowIndex][columnIndex] = columnIndex + 107;
                if (columnIndex == allNumbers[rowIndex].length - 1) {
                    System.out.print(allNumbers[rowIndex][columnIndex] + " ");
                }
            }
        }
    }
}
