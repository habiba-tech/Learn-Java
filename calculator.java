import java.util.Scanner;
public class calculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double a = input.nextDouble();
        System.out.println("Choose the Operation (+,-,*,/) : ");
        char op = input.next().charAt(0);
        System.out.println("Enter Second Number : ");
        double b = input.nextDouble();

        if(op=='+') {
            System.out.println("Addition : " + (int)(a + b));
        }else if(op=='-') {
            System.out.println("Subtraction : " + (int)(a - b));
        }else if(op=='*') {
            System.out.println("Multiplication : " + (int)(a * b));
        }else if(op=='/') {
            if (b != 0) {
                System.out.println("Division : " + (a / b));
            }
            else{
                    System.out.println("Error: Division by zero not allowed.");
                }
        }else{
            System.out.println("Invalid Operation!");
        }
        input.close();
    }
}
