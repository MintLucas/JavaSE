
public class IntegerAndDouble {
	public static void main(String[] args)  {
		
		Integer i = new Integer(100);       //ERROR:new int(100)
		Double d = new Double("123.56");
		int j = i.intValue()+d.intValue();
		float f = i.floatValue()+d.floatValue();
		System.out.println(j + " " + f);
		double pi = Double.parseDouble("3.1415");//as performed by the valueOf method of class Double.=new Double("")
		double r = Double.valueOf("2.0").doubleValue();
		double ss = pi*r*r;
		System.out.println(ss);
		
		try{
			int k = Integer.parseInt("1.23");
			
		}catch(NumberFormatException e) {
			System.out.println("数据格式不对");
		}
		System.out.println(Integer.toBinaryString(123)+"B");
		System.out.println(Integer.toHexString(123)+"H");
		System.out.println(Integer.toOctalString(123)+"O");
	}
	
}


