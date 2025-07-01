// How to write if, else, else-if, return
public class CheckAge {
    public static String verifyAge(int age){
        if (age>=18){
            return "Adult";
        }else {
            return "Minor";
        }
    }
    public static  void main(String[]args){
        System.out.println(verifyAge(20));
    }
}
