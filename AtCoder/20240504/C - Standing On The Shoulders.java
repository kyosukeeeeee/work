import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // 肩までの合計
        long result = 0;
        // 頭のMAX
        long maxhead = 0;

        // 入力回数
        int n = scan.nextInt();

        // 肩
        long sholder = 0;
        // 頭
        long head = 0;

        for(int i = 0; i < n; i++)
        {
            sholder = scan.nextInt();
            head = scan.nextInt();

            result += sholder;
            maxhead = Math.max(maxhead, head - sholder);
        }
        
        System.out.print(result + maxhead);
    }
}