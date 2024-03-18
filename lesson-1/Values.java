public class Values {
    public static void main(String[] args) {
        // Valores de las variables por defecto. El siguiente comentario es de documentacion;
        /**
         * Salida: byte: 0 short: 0 int: 0 long: 0 float: 0.0 double: 0.0 boolean: false char: null String: null
         */
        byte value_byte = 0;
        System.out.println("byte: " + value_byte);
        short value_short = 0;
        System.out.println("short: " + value_short);
        int value_int = 0;
        System.out.println("int: " + value_int);
        long value_long = 0;
        System.out.println("long: " + value_long);
        float value_float = 0.0f;
        System.out.println("float: " + value_float);
        double value_double = 0.0d;
        System.out.println("double: " + value_double);
        boolean value_boolean = false;
        System.out.println("boolean: " + value_boolean);
        char value_char = '\u0000'; // Caracter nulo
        System.out.println("char: " + value_char);
        String value_string = null;
        System.out.println("String: " + value_string);
    }
}
