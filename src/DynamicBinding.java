 class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void enjoy() {
		System.out.println("Animal murmur...");
	}
}

class Dog extends Animal{
	private String furColor;
	
	public Dog(String name, String furColor) {
		super(name);
		this.furColor = furColor;
	}
	
	public void enjoy() {
		System.out.println("Dog murmur...");
	}
}

class Lady{
	private String name;
	private Animal pet;
	
    Lady(String name , Animal pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void myPetEnjoy() {               //多态（动态绑定）三条件：1.要有继承
											//2.父类的引用可以指向子类的对象
											//3.重写方法          执行期间判断【实际对象类型】而不是【引用类型】来调用重写方法，方法在CODE区执行时更改指向
		pet.enjoy();                        //尽管pet为Animal类型，传进来Dog,调用方法时动态更改指向到实际对象的方法
	}
}


public class DynamicBinding {
	public static void main(String args[]) {
	Animal a1 = new Animal("Cat");
	Dog d1 = new Dog("Bigyello" , "yello");
	Lady l1 = new Lady("Selina" , d1);
	a1.enjoy();
	l1.myPetEnjoy();                  
	
	}
	

}
