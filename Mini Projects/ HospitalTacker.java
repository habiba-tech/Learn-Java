import java.util.*;
public class HospitalTacker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[100];
        double[][] readings  = new double[100][3];
        int count = 0;
        while (true){
            System.out.print("Name: ");
            names[count]=input.nextLine();

            System.out.print("Enter 3 readings: ");
            double sum=0;
            for (int i = 0; i < 3; i++) {
                readings[count][i]=input.nextDouble();
                sum += readings[count][i];
            }
            double avg = sum / 3;
            input.nextLine(); // flush newline

            String status;
            if (avg < 60) status ="Critical";
            else if (avg <= 75) status= "Need Attention ";
            else status = "Stable";

            System.out.println("Avg: "+avg + " -> "+ status);
            System.out.print("Add another? (y/n): ");
            if(input.nextLine().equalsIgnoreCase("n"))break;
            count++ ;
        }
        System.out.println("\n---All Patients----");
        for (int i = 0; i < count; i++) {
            System.out.print(names[i]+": ");
            for (double val : readings[i]) {
                System.out.print(val +" ");
            }
            System.out.println();
        }
        input.close();
    }
}
