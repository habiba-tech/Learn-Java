public class Nestedloop {
    public static void main(String[] args) {
        //Number Star of pyramid
        for(int i =0; i < 8; i++){
            for(int j=0 ;j <= i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//star of pyramid
public class Nestedloop {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// rectangle of star
public class Nestedloop {
    public static void main(String[] args) {
        int rows = 3, cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 //Floyd's Triangle
 public class Nestedloop {
     public static void main(String[] args) {
         int n = 5;
         int num = 1;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(num +++" ");
             }
             System.out.println();
         }
     }
 }

