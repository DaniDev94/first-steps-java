
public class Functions {
    public static void main(String[] args) {
        int responseSum = sum(5, 10);
        System.out.println("The sum is: " + responseSum);
        randomData(responseSum == 15);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void randomData(boolean hasNum) {
        if (hasNum)
            System.out.println("I am active!!!");
        else
            System.out.println("I am not active!!!");
    }

}
