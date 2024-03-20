public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        int size = 5;
        System.out.println();
        System.out.println("Factorial de " + n + ": " + getFactorial(n));
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("Triángulo de asteriscos de " + size + "x" + size + ":");
        generateTriangel(0, 0, 5);
    }

    /*
     * Esto afecta a la pila de llamadas, tener cuidado con la saturacion de la pila
     * y con la recursión infinita.
     * 
     */
    static int getFactorial(int n) {
        if (n == 0)
            return 1;
        return n * getFactorial(n - 1);
    }

    /**
     * Genera un triángulo de asteriscos de tamaño size.
     * 
     * @param countA Contador de asteriscos.
     * @param countB Contador de líneas.
     * @param size   Tamaño del triángulo.
     * 
     */
    static void generateTriangel(int countA, int countB, int size) {
        if (countA == size)
            return;

        if (countB <= countA) {
            System.out.print("* ");
            generateTriangel(countA, countB + 1, size);
        } else {
            System.out.println();
            generateTriangel(countA + 1, 0, size);
        }
    }
}
