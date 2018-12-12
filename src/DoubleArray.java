public class DoubleArray {
	public static void main(String args[]) {
		String test[] = {"Apple", "Microsoft", "Oracle", "IBM", "Sun"};
		String[] c = new String[5];
		System.arraycopy(test, 0, c, 0, 5);
		
		for(int i=0; i<c.length; i++)
			System.out.print(c[i] + " ");
		System.out.println();
		
		int[][] a = {{11,12},{21,22,23},{31,32,33,34}};     //Stack:a->Heap:������С���ڶ�ά����ĵ�ַ
		int[][] b = new int[3][];                      //������bָ��������С��ڶ�άû��ֵ���Զ���NULL
		b[0] = new int[2];                             //������������Ҫnew����ʼ��Ӧ�Ӹ�ά����ά
		
		System.arraycopy(a, 0, b, 0, a.length);		
		b[0][0] = 0;
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)              //���ڶ������õڶ�ά���鳤����a[i].lengthÿ��ָ��ĳ���
				System.out.print(b[i][j] + " ");
	}
}
