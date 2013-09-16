//1,2,0,2,0,1,1,0=  0,0,1,1,1,2,2

public class ThreeFlagProblem {

	public static void main(String[] args){
		int [] A={1,2,0,2,0,1,1,0,0,2,2,1,2,0,1,2,1,2,0,0,2,1,1,0};
		int n=A.length;
		printArr(A, n);
		System.out.println("\n");
		
		threeFlagn2(A);
		printArr(A, n);
		System.out.println("\n");
		
		threeFlagn(A);
		printArr(A, n);
		
	}
	//O(n^2)
	static void threeFlagn2(int []A){
		int n=A.length;
		for(int i=0; i<n; i++){
			int j=0;
			while(j<n-1){
				if(A[j]>=A[j+1]){
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				j++;
			}
		}
	}
	
	
	static void threeFlagn(int []A){
		int n=A.length;
		for(int i=0, j=n-1; j>i;){
			while(A[i]!=2)
				i++;
			while(A[j]==2)
				j--;
			if(i>=j)
				break;
			int temp1=A[j];
			A[j]=A[i];
			A[i]=temp1;
		}
		for(int i=0, j=n-1; j>i;){
			while(A[i]==0)
				i++;
			while(A[j]!=0)
				j--;
			if(i>=j)
				break;
			int temp1=A[j];
			A[j]=A[i];
			A[i]=temp1;
		}
	}
	
	static void printArr(int []A, int n){
		for(int k=0; k<n; k++)
			System.out.print(A[k]+" ");
	}
}
