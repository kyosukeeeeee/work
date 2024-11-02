import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] q = new int[N];
        int[] r = new int[N];
        for(int i = 0; i < N; i++) {
            q[i] = scan.nextInt();
            r[i] = scan.nextInt();
        }

        int Q = scan.nextInt();
        int[] t = new int[Q];
        int[] d = new int[Q];
        for(int i = 0; i < Q; i++) {
            t[i] = scan.nextInt();
            d[i] = scan.nextInt();
        }

        // 計算
        for(int i = 0; i < Q; i++) {
            int type = t[i] - 1;
            int date = d[i];

            // 条件を満たす最小の日付を効率的に求める
            if (date % q[type] != r[type]) {
                date += (r[type] - (date % q[type]) + q[type]) % q[type];
            }

            System.out.println(date);
        }
        
        scan.close();
    }
}
