interface Singer{
	void sing();
}

interface Painter{
	void paint();
}

class Students implements Singer{                 //��֪�����Ķ�����student������ͻ
	private String name;
	Students(String name){
		this.name = name;
	}
	
	public void sing() {                            //��д�ӿڷ���Ҫ��public���������Ȩ�޲��ܵ��ڸ���
		System.out.println("student is singing");
	}
	
	void study() {
		System.out.println("student is studying");
	}
}


class Teacher implements Singer,Painter{
	private String name;

	Teacher(String name){
		this.name = name;
	}
	
	public void sing() {
		System.out.println("Teacher is singing");
	}
	
	public void paint() {
		System.out.println("Teacher is painting");
	}
	
	
}

public class Interface {
	public static void main(String args[]) {
		Singer s1 = new Students("Lucas");
		Singer s2 = new Teacher("Cynthy");
		s1.sing();                              //��̬��ʵ�������ĸ�������ĸ������sing����
		
		Students ss = (Students) s1;               //�������ã����������ת��Ϊ���������������
		ss.study();                              //�ܿ������з�����
		
		Painter p1 = (Painter) s2;              //Teacherʵ���˽ӿ�Painter��Singer���Կ�����singerת��Ϊpainter����
		p1.paint();                            
	}
}
