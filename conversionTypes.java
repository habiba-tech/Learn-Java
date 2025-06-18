public class conversionTypes {
    public static void main(String[] args) {
        int num = 10 ;
        // Implicit conversion
        long number = num ;
        System.out.println("Implicit number is : " + number);

        int  age = 18 ;
        // Explicit conversion
        short newAge = (short)age ;
        System.out.println("Explicit age is :"+ newAge);

    }
}
