import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;

        c = num % 10;  // 1の位
        num = num / 10;

        b = num % 10;  // 10の位
        num = num / 10;

        a = num;       // 100の位

        System.out.print("" + b + c + a + " " + c + a + b);
    }
}
