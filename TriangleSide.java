import java.util.*;
public class TriangleSide {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1:");
        int a= input.nextInt();
        System.out.println("Enter side 2:");
        int b= input.nextInt();
        System.out.println("Enter side 3:");
        int c=input.nextInt();

        if (a==b && b==c){
            System.out.println("Equilateral Triangle");
        }else if (a==b || b==c ||c==a){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalence Triangle");
        }
    }
}
