
public class StringLowCount {
	public static void main(String[] args) {
		String s = "sdajavadajavaaajava2211javaDAKjavaDjava";          //���{"falkfjwfkqjnADAFsdafojflDFA2124"}Ϊ����
	 	
		UpAndLow test = new UpAndLow();
		test.CountNum2(s);
		test.numJava(s);
	}
}

class UpAndLow{
	void CountNum1(String s){
		int lCount = 0, uCount = 0, oCount = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
				lCount++;
			else if (c >= 'A' && c <= 'Z')
				uCount++;
			else oCount++;
		}
		
		System.out.println(lCount + " " + uCount + " " + oCount); //lCount + uCount + oCount=32����
	}
	
	void CountNum2(String s){
		int lCount = 0, uCount = 0, oCount = 0;
		String lowcase = "abcdefghijklmnopqrstuvwxyz";
		String upcase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(lowcase.indexOf(c) != -1)
				lCount++;
			else if (upcase.indexOf(c) != -1)
				uCount++;
			else oCount++;
		}
		
		System.out.println(lCount + " " + uCount + " " + oCount); //lCount + uCount + oCount=32����
	}
	
	void numJava(String s) {
		int index = -1;
		int count = 0;
		String ToFind = "java";
		
		while((index = s.indexOf(ToFind)) != -1) {                //ERROR:index != -1,�˴����һ��Index�����ټ�4ͻ����������
			s = s.substring(index + ToFind.length());         
			count++;
		}
		System.out.println(count);
	}
}