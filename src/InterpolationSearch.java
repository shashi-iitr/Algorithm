//Interpolation search, valid for unique digits only.

public class InterpolationSearch {

	public static void main(String[] args){
		int []A={1,3,7,9,11,28,39,90};
		int x=90;
		int b=interpolationSearch(A,x);
		System.out.print(b);
	}
	
	static int interpolationSearch(int []A,int x){
		int low=0, high=A.length-1;
		int mid=0;
		while(A[low]<=x && A[high]>=x){
			mid=low+((x-A[low])*(high-low))/(A[high]-A[low]);
			low++; high--;
		}
		
		if(A[mid]<x){
			low=mid+1;
		}else if(A[mid]>x){
			high=mid-1;
		} else
			return mid;
		if(A[low]==x){
			return low;
		}else 
			return -1;
	}
}
