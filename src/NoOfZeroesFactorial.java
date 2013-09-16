//count no. of zeroes in n factorial.


public class NoOfZeroesFactorial {

	public static void main(String[] args){
		int n=100, sum =0;
		for(int i=n; i>5; i--){
			int b=fact(i);
			sum=sum+b;
		}
		System.out.print(sum);
	}

	
	static int fact(int i){
		int count =0;
		while(i%5==0){
			i=i/5;
			count++;
		}
		return count;
	}
}
