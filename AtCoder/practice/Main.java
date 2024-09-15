//ABC 086 A - Product
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a * b % 2 == 0) {
            System.out.println("Even")
        } else {
            System.out.printkn("Odd")
        }

        scan.close();
    }
}

//A - RGB Cards
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = (a*100) + (b*10) + c;

        if(sum % 4 === 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scan.close();
    }
}

//A - Infinite Coins
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();

        int num = n % 500;

        if(num <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}

//A - Duplex Printing
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // グループ分けかつあまりで+1グループする場合
        //(a + b - 1) / b
        int result = (n + 2 - 1) / 2;

        System.out.print(result);

        scan.close();
    }
}

//ABC 081 A - Placing Marbles
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[3];
        for(int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }

        int result = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] == 1) {
                result += 1;
            }
        }

        System.out.println(result);

        scan.close();
    }
}