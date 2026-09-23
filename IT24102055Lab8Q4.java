import java.util.Scanner;

public class IT24102055Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];

      
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = sc.nextInt();
            if (id > 0) {
                studentsArray[i] = id;
            } else {
                System.out.println("Error: Enter a positive Student ID.");
                i--; // repeat input for invalid entry
            }
        }

       
        System.out.print("Enter a Student ID to search: ");
        int searchID = sc.nextInt();
        boolean found = false;

        for (int id : studentsArray) {
            if (id == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
