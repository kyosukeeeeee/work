import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            String abc = scanner.next();
            String input = abc.trim();

            if(input.length() != 6 || !input.startsWith("ABC") || !input.substring(3,6).matches("[0-9]{3}") )
            {
                System.out.println("No");
            }

            int num = Integer.parseInt(input.substring(3,6));

            if(num != 316 && 1 <= num && num < 350){
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }

        }
        catch(NoSuchElementException e)
        {
            System.out.println("No");
        }

        scanner.close();
    }
}