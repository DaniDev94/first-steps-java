import java.util.Random;
import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] array = randomArray(10);
        int[] arraySort = quicksortMethod(array, 0, array.length - 1);
        System.out.println("Array: " + Arrays.toString(arraySort));
    }

    static int[] randomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }


    

    /*
     * Método de ordenación quicksort, que recibe un array de enteros y dos índices.
     * El índice izq es el primer elemento del array y el índice der es el último.
     * El método devuelve un array de enteros ordenado.
     * El método es recursivo, lo que significa que se llama a sí mismo.
     * En cada llamada, se selecciona un pivote, que es el primer elemento del array.
     * Se recorren los elementos del array y se comparan con el pivote.
     * Si el elemento es menor o igual al pivote, se incrementa el índice i.
     * Si el elemento es mayor que el pivote, se decrementa el índice j.
     * Si i es menor que j, se intercambian los elementos i y j.
     * Cuando i es mayor o igual que j, se intercambia el pivote con el elemento j.
     */
    static int[] quicksortMethod(int arr[], int izq, int der) {
        int pivote = arr[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (arr[i] <= pivote && i < j) i++;
            while (arr[j] > pivote) j--;
            
            if (i < j) {
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        arr[izq] = arr[j];
        arr[j] = pivote;
        if (izq < j - 1) quicksortMethod(arr, izq, j - 1);
        if (j + 1 < der) quicksortMethod(arr, j + 1, der);
        
        return arr;
    }
}
