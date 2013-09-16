// check if given String has unique characters.

public class UniqueCharString {
	public static void main(String[] args) {
		String s="abtthef";
		if(uniquechar(s))
			System.out.println(" all characters are unique");
		else
			System.out.println(" all characters are not unique");
		
		if(uniqueCharN2(s))
			System.out.println(" N2 all characters are unique");
		else
			System.out.println(" N2 all characters are not unique");
	}
	
	// O(n^2)
	static boolean uniqueCharN2(String s){
		char [] ch=s.toCharArray();
		
		int n=s.length();
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
				if(ch[i]==ch[j])
					return false;
		return true;
	}
	
	//O(n)
	static  boolean uniquechar(String s){
		char [] ch=s.toCharArray();
		int[] count=new int [26];
		int n=s.length();
		for(int i=0; i<n; i++){
			count[ch[i]-'a']++;
		}
		for(int i=0; i<26; i++){
			if(count[i]>1)
				return false;
		}
		return true;
	}
}
