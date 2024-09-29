import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        
        // 通り保管用
        int num[] = new int[101];
        for(int i=0; i < num.length; i++) {
            num[i] = 0;
        }

        // 受け取った文字列を一文字ずつ分解
        char[] list = new char[S.length()];
        for(int i=0; i < S.length(); i++) {
            list[i] = S.charAt(i);
        }
        // 分解後a → zに並び替え
        Arrays.sort(list);


        char c = '\u0000';
        int counter = 0;
        for(int i=0; i < list.length; i++) {
            if(i == 0) {
                counter++;
            } else {
                if(list[i] == c) {
                    counter++;
                    if(i == list.length -1) {
                        num[counter] += 1;
                    }
                } else {
                    num[counter] += 1;
                    counter = 0;
                }
            }

            c = list[i];
        }

        boolean can = true;
        for(int i=0; i < num.length; i++) {
            if(!(num[i] == 0 || num[i] == 2)) {
                System.out.println("No");
                can = false;
            }
        }

        if(can) {
            System.out.println("Yes");
        }
    }
}