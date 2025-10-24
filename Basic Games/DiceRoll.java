import java.util.Random;

public class DiceRollGame {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("🎲 Welcome to the Dice Roll Game!");

        // Roll two dice
        int dice1 = rand.nextInt(6) + 1; // 1–6
        int dice2 = rand.nextInt(6) + 1; // 1–6

        int total = dice1 + dice2;

        // Show results
        System.out.println("You rolled: " + dice1 + " and " + dice2);
        System.out.println("Total = " + total);

        // Decide winner
        if (total == 7 || total == 11) {
            System.out.println("🎉 Congratulations! You Win!");
        } else {
            System.out.println("❌ Computer Wins!");
        }
    }
}
