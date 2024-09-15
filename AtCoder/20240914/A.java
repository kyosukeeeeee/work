import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String AB = scan.next();
        String AC = scan.next();
        String BC = scan.next();

        if (AB.equals(">") && AC.equals("<")) {
            System.out.println("A");
        } else if (AB.equals("<") && AC.equals(">")) {
            System.out.println("A");
        } else if (AB.equals(">") && BC.equals(">")) {
            System.out.println("B");
        } else if (AB.equals("<") && BC.equals("<")) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        scan.close();
    }
}
