import java.util.*;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cards = {1, 2, 3, 1, 2, 3};
        List<Integer> list = new ArrayList<>();
        for (int c : cards) list.add(c);
        Collections.shuffle(list);

        int tries = 3;
        while (tries > 0) {
            System.out.println("\nCards: " + Arrays.toString(list).replaceAll("[0-9]", "*"));
            System.out.print("Enter two positions (0-5): ");
            int i = sc.nextInt(), j = sc.nextInt();

            if (list.get(i).equals(list.get(j))) {
                System.out.println("Matched: " + list.get(i));
                list.set(i, 0); list.set(j, 0);
            } else {
                System.out.println("Not a match!");
                tries--;
            }
        }
        System.out.println("Game Over!");
        sc.close();
    }
}
