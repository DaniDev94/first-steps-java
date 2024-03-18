public class Precedence {
    public static void main(String[] args) {
        int n = 2;
        int m = n++*3+2+(++n);
        System.out.println(m); // 2*3+2+4 = 12

        n = 2;
        int x = ++n+2+3*n++;
        n = 2;
        int y = ++n+2+3*(n+++1);
        System.out.println(x); // 3+2+3*3 = 14
        System.out.println(y); // 4+2+3*4 = 17
    }    
}
