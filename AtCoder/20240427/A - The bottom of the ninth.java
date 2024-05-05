import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int[] takahashi = new int[9];
        int[] aoki = new int[8];

        for(int i = 0; i < takahashi.length; i++)
        {
            takahashi[i] = scanner.nextInt();
        }
        for(int j = 0; j < aoki.length; j++)
        {
            aoki[j] = scanner.nextInt();
        }
        scanner.close();

        int takahashiResult = 0;
        int aokiResult = 0;
        for(int i = 0; i < takahashi.length; i++)
        {
            takahashiResult += takahashi[i];
        }
        for(int j = 0; j < aoki.length; j++)
        {
            aokiResult += aoki[j];
        }

        int result = takahashiResult - aokiResult;

        System.out.print(result + 1);
    }
}