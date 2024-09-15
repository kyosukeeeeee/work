import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] houseNum = new int[M];
        String[] gender = new String[M];
        boolean[] flg = new boolean[N];

        for(int i = 0; i < M; i++) {
            houseNum[i] = scan.nextInt();
            gender[i] = scan.next();
        }

        for(int i = 0; i < M; i++) {
            if(flg[houseNum[i] - 1] == false) {
                if(gender[i].equals("M")) {
                    System.out.println("Yes");
                    flg[houseNum[i] - 1] = true;
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }

        scan.close();
    }
}
