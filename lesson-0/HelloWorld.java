
// Hola mundo en Java
class HelloWorld {
    public static void main(String[] args) {
        sayHelloWorld();
        printSum(265, 371);
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void printSum(int a, int b) {
        System.out.print("[TOTAL]: ");
        System.out.println(a + b);
    }
}