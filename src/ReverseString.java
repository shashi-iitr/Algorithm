
public class ReverseString {
	public static void main(String[] args) {
		String s="shatsui";
		String rS=reverseString(s);
		System.out.println(s);
		System.out.println(rS);
	}
	
	static String reverseString(String s){
		char [] chArr=s.toCharArray();
		int i=0; 
		int l=s.length();
		while(i<l){
			swap(chArr, i, l-1);
			i++;
			l--;
		}
		String rS=new String(chArr);
		return rS;
	}
	
	static char[] swap(char[] chArr, int a, int b){
		char t=chArr[a];
		chArr[a]=chArr[b];
		chArr[b]=t;
		return chArr;
	}
}
