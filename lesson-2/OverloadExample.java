public class OverloadExample {
    static String response;

    public static void main(String[] args) {
        response = setOverload();
        // response = setOverload(3);
        // response = setOverload(3, "lacasitos");
        System.out.println(response);
        /* ------------------------------------------------------------------ */
        // Se ejecutan todos los metodos:
        // System.out.println(setOverload());
        // System.out.println(setOverload(3));
        // System.out.println(setOverload(3, "lacasitos"));
    }

    // En Java, el método setOverload puede tener el mismo nombre, pero con
    // diferentes parámetros. Si no se especifica un parámetro, el método lanzará un
    // error.
    // static void setOverload() {
    // System.out.println("I am a void");
    // }

    static String setOverload() {
        return "I am a string";
    }

    static String setOverload(int num) {
        return "I am a number " + num;
    }

    static String setOverload(int num, String text) {
        return "I am a number " + num + " and a text " + text;
    }
}
