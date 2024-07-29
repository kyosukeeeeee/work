import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 個数を入力
        int num = scan.nextInt();

        int[] height = new int[num];

        boolean found = false;
        int result = 0;
        
        // 高さの値を入力
        for (int i = 0; i < num; i++) {
            height[i] = scan.nextInt();
        }

        // 最初の要素より大きい要素のインデックスを探す
        for (int i = 1; i < num; i++) {
            if (height[0] < height[i]) {
                found = true;
                result = i + 1;
                break;
            }
        }

        // 結果の出力
        if (found) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }

        // Scannerオブジェクトをクローズ
        scan.close();
    }
}
