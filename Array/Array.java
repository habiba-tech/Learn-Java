public class Array {
    public static void main(String[] args) {
        //1-dimensional Array
        int numbers[]= {12,56,45,67,3};
        int sum = 0;
        for(int number:numbers){
            sum += number ;
        }
        System.out.println("sum is"+sum);
        
        //Multidimensional Array
         int marks[][]= {
                {28, 65, 67},
                {45, 56, 56},
                {90, 78, 45},
                {45, 56 ,23}
        };
        System.out.println(marks[3][1]);
        System.out.println(marks[0][2]);
        System.out.println(marks[3][2]);
    }
}
