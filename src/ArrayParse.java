
public class ArrayParse {
	public static void main(String[] args) {
		String s = "1,2;3,4,5;6,7,8";
		String[] sFirst = s.split(";");  //s.spilt(����Ϊ�ָ�����������һ������
		double[][] d = new double[sFirst.length][]; // double[][] d; d = new double[sFirst.length]
		
		
		for(int i=0; i<sFirst.length; i++) {             //ERROR:i<s.length()
			String[] sScecond = sFirst[i].split(",");          //ERROR:String[] sScecond = s.split(","); 
			d[i] = new double[sScecond.length];
			
			for(int j=0; j<sScecond.length; j++) {
				d[i][j] = Double.valueOf(sScecond[j]);  //ת��ΪDouble��parseDouble,����valueOf,������Ϊ�ַ���
				
				System.out.print(d[i][j] + " ");
			}
	    }
	}	
		
}