import java.util.Arrays;

public class BubbleSortMethod {
    public static void main(String[] args) {
        int[] arrayShortResult = bubbleSort(1, 6, 7, 2, 5, 4, 3);
        System.out.println(Arrays.toString(arrayShortResult));
    }

    static int[] bubbleSort(int... numbers) {
        int aux;
        // Creamos un bucle que recorra el array de números. En cada iteración, comparamos el número actual con el siguiente.
        // Si el número actual es mayor que el siguiente, los intercambiamos.
        // Repetimos este proceso hasta que el array esté ordenado.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        return numbers;
    }
}
