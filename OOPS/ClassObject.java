package OOPS;

public class ClassObject {
    public static void main(String[] args) {
        //Creating Object for Dog 1
        Dog d1 = new Dog();
        d1.name="Tommy";
        d1.brak();

        //Creating Object for Dog 2
        Dog d2 = new Dog();
        d2.name="Toufi";
        d2.Walk();
    }
    //Creating class
    static class Dog {
        String name;
        int age;
        String Color;

        //Creating behaviours for Dog
        void Walk() {
            System.out.println(name + " is Walking");
        }

        void brak() {
            System.out.println(name + " is Braking");
        }
    }
}
