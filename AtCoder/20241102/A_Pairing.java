import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] colorlist = new int[4];

        for(int i = 0; i < colorlist.length; i++) {
            colorlist[i] = scan.nextInt();
        };

        Arrays.sort(colorlist);

        int result = 0;
        int counter = 0;
        for(int i = 0; i < colorlist.length; i++) {
            if(i == 0) {
                result = colorlist[i];
            } else {
                if(result == colorlist[i]) {
                    counter++;
                    result = 0;
                } else {
                    result = colorlist[i];
                }
            }
        }

        System.out.print(counter);
    }
}