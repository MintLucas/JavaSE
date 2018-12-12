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
	
	public void myPetEnjoy() {               //��̬����̬�󶨣���������1.Ҫ�м̳�
											//2.��������ÿ���ָ������Ķ���
											//3.��д����          ִ���ڼ��жϡ�ʵ�ʶ������͡������ǡ��������͡���������д������������CODE��ִ��ʱ����ָ��
		pet.enjoy();                        //����petΪAnimal���ͣ�������Dog,���÷���ʱ��̬����ָ��ʵ�ʶ���ķ���
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
