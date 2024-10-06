import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Nは部署の数
        int N = scan.nextInt();
        
        // 各部署に所属する人数を格納する配列
        int[] num = new int[N];
        
        // 部署の人数の合計を計算するための変数
        int totalSum = 0;
        
        // 部署ごとの人数を入力し、totalSumに全体の合計を加算
        for(int i = 0; i < N; i++){
            num[i] = scan.nextInt();
            totalSum += num[i];
        }

        // 最小化したい値を格納する変数。最初は非常に大きな値に設定
        int minMaxGroupSum = Integer.MAX_VALUE;

        // ビット全探索で2つのグループに分ける全ての組み合わせを試す
        for (int bit = 0; bit < (1 << N); bit++) {
            int groupASum = 0;
            int groupBSum = 0;
            
            // 各ビットの状態に応じてグループAかグループBに割り当て
            for (int i = 0; i < N; i++) {
                if ((bit & (1 << i)) != 0) {
                    // 部署iをグループAに割り当て
                    groupASum += num[i];
                } else {
                    // 部署iをグループBに割り当て
                    groupBSum += num[i];
                }
            }

            // AとBの大きい方の人数を取る
            int currentMax = Math.max(groupASum, groupBSum);
            
            // その最大人数が今までの最小値より小さければ更新
            minMaxGroupSum = Math.min(minMaxGroupSum, currentMax);
        }

        // 最終的に求めた最小の最大人数を出力
        System.out.println(minMaxGroupSum);
    }
}
