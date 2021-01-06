public class Animal {

    public void eat(){
        System.out.println("All animals eat");
    }

    public void run(){
        System.out.println("All animals run");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println("All dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.bark();
//        d.run();
//        d.eat();
//    }
}

class Puppy extends Dog{

    public void bark1(){
        System.out.println("Puppy barks");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.bark();
        p.bark1();
        p.run();
        p.eat();
    }
}