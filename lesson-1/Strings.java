public class Strings {
    public static void main(String[] args) {
        String name = " Daniela ";
        System.out.println("[NAME]: " +  name);
        String lastName = "López Plaza";
        System.out.println("[LASTNAME]: " + lastName);
        String fullName = name + " " + lastName;
        System.out.println("[FULLNAME]: " + fullName);
        allStringMethods(name);
        stringWithConstructor(name);
    }

    public static void allStringMethods(String name) {
        // length => devuelve la longitud de la cadena
        System.out.println(name.length());
        // charAt => devuelve el caracter en la posición indicada
        System.out.println(name.charAt(0));
        // toUpperCase => convierte la cadena a mayúsculas
        System.out.println(name.toUpperCase());
        // toLowerCase => convierte la cadena a minúsculas
        System.out.println(name.toLowerCase());
        // substring => devuelve una subcadena de la cadena original, corta la cadena (0 = inicio, 4 = fin)
        System.out.println(name.substring(0, 4));
        // replace => reemplaza el caracter por otro o la cadena completa.
        System.out.println(name.replace("a", "o"));
        System.out.println(name.replace("Daniel", "Dante"));
        // trim => elimina los espacios en blanco al inicio y al final de la cadena
        System.out.println(name.trim());
        // indexOf => devuelve la posición de la primera ocurrencia de la cadena
        System.out.println(name.indexOf("a"));
        // lastIndexOf => devuelve la posición de la última ocurrencia de la cadena
        System.out.println(name.lastIndexOf("a"));
        // startsWith => devuelve true si la cadena comienza con el prefijo indicado
        System.out.println(name.startsWith(" D"));
        // endsWith => devuelve true si la cadena termina con el sufijo indicado
        System.out.println(name.endsWith("l "));
        // equals => compara dos cadenas y devuelve true si son iguales (en JAVA no se utiliza == para comparar cadenas, se utiliza equals)
        System.out.println(name.equals(" Daniela "));
    }

    public static void stringWithConstructor(String name) {
        // String con constructor
        String nameConstructor = new String(name);
        System.out.println("[SC]:" + nameConstructor);
    }
}
