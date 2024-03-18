public class MathExample {
    public static void main(String[] args) {
        int n = 2, m = 4, radio = 10;
        // Elevar n a la m
        double result = Math.pow(n, m);
        System.out.println(result); // 16.0
        System.out.println(n + " elevado a " + m + " es igual a " + result); // 2 elevado a 4 es igual a 16.0
        // Con casting
        System.out.println((int)result); // 16

        // Raíz cuadrada
        result = Math.sqrt(16);
        System.out.println((int)result); // 4.0

        // Radio
        double area = Math.PI * radio * radio;
        System.out.println(area); // 314.1592653589793

        // Redondear area
        System.out.println((int)Math.round(area)); // 314

        // Redondear hacia arriba
        System.out.println((int)Math.ceil(area)); // 315

        // Redondear hacia abajo
        System.out.println((int)Math.floor(area)); // 314

        // Random radio
        radio = (int)(Math.random() * 100);
        System.out.println(radio); // 0 a 99
    }

}
