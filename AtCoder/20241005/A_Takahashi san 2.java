import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        if(str.endsWith("san")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}