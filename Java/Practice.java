import java.util.Scanner;

public class Practice 
{
    public static void main(String args[])
    {
        int num1, num2, num3, num4;
        System.out.print("Enter four numbers: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();

        if(num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("All numbers are Equal");
        }
        else
        {
            System.out.println("All numbers are not equal");
        }
        sc.close();
    }   
}
