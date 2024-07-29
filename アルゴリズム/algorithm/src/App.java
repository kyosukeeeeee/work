import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int N = scan.nextInt();
        int[] x = new int[N];

        int min = 0;
        int max = 0;

        for(int i = 0; i < N; i++)
        {
            x[i] = scan.nextInt();
            
            //最小判定
            min = Math.max(min, Math.min(x[i], L - x[i]));

            //最小判定
            max = Math.max(max, Math.max(x[i], L - x[i]));
        }

        scan.close();

        System.out.println("最小値" + min);
        System.out.println("最大値" + max);

    }
}
