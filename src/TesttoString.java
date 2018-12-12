class Cat{               //�ȼ���class Cat extends Object
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
	

	
public String toString() {             //��дtoString,����дֱ�Ӵ�ӡ����ʱ����Ψһ��ʶ�Ĺ�ϣ��
		return "I am a Cat!";
	}
	                                          //��̬����̬�󶨣���������1.Ҫ�м̳�
public boolean equals(Object obj) {          //2.��������ÿ���ָ������Ķ���
	if(obj == null) return false;            //3.��д����          ִ���ڼ��жϡ�ʵ�ʶ������͡������ǡ��������͡���������д������������CODE��ִ��ʱ����ָ��
	else {
		if(obj instanceof Cat) {
			Cat temp = (Cat) obj;            //��ʵ��ֻ�����˻��࣬���ܷ������������ӵĳ�Ա�����Ժͷ�������ɫָ�룬����Ҫ����ת�ͣ�casting��
			                                  //ת�ͺ������˿���չ�ԣ�è���̳ж����������Ȼ��ǿ��ת���ɡ�è���������޸ķ��� ����ëɫ����Ϣ
			if(temp.color == this.color && temp.weight == this.weight && temp.height == this.height)
				return true;
			
		}
	}
	return false;
}
}


public class TesttoString {
	public static void main(String args[]) {
		Object c1 = new Cat();		       //����дΪCat c1���˴�Ϊ���������ָ������Ķ�����ߴ������ã��ұߴ������󣬴����������÷���ʵ�ֶ�̬
							//�ӿ�Ϊ����ĳ����ࣨ����̳У���д�Ҳ���ʵ������������������Ĭ��Ϊpublic static final��������д�̳У�������Ĭ��public
											//�ӿں�����ʵ���ࣨ���ࣩ֮�䣬���ڶ�̬�ԣ�������C++�ж��ؼ̳ж����������������ì��
											//implements�˽ӿڼ�ʵ�ֽӿ�������ķ���(compareable)���ӿڿɼ̳У���ֻ��ʵ�ֽӿ�
		System.out.println("Cat = " + c1.toString());  //Test toString������дֱ�Ӵ�ӡ����  c1  ʱ  ����Ψһ��ʶ�Ĺ�ϣ��
		
		Cat c2 = new Cat(1, 2, 3);
		Cat c3 = new Cat(1, 2, 3);
		System.out.println(c2 == c3);
		System.out.println(c2.equals(c3));         //������дequals�Ƚϵ�Ҳ��ָ��ָ��Ķ���
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1.equals(s2));         //String�����Ѿ���д�˴�Object�̳еĺ���equals
		
	}
}
