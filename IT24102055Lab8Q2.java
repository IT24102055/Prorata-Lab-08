public class IT24102055Lab8Q2{
	public static void main(String[] args){
		
		
		int A[] = {10, 20, 30, 40, 50};
		int B[] = {34, 67, 12, 89, 12};
		int C[]=new int[5];

		
		System.out.println("A Array Content: ");
		
		for(int i = 0; i<5; i++){
			System.out.print(A[i]  + " ");
		}
		
		System.out.println(" ");
		System.out.println("B Array Content: ");
		
		for(int i = 0; i<5; i++){
			System.out.print(B[i]  + " ");
		}
		
		System.out.println(" ");
		System.out.println("C Array Content(A+B): ");
		
		for(int i = 0; i<5; i++){
			
			C[i]=A[i]+B[i];
			
		}
		
		for(int i = 0; i<5; i++){
			System.out.print(C[i]  + " ");
		}
		
		
	}
}