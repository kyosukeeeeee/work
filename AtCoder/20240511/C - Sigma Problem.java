import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // カウント
        int count = scan.nextInt();
        // 数値
        int[] num = new int[count];
        // 結果
        long result = 0;

        int n = num.length;

        final long MOD = 100000000;
        
        for(int i = 0; i < n; i++)
        {
            num[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                result += (num[i] + num[j]) % MOD;
            }
        }

        System.out.println(result);
    }
}
