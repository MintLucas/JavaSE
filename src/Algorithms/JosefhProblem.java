class A{                                   
	boolean sta;           //这里仅创建了一个节点，若想打印需要创建一个数组对象
	int mes;
	
	A(boolean sta, int mes){
		this.sta =sta;
		this.mes =mes;
	}
	
	public void arrayPrint(A a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i].mes + " ");
	}
}

public class JosefhProblem {
	public static void main(String args[]) {
		int N =10;                   //约瑟夫环的规模
		int index =0;
		int countNum = 0;
		A[] a = new A[N];           //相当于int a[]={1,2,3}只不过此处A类型不是基础类型需要new空间
		int leftCount = a.length;                         //放在新建数组后，可以用到a.length，a指向一个A类型的数组
		
		for(int j=0; j<a.length; j++) {                    //构造类数组赋初值
			a[j] = new A(true, j);
		}
		/*for(int j=0; j<a.length; j++)
			System.out.print(a[j].mes + " ");                //无法调用arrayPrint 再调试
		
		arrayPrint(a);*/
	
		A temp = new A(false,0);                              //调用类方法需要创建类对象
		temp.arrayPrint(a);
		
		
		System.out.println(); 
		
		while(leftCount > 1) {
			if(a[index].sta == true) 
				countNum++;
				
				/*index = (index+1)%10 ;
				}
			else 	index = (index+1)%10 ;                 //把else也包进了IF的大括号里,此处countNum等于3后没有及时置FALSE index便++了
			*/
			
			if(countNum == 3) {
				countNum = 0;
				a[index].sta = false;                      //后面要用到index，因此不能提前改变位置
				System.out.print(index + " ");
				leftCount--;
			}
			
			index = (index+1)%N ;
			
		}
	}
}
