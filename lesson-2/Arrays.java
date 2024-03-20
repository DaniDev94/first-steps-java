public class Arrays {
    public static void main(String[] args) {
        // createArray(107);
        createArrayWithObject(new String[] { "A", "B", "C", "D", "E" });
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
    }
}
