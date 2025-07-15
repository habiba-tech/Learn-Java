import java.util.*;
public class inputArrya {
    public static void main(String[] args) {
        String arr[] = new String[67];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter AnyThings  : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }
        System.out.println("Araay Elements: ");
        for( String name : arr){
            System.out.println(name);
        }
    }
}
