import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;


public class AmagonCoinSol {

	public static void main(String [] args){
		
		
		Vector <Integer> v=new Vector<Integer>();
		v.add(3);
		v.add(7);
		v.add(10);
		
		
		int S=2;
		
		int m=minCoins(v, S);
		System.out.print(m);
	}
	
	
	
	
	
	static int minCoins(Vector <Integer>a , int S) {

        
        int setSize= a.size();
        Collections.sort(a);
        System.out.println("set size"+ setSize);
        
        //define new array for storing min no of coins for each sum upto S
        int [] Min= new int [S+1];
        //initialize all array elements to a very high value
        Arrays.fill(Min, 5000);
        Min[0]=0;
        try{
        for (int i=1; i<=S; i++) {
            for (int j=0; j<=setSize-1;j++) {
                if((a.get(j)<=i) && ((Min[i-a.get(j)]+1)<Min[i]))
                    Min[i]=Min[i-a.get(j)]+1;
                
            }
        }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return Min[S];
	}
}
	
