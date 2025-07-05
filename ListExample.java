import java.util.*;
public class ListExample {
    public static void main(String[]args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Cat");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println("First animal:" + animals.get(0));
        animals.remove("Cat");
        System.out.println("After removing cat:" + animals);
    }
}
