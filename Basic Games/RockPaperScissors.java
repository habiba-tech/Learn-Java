import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Enter your choice (0-Rock, 1-Paper, 2-Scissors): ");
        int user = sc.nextInt();
        int comp = rand.nextInt(3);

        System.out.println("You chose: " + choices[user]);
        System.out.println("Computer chose: " + choices[comp]);

        if (user == comp)
            System.out.println("It's a Draw!");
        else if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1))
            System.out.println("You Win!");
        else
            System.out.println("You Lose!");

        sc.close();
    }
}
