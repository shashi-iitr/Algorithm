//A[i]^2+A[j]^2=A[k]2, in a sorted array find set of pytha triplet 

public class PythagoreanElementArray {

	public static void main(String[] agrs){
		int [] A={2,3,4,5,6,8,9,10,12, 30, 31, 32, 40, 45, 47, 50, 51,100};
		int b=pythgArrayN3(A);
		int c=pythgArray(A);
		
		System.out.print("\n\nno. of triplets in b= "+ b);
		System.out.print("\n\nno. of triplets in c= "+ c);
	}
	
	
	//O(n^2)
	static int pythgArray(int []A){
		int np1=0;
		int l=A.length;
		int n=l-1;
		int [] sqrA=new int [l];
		for(int i=0; i<l; i++)
			sqrA[i]=A[i]*A[i];
		for(int j=2; j<l; j++){
			int k=0;
			n=j-1;
			while(k<n){
				if(sqrA[k]+sqrA[n]==sqrA[j]){
					System.out.print("("+A[k]+", "+A[n]+", "+A[j]+")");
					k++;
					n--;
					np1++;
				}
				else if(sqrA[k]+sqrA[n]<sqrA[j])
					k++;
				else
					n--;
			}
		}
		return np1;
	}
	
	
	//O(n^3)
	static int pythgArrayN3(int []A){
		int n=A.length;
		int l=n-1;
		int np=0;
		int [] sqrA=new int [n];
		for(int i=0; i<n; i++)
			sqrA[i]=A[i]*A[i];
		for(int i=0; i<=l-2; i++)
			for(int j=i+1; j<=l-1; j++)
				for(int k=i+2; k<=l; k++)
					if(sqrA[i]+sqrA[j]==sqrA[k]){
						System.out.print("("+A[i]+", "+A[j]+", "+A[k]+")");
						np++;
					}
		return np;
	}
}
