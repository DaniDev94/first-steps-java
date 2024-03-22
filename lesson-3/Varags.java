public class Varags {
    // Metodo main con varags en lugar de = String[] args
    public static void main(String... args) {
        // Le pasa una lista de argumentos al metodo simpleExample y los imprime como si
        // fueran un array
        // Podemos pasarle o no argumentos al metodo simpleExample
        simpleExample(1, 2, 3, 4, 5);
        simpleExample(); // Tambien funciona sin argumentos

    }

    // Declracion de varags = int... numbers => Se usa el operador de tres puntos + el nombre de la variable
    static void simpleExample(int... numbers) {
        if (numbers.length > 0) {
            for (int number : numbers) {
                System.out.println("Number: " + number);
            }
 
        }
    }

}
