package Unit1;

import java.util.*;

public class EqualChecker
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 4 integers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();

        if(num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

        s.close();
    }

}

