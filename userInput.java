import java.util.Scanner;
/*public class userInput {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String Name = input.nextLine();
        System.out.println("Your name is : "+Name);
    }
}*/

// Addition of two Number
/*public class userInput {
    public static void main(String[] args) {
        Scanner Add = new Scanner (System.in);
        System.out.print("Enter First Number : ");
        int First = Add.nextInt();
        System.out.print("Enter Second Number : ");
        int Sec = Add.nextInt();
        int sum = First + Sec ;
        System.out.println("Sum Of Two Number : "+sum);

    }
}*/


/*public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Length : ");
        int length = input.nextInt();
        System.out.print("Enter A Breadth : ");
        int breadth = input.nextInt();
        int Area = length * breadth ;
        System.out.println("Area of Rectangle is : "+Area);
    }
}*/

//Find the Square and Cube
public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        int square = num * num;
        int cube = num * num * num;
        System.out.println("Square : "+square);
        System.out.println("Cube : "+cube);
    }
}