import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++) {
            if(i == 0) {
                System.out.print(-1);
            } else {
                boolean flg = true;
                int counter = i - 1;
                while(flg) {
                    if(A[i] == A[counter]) {
                        System.out.print(" " + (counter + 1));
                        flg = false;
                    }
                    else {
                        if(counter == 0) {
                            System.out.print(" " + -1);
                            flg = false;
                        } else {
                            counter--;
                        }
                    }
                }
            }
        }
        
        scan.close();
    }
}
