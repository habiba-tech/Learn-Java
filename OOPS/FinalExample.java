//final ,this ,new
public class FinalExample {
    final int maxMarks = 100;

    String name;
    FinalExample(String name){
        this.name = name; //refers to current object's field
    }
    public static void main(String[] args){
        FinalExample s= new FinalExample("Mudgul"); // "new" creates objects
        System.out.println(s.name);
    }
}
