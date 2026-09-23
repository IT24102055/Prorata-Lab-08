import java.util.Scanner;

public class IT24102055Lab8Q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] posNum = new int[6];
        int c = 0;
        int num;
        int maxNum;
        
        while (c < 6) {
            System.out.print("Enter a positive Number (" + (c+1) + "/6): ");
            num = input.nextInt();
            
            if (num > 0) {
                posNum[c] = num;
                c++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }    
        }
        
        maxNum = posNum[0];
        for (int i = 1; i < posNum.length; i++) {  
            if (posNum[i] > maxNum) {
                maxNum = posNum[i];
            }
        }
        
        System.out.println(" ");
        System.out.println("Array Contents: ");
        
        for (int n = 0; n < posNum.length; n++) {  
            System.out.print(posNum[n] + " ");
        }
        
        System.out.println("\nThe max number you entered is: " + maxNum);
        
    }
}
