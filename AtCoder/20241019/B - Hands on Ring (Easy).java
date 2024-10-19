import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // パーツ数
        int N = scan.nextInt();
        // 指示回数
        int Q = scan.nextInt();

        // 初期生成
        int targetL = 1;
        int targetR = 2;

        int result = 0;

        for (int i = 0; i < Q; i++) {
            String hand = scan.next();
            int target = scan.nextInt();

            if (hand.equals("L")) {
                // 左手を動かす。右手の位置に注意。
                int dist = getMinDistance(N, targetL, target, targetR);
                result += dist;
                targetL = target; // 左手を更新
            } else {
                // 右手を動かす。左手の位置に注意。
                int dist = getMinDistance(N, targetR, target, targetL);
                result += dist;
                targetR = target; // 右手を更新
            }
        }

        System.out.println(result);
    }

    // 2つのパーツ間の最小距離をリング上で計算する関数、ただし他方の手の位置に注意する
    public static int getMinDistance(int N, int from, int to, int otherHand) {
        // 時計回りの距離
        int clockwiseDist = (to - from + N) % N;
        // 反時計回りの距離
        int counterClockwiseDist = (from - to + N) % N;

        // 時計回りの方向で他方の手が進路にある場合、その方向には進めない
        boolean canGoClockwise = isPathClear(N, from, to, otherHand, true);
        // 反時計回りの方向で他方の手が進路にある場合、その方向には進めない
        boolean canGoCounterClockwise = isPathClear(N, from, to, otherHand, false);

        // 進める方向のみを選択
        if (canGoClockwise && canGoCounterClockwise) {
            return Math.min(clockwiseDist, counterClockwiseDist);
        } else if (canGoClockwise) {
            return clockwiseDist;
        } else if (canGoCounterClockwise) {
            return counterClockwiseDist;
        } else {
            // 他方の手が移動する可能性がないため、ここに到達することはありません（与えられる入力は常に合法）。
            return 0;
        }
    }

    // 進路が他方の手に邪魔されていないかを確認する関数
    public static boolean isPathClear(int N, int from, int to, int otherHand, boolean clockwise) {
        if (clockwise) {
            // 時計回りの場合、from から to までの範囲に otherHand が存在しないかを確認
            if (from < to) {
                return otherHand <= from || otherHand >= to;
            } else {
                // from > to の場合、リングを跨ぐ範囲に otherHand が存在しないか確認
                return otherHand <= from && otherHand >= to;
            }
        } else {
            // 反時計回りの場合、from から to までの範囲に otherHand が存在しないかを確認
            if (from > to) {
                return otherHand >= from || otherHand <= to;
            } else {
                // from < to の場合、リングを跨ぐ範囲に otherHand が存在しないか確認
                return otherHand >= from && otherHand <= to;
            }
        }
    }
}
