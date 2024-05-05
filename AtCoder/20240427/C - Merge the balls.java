import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // ボール数
        int num = scanner.nextInt();
        // 大きさ
        int[] big = new int[num];

        for(int i = 0; i < big.length; i++)
        {
            big[i] = scanner.nextInt();
        }

        scanner.close();

        // 比較処理
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < big.length; i++)
        {
            // 初回処理
            if(result.size() != 0)
            {
                result.add(big[i]);
            }
            else
            {
                // 挿入した値が条件に引っかかるとき
                if(result.get(result.size() - 1) == big[i])
                {
                    result.set(result.size() - 1, big[i] + 1);

                    boolean flg = true;
                    while(flg)
                    {   
                        if(result.size() >= 2)
                        {
                            if(result.get(result.size() - 1) == result.get(result.size() - 2))
                            {
                                result.set(result.size() - 2, result.get(result.size() - 2) + 1);
                                result.remove(result.size() - 1);
                            }
                            else
                            {
                                flg = false;
                            }
                        }
                        else
                        {
                            flg = false;
                        }
                    }
                }
                else
                // 条件に合わなければそのまま挿入
                {
                    result.add(big[i]);
                }
            }

        }
    }
}