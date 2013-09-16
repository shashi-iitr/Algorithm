// check if two given Strings are permutation of each other.

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class PermutationString {
	public static void main(String[] args) {

		String s= "shpfhi";
		String ps="hisshp";
		
		if(isPermString(s, ps))
			System.out.println("permuted");
		else
			System.out.println("not permuted");
		
		
		
		if(permStringHash(s, ps))
			System.out.println("permuted by hashed");
		else
			System.out.println("not permuted by hashed");
	}
	
	// by hashing
	static boolean permStringHash(String s, String ps){

		HashMap<Character, Integer> sMap=new HashMap<Character, Integer>();
		int i=0, value=0;
		for(char a: s.toCharArray()){
			value=0;
			if(sMap.containsKey(s.charAt(i))){
				value=sMap.get(a);
			}
			i++;
			value++;
			sMap.put(a, value);
		}
	
		int j=0;
		for(char a: ps.toCharArray()){
			
			if(sMap.containsKey(ps.charAt(j))){
				value=sMap.get(a);
				value--;
			}
			j++;
			sMap.put(a, value);
		}
		
		java.util.Iterator<Entry<Character, Integer>> it=sMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry permuS= it.next();
			int val=(int) permuS.getValue();
			if(val!=0){
				return false;
			}
		}
		return true;
	}
	
	
	//O(n2)
	static boolean isPermString(String s, String ps){
		char [] chs=s.toCharArray();
		char [] chps=ps.toCharArray();
		int ns=s.length();
		int nps= ps.length();
		if(ns!=nps)
			return false;
		int [] count =new int [nps+1];
		
		for(int i=0; i<ns; i++){
			for(int j=0; j<ns; j++){
				if(chs[i]!=chps[j])
					continue;
				if (chs[i]==chps[j]){
					if(count[j]==0){
						count[j]=1;
						break;
					}
				}
			}
		}
		for(int i=0; i<ns; i++){
			if(count[i]!=1)
				return false;
		}
		return true;
	}
}
