import java.util.Scanner;
public class VotingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are eligible two to vote!");
        }else{
            System.out.println("Sorry, you must be at least 18.");
        }
    }
}
