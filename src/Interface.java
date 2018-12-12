interface Singer{
	void sing();
}

interface Painter{
	void paint();
}

class Students implements Singer{                 //不知道在哪定义了student产生冲突
	private String name;
	Students(String name){
		this.name = name;
	}
	
	public void sing() {                            //重写接口方法要加public，子类访问权限不能低于父类
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
		s1.sing();                              //多态，实际引用哪个对象调哪个对象的sing方法
		
		Students ss = (Students) s1;               //父类引用（左）子类对象，转化为子类引用子类对象
		ss.study();                              //能看见所有方法了
		
		Painter p1 = (Painter) s2;              //Teacher实现了接口Painter，Singer所以可以由singer转化为painter来用
		p1.paint();                            
	}
}
