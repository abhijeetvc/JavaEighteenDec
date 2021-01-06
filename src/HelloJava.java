// Variables: Storage area in memory
// Types of variables: a) instance variables, b) local variables, c) static/class variables,
//                      d) parameters

public class HelloJava {

    int x=20;   // instance variable
    int y=40;   // instance variable

    static int p=50;  // static/class variable

   public static void main(String[] args) {
       int a=10;  // local variable
       System.out.println("Value of a: "+a);

       HelloJava h=new HelloJava();
    //   System.out.println("Value of x: "+h.x);
       System.out.println("Value of x: "+h.x);
       System.out.println("Value of y: "+h.y);
       System.out.println("Value of p: "+p);


    }
}
