class A{                                   
	boolean sta;           //�����������һ���ڵ㣬�����ӡ��Ҫ����һ���������
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
		int N =10;                   //Լɪ�򻷵Ĺ�ģ
		int index =0;
		int countNum = 0;
		A[] a = new A[N];           //�൱��int a[]={1,2,3}ֻ�����˴�A���Ͳ��ǻ���������Ҫnew�ռ�
		int leftCount = a.length;                         //�����½�����󣬿����õ�a.length��aָ��һ��A���͵�����
		
		for(int j=0; j<a.length; j++) {                    //���������鸳��ֵ
			a[j] = new A(true, j);
		}
		/*for(int j=0; j<a.length; j++)
			System.out.print(a[j].mes + " ");                //�޷�����arrayPrint �ٵ���
		
		arrayPrint(a);*/
	
		A temp = new A(false,0);                              //�����෽����Ҫ���������
		temp.arrayPrint(a);
		
		
		System.out.println(); 
		
		while(leftCount > 1) {
			if(a[index].sta == true) 
				countNum++;
				
				/*index = (index+1)%10 ;
				}
			else 	index = (index+1)%10 ;                 //��elseҲ������IF�Ĵ�������,�˴�countNum����3��û�м�ʱ��FALSE index��++��
			*/
			
			if(countNum == 3) {
				countNum = 0;
				a[index].sta = false;                      //����Ҫ�õ�index����˲�����ǰ�ı�λ��
				System.out.print(index + " ");
				leftCount--;
			}
			
			index = (index+1)%N ;
			
		}
	}
}
