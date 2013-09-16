//aadddaaaa=a2d3a4

public class Countchar {
	public static void main(String[] args) {

		
		String s="abaacbbccca";
		String cS=countString(s);
		System.out.print(cS);
	}

	
	static String countString(String s){
		char [] chs=s.toCharArray();
		int n=s.length();
		String cS="";
		for(int i=0; i<n;){
			int count =0;
			for(int j=i; j<n; j++){
				if(chs[j]==chs[i]){
					count++;
				}
				else
					break;
			}
			
			cS=cS+chs[i];
			cS=cS+Integer.valueOf(count);
			i=i+count;
		}
		int ns=cS.length();
		if(n<ns)
			return cS;
		else
			return s;
	}
}
