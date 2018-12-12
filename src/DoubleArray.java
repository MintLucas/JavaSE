public class DoubleArray {
	public static void main(String args[]) {
		String test[] = {"Apple", "Microsoft", "Oracle", "IBM", "Sun"};
		String[] c = new String[5];
		System.arraycopy(test, 0, c, 0, 5);
		
		for(int i=0; i<c.length; i++)
			System.out.print(c[i] + " ");
		System.out.println();
		
		int[][] a = {{11,12},{21,22,23},{31,32,33,34}};     //Stack:a->Heap:里三个小格存第二维数组的地址
		int[][] b = new int[3][];                      //开辟了b指向有三个小格第二维没赋值所以都是NULL
		b[0] = new int[2];                             //由于是引用需要new，初始化应从高维到低维
		
		System.arraycopy(a, 0, b, 0, a.length);		
		b[0][0] = 0;
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)              //由于都是引用第二维数组长度灵活，a[i].length每个指向的长度
				System.out.print(b[i][j] + " ");
	}
}
