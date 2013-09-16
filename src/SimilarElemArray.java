// count frequency of elements in array

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class SimilarElemArray {

	public static void main(String[] args) {
		int[] A = { 1, 9,1,9,8,3,4,3,8 };
		int la = A.length;
		similarElement(A,la);
		simEleHash(A);
	}
	
	static void simEleHash(int []A){
		HashMap<Integer, Integer> aMap=new HashMap<>();
		
		for(int a:A){
			int value=0;
			if(aMap.containsKey(a)){
				value=aMap.get(a);
			}
			value++;
			aMap.put(a, value);
		}
		
		Iterator it = aMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry ele=(Entry) it.next();
			int key=(int) ele.getKey();
			int freq=(int) ele.getValue();
			System.out.println("(key= "+key+" freq= "+freq+" ) ");
		}
	}
	
	
	// much space
	static void similarElement(int []A, int la){
		int max=A[0];
		for(int i=1; i<la; i++){
			if(max<A[i])
				max=A[i];
		}
		int [] B=new int [max+1];
		for(int j=0; j<max; j++){
			B[A[j]]+=1;
		}
		for(int j=0; j<=max; j++){
			if(B[j]!=0)
				System.out.println(j+" - "+ B[j]);
		}
	}
}
