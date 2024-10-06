import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strS = scan.nextLine();
        String strT = scan.nextLine();

        if(strS.equals(strT)) {
            System.out.println(0);
        } else {
            int counter = 1;
            boolean flg = false;
            for(int i=0; i < strS.length(); i++){
                if(strS.charAt(i) == strT.charAt(i)) {
                    counter++;
                } else {
                    System.out.println(counter);
                    flg = true;
                }

                if(flg) {
                    break;
                }

                if(i + 1 == strS.length()) {
                    System.out.println(counter);
                }
            }
        }
    }
}