import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // グループ数
        int group = scan.nextInt();

        // 空席
        final int num = scan.nextInt();
        int copy = num;

        int[] humans = new int[group];

        // スタート数
        int count = 0;

        for (int i = 0; i < group; i++) {
            humans[i] = scan.nextInt();
        }

        for (int i = 0; i < group; i++) {
            if (copy >= humans[i]) {
                copy -= humans[i];
            } else {
                count++;
                copy = num;
                i--; // インデックスをデクリメントして、同じグループを再評価
            }
        }
        
        // 待機列が空になった後、もし最後のアトラクションに人が乗っていれば、それをスタートさせる
        if (copy < num) {
            count++;
        }
        
        System.out.println(count);
    }
}
