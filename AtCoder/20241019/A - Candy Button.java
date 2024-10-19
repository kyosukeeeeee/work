import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int C = scan.nextInt();

        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = scan.nextInt();
        }

        int counter = 0;
        int time = 0;

       for(int j = 0; j < N; j++){
            if(j == 0){
                counter += 1;
                time = num[j];
            } else if(num[j] - time >= C) {
                counter += 1;
                time = num[j];
            }
        }

        System.out.print(counter);
    }
}