import java.util.Scanner;
/*public class loopsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for a Table : ");
        int n = input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}*/

//while loop

/* public class loopsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for a Table : ");
        int n = input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+"*"+i+"="+i*n);
            i++;
        }
    }
}*/

// Do while loop

public class loopsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for a Table : ");
        int n = input.nextInt();
        int i = 1;
        do {
            System.out.println(n + "*" + i + "=" + i * n);
            i++;
        } while (i <= 10);

    }
}

