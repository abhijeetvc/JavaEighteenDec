public class CheckConstructor {

    int a;
    int b;

    public CheckConstructor(int a,int b){
        System.out.println("in constructor");
    }

    void check(){
        int add=a+b;
        System.out.println("In check method"+add);
    }
    public static void main(String[] args) {
        CheckConstructor c=new CheckConstructor(10,20);
        c.check();
    }
}
