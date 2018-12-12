class Cat{               //等价于class Cat extends Object
	int color;
	int height;
	int weight;
	
	public Cat() {
		
	}
	
	public Cat(int color, int height, int weight){
		this.color = color;
		this.height = height;
		this.weight = weight;	
	}
	

	
public String toString() {             //重写toString,不重写直接打印引用时返回唯一标识的哈希码
		return "I am a Cat!";
	}
	                                          //多态（动态绑定）三条件：1.要有继承
public boolean equals(Object obj) {          //2.父类的引用可以指向子类的对象
	if(obj == null) return false;            //3.重写方法          执行期间判断【实际对象类型】而不是【引用类型】来调用重写方法，方法在CODE区执行时更改指向
	else {
		if(obj instanceof Cat) {
			Cat temp = (Cat) obj;            //但实际只看到了基类，不能访问子类新增加的成员（属性和方法）棕色指针，所以要对象转型（casting）
			                                  //转型后增加了可扩展性，猫狗继承动物，传入名字然后强制转换成“猫狗”，再修改访问 返回毛色等信息
			if(temp.color == this.color && temp.weight == this.weight && temp.height == this.height)
				return true;
			
		}
	}
	return false;
}
}


public class TesttoString {
	public static void main(String args[]) {
		Object c1 = new Cat();		       //可以写为Cat c1，此处为父类的引用指向子类的对象，左边创建引用，右边创建对象，创建父类引用方便实现多态
							//接口为特殊的抽象类（必须继承，重写且不能实例化），声明的属性默认为public static final（不能重写继承），方法默认public
											//接口和他的实现类（子类）之间，存在多态性，避免了C++中多重继承多个父类变量重名间的矛盾
											//implements了接口即实现接口所定义的方法(compareable)，接口可继承，类只能实现接口
		System.out.println("Cat = " + c1.toString());  //Test toString，不重写直接打印引用  c1  时  返回唯一标识的哈希码
		
		Cat c2 = new Cat(1, 2, 3);
		Cat c3 = new Cat(1, 2, 3);
		System.out.println(c2 == c3);
		System.out.println(c2.equals(c3));         //若不重写equals比较的也是指针指向的对象
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1.equals(s2));         //String类里已经重写了从Object继承的函数equals
		
	}
}
