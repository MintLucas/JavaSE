class Employee{
	private int value;
	
	/*Employee(){
		System.out.println("Employee-value=" + value);	
	}*/
	
	Employee(int value){
		this.value = value;
		System.out.println("Employee--value=" + value);
	}
}

class Manager extends Employee{
	private int value;
	
	Manager(){
		super(200);       //��û��super��ʼ�����࣬����Ҹ���Ĭ�ϳ�ʼ������
		System.out.println("Manager-value=" + value);	
	}
	
	Manager(int _value){
		value = _value;
		System.out.println("Manager--value=" + value);
	
	}
}


public class TestSuperSub {
	public static void main(String args[]) {
		Manager Lucas = new Manager();
		System.out.println(super.value);
	}
}

