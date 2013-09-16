// move three stairs up, then two stairs down


public class ThreeUpTwoDown {

	
	public static void main(String[] args) {

		int n=11;
		int i=0;
		System.out.print(i+" ");
		while(i<n){
			i=i+3;
			System.out.print(i+" ");
			if(i>=n)
				break;
			i=i-2;
			System.out.print(i+" ");
		}
	}
}
