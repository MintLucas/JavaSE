class Node{
	int id;
	Node left,right;
	

}

class NodeCircle{
	static int count;
	Node first,last;                 //����Ȧ Ӧ������ĩ

	
	NodeCircle(int n){
		for(int i=0; i<n; i++) {		
			add();                     //�˴����ö���.������������ͬһ����ֱ�ӵ��÷���
		}
		
	}
	
	void add() {
		Node kid = new Node();
		kid.id = count;
		
		if(count == 0) {
			first = kid;
			last = kid;
			kid.left = kid;
			kid.right = kid;
		}else {
			kid.left = last;
			kid.right = first;
			last.right = kid;        //ERROR��������һ�䣬Kidǣ�����ң�Lastû��ǣ�ң�����
			last = kid;
			first.left = kid;
		}						
		    count++;				//��Ϻ���count++���Է������õ�count���ж�
	}
	
	void delete(Node k) {
		if(count <= 0) {
			System.out.println("ɾ����������С��0");
		} else if(count == 1){
			first = last = null;
			
		}else {
			k.left.right = k.right;
			k.right.left =k.left;
			System.out.print(k.id + " ");
		}
		count--;
	}
	
	void printCircle(Node t) {
		for(int i=0; i<10; i++) {
			System.out.print(t.id + " ");
			t = t.right;
		}	
	}
}

public class LoopLinkList {
	public static void main(String args[]) {
		NodeCircle j = new NodeCircle(10);
		/*for(int i=0; i<=10; i++) {
			j.add();
		}8*/
		
		j.printCircle(j.first);      //����j��Ҫ�ٵ���j.first��������ֱ�Ӵ���j.first
		System.out.println();
		
		int countNum = 0;
		Node s = j.first;
		while(j.count>1) {
			countNum++;
			if(countNum == 3) {
				j.delete(s);
				countNum = 0;
			}
			s = s.right;
		}
		System.out.println();
		System.out.println(j.first.id); //��Լɪ��һ�������һ���ڵ�Ϊ��
		j.printCircle(j.first); 
	}
}
