import java.util.Scanner;

public class IT24102055Lab8Q1B{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		int[] myArray = new int[5];
		int[] evenArray = new int[5];
		int c=0;
		
		System.out.println("Enter 5 numbers: ");
		
		for(int i = 0; i<5; i++){
			System.out.print("Enter Number " + ++c + ": ");
			myArray[i] = input.nextInt();
		}
	
		System.out.println(" ");
		System.out.println("myArray Contents: ");
		
		for(int a=0; a<5; a++){
			System.out.print(myArray[a]  + " ");
		}
		
		for(int b=0; b<5; b++){
			if ((myArray[b]%2) == 0){
					
					evenArray[b]= myArray[b];
					
			}else{
			
					continue;
				
			}
				
		}
		
		System.out.println(" ");
		System.out.println("evenArray Contents: ");
		
		for(int d=0; d<5; d++){
			System.out.print(evenArray[d]  + " ");
		}
			
		
		
	}
}