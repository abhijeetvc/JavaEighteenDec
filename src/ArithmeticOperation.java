import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();

        int additionResult=a+b;
        System.out.println("Addition: "+additionResult);
    }
}
