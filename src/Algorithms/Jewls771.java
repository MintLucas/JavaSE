
public class Jewls771 {
	public static void main(String[] args) {
		String S = "aAAAbbbbb";
		String J = "aA";
		int num = 0;
		
		for(int j=0; j<J.length(); j++) {
			for(int i=0; i<S.length(); i++) {
				if(S.charAt(i) == J.charAt(j))
					num++;					
			}
		}
		
		System.out.println(num);
	}
}
