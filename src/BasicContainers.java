import java.util.*;

class Name{
	String firstName;
	String secondName;
	
	Name(String firstName, String secondName){
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	String getFirstName() {
		return this.firstName;
	}
}

public class BasicContainers {
	public static void main(String[] args) {
	Collection c = new HashSet();      //�˴�дCollection�ĺô��ǿ��Ը��ĺ���new�Ķ��󣬴˴���������HashSet��дΪ���鼴��
	c.add(new Name("¬", "Lucas"));
	c.add(new Name("��", "����"));
	c.add(new Name("����", "���"));
	
	for(Iterator i=c.iterator(); i.hasNext(); ) {
		Name n = (Name) i.next();
		System.out.println(n.getFirstName());
		if(n.getFirstName().length()<2) {
			i.remove();
		}
	}
	System.out.println(c);   //�˴�C����Collection������ôת��������
	
	Set s2 = new HashSet();   //Collection����SET��LIST��MAP
	s2.addAll(c);            //map��ιputAll��MAP��һ˫ֵ��key+value��
	s2.add("testSetAddAll");
	System.out.println(s2);
	
	List<String> l1 = new LinkedList<String>();
	for(int i=0; i<5;i++)
		l1.add("a" + i);   //�ַ�a��ӡ��ASCII�룬�ַ���ԭ����ӡ
	l1.add(2,"testListSort");
	l1.set(3, "b2");
	System.out.println(l1.get(2));   //get���Object�����÷��ͺ�����ǿ��ת��
	
	/*ArrayList d = (ArrayList)c;
	Collections.sort(d);  //set������˳��ֻ�ܶ�list����      */
	
	Collections.shuffle(l1);
	System.out.println(l1);
	Collections.shuffle(l1);
	System.out.println(l1);
	
	Map m1 = new HashMap();
	m1.put("one", 1);
	m1.put("a", "A");
	int i = (Integer) m1.get("one");     //1�Զ������get����object��Ҫת����Integer���Զ����
	System.out.println(i);
	
	}
}
