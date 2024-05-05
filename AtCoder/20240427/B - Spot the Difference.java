import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // 升目
        int Squares = scanner.nextInt();

        // 入力文字
        String[] a = new String[Squares];
        // 入力文字
        String[] b = new String[Squares];

        for(int i = 0; i < a.length; i++)
        {
            a[i] = scanner.next();
        }
        for(int i = 0; i < b.length; i++)
        {
            b[i] = scanner.next();
        }
        scanner.close();

        // グリッドA
        String[][] gridA = new String[Squares][Squares];
        // グリッドB
        String[][] gridB = new String[Squares][Squares];

        // グリッドに挿入
        for(int i = 0; i < Squares; i++)
        {
            for(int j = 0; j < Squares; j++)
            {
                gridA[i][j] = a[i].substring(j, j + 1);
                gridB[i][j] = b[i].substring(j, j + 1);
            }
        }


        for(int i = 0; i < Squares; i++)
        {
            for(int j = 0; j < Squares; j++)
            {
                if(!gridA[i][j].equals(gridB[i][j]))
                {
                    System.out.println((i + 1) + " " + (j + 1));
                    break;
                }
                
            }
        }

    }
}