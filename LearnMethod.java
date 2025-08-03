import java.util.Scanner;

public class LearnMethod {
    public static void main(String[] args) {
        greet();
        //Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number =input.nextInt();

        // Calling Method to find square
        int Square = SquareChecker(number);
        System.out.println("Square of " + number + " is: " + Square);

        //  Calling method to check Even OR Odd
        CheckEvenOdd(Square);
    }
    //Making Greet Method
    static void greet(){
        System.out.println("Hello World");
    }

    // Find the Square of a number and check if its even or odd

    //Making Method for square
    static int SquareChecker(int num){
        return num*num;
    }
    //Making Method For Even Or Odd
    static void CheckEvenOdd(int num){
        if(num%2==0){
            System.out.println(num+ " is Even.");
        }else {
            System.out.println(num+ " is Odd.");
        }
    }
}
