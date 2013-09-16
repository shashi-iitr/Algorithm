
public class ReverseWords {
	public static void main(String[] args) {

		String s="my laptop is superb";
		//String rW=reverseWord(s);
		String rS=reverseWords(s);
		rS=rS.trim();
		System.out.print(rS);
	}
	
	
	
	static String reverseWords(String s){
		int n=s.length();
		String rS="";
		
		char [] ch=s.toCharArray();
		for(int i=0; i<n; i++){
			String temp="";
			while(i<n && ch[i]!=' '){
				temp= temp+String.valueOf(ch[i]);
				i++;
			}
			//System.out.print(temp+"  ");
			String reverseTemp= ReverseString.reverseString(temp);
			
			//System.out.println(reverseTemp);
			rS=rS+reverseTemp+" ";
		}
	return rS;
	}
}
