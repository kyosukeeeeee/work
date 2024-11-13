import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        String S = scan.next();

        StringBuilder str = new StringBuilder(S);

        String strX = "";
        for (int i = 0; i < K; i++) {
            strX += "X";
        }

        int result = 0;
        int counter = 0;

        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'O') {
                counter++;
                if (counter == K) {
                    result++;
                    str.replace(i - K + 1, i + 1, strX);
                    counter = 0;
                    i = 0;
                }
            } else {
                counter = 0;
            }
        }

        System.out.println(result);
    }
}
