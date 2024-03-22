import java.util.Arrays;

public class ArrayCloning {
    public static void main(String... args) {
        // withoutUsingArrayClone();
        // usingArrayClone();
        usingArrayCopy();
    }


    static void withoutUsingArrayClone() {
        // Array original
        int[] numbers = {1, 2, 3, 4, 5};
        // Copia del array originallesson-img
        int[] copyNumbers = numbers;
        // Asignacion de un nuevo valor a la primera posicion del array copia
        copyNumbers[0] = 100;
        // ----------------------------------------------------------------------------->
        // Podemos ver que el valor de la primera posicion del array original tambien ha cambiado
        System.out.println("[Original] => " + Arrays.toString(numbers));
        System.out.println("[Copy] => " + Arrays.toString(copyNumbers));
    }

    static void usingArrayClone() {
        // Array original
        int[] numbers = {1, 2, 3, 4, 5};
        // Copia del array original
        int[] copyNumbers = numbers.clone();
        // Asignacion de un nuevo valor a la primera posicion del array copia
        copyNumbers[0] = 100;
        // ----------------------------------------------------------------------------->
        // Podemos ver que el valor de la primera posicion del array original no ha cambiado
        System.out.println("[Original] => " + Arrays.toString(numbers));
        System.out.println("[Copy] => " + Arrays.toString(copyNumbers));
    }

    static void usingArrayCopy() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copyNumbers = new int[numbers.length];

        // Copia el contenido del array original al array copia
        System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length - 3);

        // Salida
        System.out.println("[Original] => " + Arrays.toString(numbers));
        System.out.println("[Copy] => " + Arrays.toString(copyNumbers));
    }
}
