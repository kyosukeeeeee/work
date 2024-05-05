import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 駅数
        int num = scan.nextInt();
        // スタート
        int start = scan.nextInt();
        // ゴール
        int goal = scan.nextInt();
        // 通過
        int flg = scan.nextInt();

        boolean found = false;

        // 上り
        if (start <= goal) {
            for (int a = start; a <= goal; a++) {
                if (a == flg) {
                    found = true;
                    break;
                }
            }
        }
        // 下り
        else if (start >= goal) {
            for (int b = goal; b <= start; b++) {
                if (b == flg) {
                    found = true;
                    break;
                }
            }
        }

        System.out.println(found ? "Yes" : "No");
    }
}