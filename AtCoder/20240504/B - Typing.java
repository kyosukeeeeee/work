import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 正しい文字列
        String correct = scan.nextLine();
        // タイピング
        String typing = scan.nextLine();

        // 値保持
        int counter = 0;

        for (int i = 0; i < correct.length(); i++) {

            for (int j = counter; j < typing.length(); j++) {

                if (typing.charAt(j) == correct.charAt(i)) {
                    System.out.print(j + 1 + " ");
                    counter = j + 1;
                    break;
                }
            }
        }
    }
}
