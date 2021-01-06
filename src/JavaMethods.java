import java.util.Scanner;

public class JavaMethods {

    int num1;
    int num2;

    public JavaMethods(int num3,int num4){
       num1=num3;   // this is a keyword in java. It is used to refer to current object
        num2=num4;
    }

    public int add(){
        int add=num1+num2;
        System.out.println("Addition is: "+add);
        return add;
    }

    public void multiply(){
        int retValue=add();
        int result=retValue*10;
        System.out.println("Result is: "+result);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();

        int num3=10;
        int num4=20;
        JavaMethods j=new JavaMethods(num1,num2);
        JavaMethods j1=new JavaMethods(num3,num4);
        j.multiply();
        j1.multiply();

//        int sub=num1-num2;
//        System.out.println("Subtraction is: "+sub);
//
//        int div=num1/num2;
//        System.out.println("Division is: "+div);
//
//        int mul=num1*num2;
//        System.out.println("Multiplication is: "+mul);

    }
}
