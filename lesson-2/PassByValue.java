public class PassByValue {

    public static void main(String[] args) {
        int num = 107;
        // Paso por valor => no se modifica el valor original de la variable num
        // Paso por referencia => se modifica el valor original de la variable num
        int changeNum = setChangeNum(num);
        System.out.println("The original number is: " + num);
        System.out.print("The changed number is: " + changeNum);
        System.out.print(" => Thi is copy of the original number.");
        
    }

    static int setChangeNum(int num) {
        num = 100;
        return num;
    }
}