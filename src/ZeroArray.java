//tO(n*m) sO(n+m)  zero at any index will make the complete row and column zero.
public class ZeroArray {
	public static void main(String[] args) {
		int n=4, m=5;
		int [][] A={{0,7,1,4,0},{8,3,9,8,1},{0,0,2,3,4},{3,4,5,3,7}};
		printArray(A, n, m);
		
		System.out.println("\n");
		int [][]B=zeroArray(A);
		printArray(A, n, m);
		System.out.println("\n");
		printArray(B, n, m);
	}
	
	
	static int [][]zeroArray(int [][] A){
		int n=4,  m=5;
		int [] tempi=new int [n];
		int [] tempj=new int [m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(A[i][j]==0){
					tempi[i]=1;
					tempj[j]=1;
				}
			}
		}
		for(int i=0; i<n; i++)
			if(tempi[i]==1)
				for(int j=0; j<m; j++)
					A[i][j]=0;
		for(int j=0; j<m; j++)
			if(tempj[j]==1)
				for(int i=0; i<n; i++)
					A[i][j]=0;
		return A;
	}
	
	
	static void printArray(int [][]A, int n, int m){
		for(int h=0; h<n; h++){
			for(int k=0; k<m; k++)
				System.out.print(A[h][k]+" ");
			System.out.println();
		}
	}
}
