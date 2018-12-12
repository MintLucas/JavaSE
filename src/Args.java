public class Args {
	public static void main(String args[]) {
		int a[] = new int[args.length];               //ERROR:int a[] = null;
		
		if(args.length<3) {
			System.out.println("Usage: java Args \"n1 op \"n2 ");
			System.exit(-1);
		}
		
		double d1 = Double.parseDouble(args[0]);
		double d2 = Double.parseDouble(args[2]);
		double d = 0;
		
		if(args[1].equals("+")) d = d1+d2;   //swich(args[1]) {case "+" : d = d1+d2;}
		if(args[1] == "-") d = d1-d2;
		if(args[1] == "x") d = d1*d2;
		if(args[1] == "/") d = d1/d2;
		
		System.out.println(d);
		
		for(int i = 0; i<args.length; i++) {         //输入转换为一个整型数组
			System.out.print(args[i] + " ");
			a[i] = Integer.parseInt(args[i]);
		}
		
		ArraySort test = new ArraySort();
		test.InsertSort(a);
		System.out.println();
		
		for(int i = 0; i<args.length; i++) {             //打印数组（常用方法）可以写进一个方法里
			System.out.print(a[i] + " ");
		}
	}
}

class ArraySort{
	public void InsertSort(int arg[]) {
		int temp = 0;
		int j = 0;
		for(int i=2; i<arg.length; i++) {
			if(arg[i] < arg[i-1]) {
				temp = arg[i];
				for(j=i-1; arg[j]>temp; j--) {
					arg[j+1] = arg[j];					
				}
	
				arg[j+1] = temp;	
			}
		}
	}
	
	public void selectionSort(int a[]) {
		int temp = 0;
		int min = 0;
		for(int i=0; i<a.length; i++) {
			min = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j] < a[min]){
				min = j;
				}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			}
		}
		
	}
	
	public void quickSort(int a[], int p, int r) {
		int x = a[r];     
		int i = p-1;
		for(int j=p; j<r; j++) {
			if(a[j] <= x) {
				i++;
				exchange(a[j], a[i]);
			}
		}
		exchange(a[r], a[i+1]);
	}
	
	public void exchange(int x,int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
	}
}