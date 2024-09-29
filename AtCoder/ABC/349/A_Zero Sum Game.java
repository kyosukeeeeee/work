import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] human = new int[N];
        for(int i = 0; i < N; i++) {
            human[i] = 0;
        }

        int[] result = new int[N];

        for(int i = 0; i < N-1; i++) {
            result[i] = scan.nextInt();
            boolean flg = true;
            while(flg) {
                if(human[i] != result[i]) {
                    if(human[i] < result[i]) {
                        human[i] += 1;
                        human[i + 1] -= 1;
                    } else {
                        human[i] -= 1;
                        human[i + 1] += 1;
                    }
                } else {
                    flg = false;
                }
            }
        }

        System.out.print(human[N-1]);
    }
}