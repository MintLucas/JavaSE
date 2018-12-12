class Node{
	int id;
	Node left,right;
	

}

class NodeCircle{
	static int count;
	Node first,last;                 //对于圈 应该有首末

	
	NodeCircle(int n){
		for(int i=0; i<n; i++) {		
			add();                     //此处不用对象.方法，可能在同一类里直接调用方法
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
			last.right = kid;        //ERROR：少了这一句，Kid牵了左右，Last没有牵右，断链
			last = kid;
			first.left = kid;
		}						
		    count++;				//完毕后再count++，以防后面用到count来判断
	}
	
	void delete(Node k) {
		if(count <= 0) {
			System.out.println("删除人数不能小于0");
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
		
		j.printCircle(j.first);      //传入j需要再调用j.first遍历，可直接传入j.first
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
		System.out.println(j.first.id); //和约瑟夫一样，最后一个节点为迷
		j.printCircle(j.first); 
	}
}
