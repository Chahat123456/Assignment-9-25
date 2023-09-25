
import java.util.Scanner;

public class markscalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

       
        double totalMarks = 0.0;

        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double subjectMarks = scanner.nextDouble();
            totalMarks += subjectMarks;
        }

       
        double averageMarks = totalMarks / numSubjects;

  
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);

      
        scanner.close();
    }
}





