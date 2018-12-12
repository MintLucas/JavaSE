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
	Collection c = new HashSet();      //此处写Collection的好处是可以更改后面new的对象，此处想用排序HashSet改写为数组即可
	c.add(new Name("卢", "Lucas"));
	c.add(new Name("张", "子旭"));
	c.add(new Name("阿尔", "达克"));
	
	for(Iterator i=c.iterator(); i.hasNext(); ) {
		Name n = (Name) i.next();
		System.out.println(n.getFirstName());
		if(n.getFirstName().length()<2) {
			i.remove();
		}
	}
	System.out.println(c);   //此处C仍是Collection对象，怎么转化的问题
	
	Set s2 = new HashSet();   //Collection下有SET和LIST和MAP
	s2.addAll(c);            //map类喂putAll，MAP存一双值（key+value）
	s2.add("testSetAddAll");
	System.out.println(s2);
	
	List<String> l1 = new LinkedList<String>();
	for(int i=0; i<5;i++)
		l1.add("a" + i);   //字符a打印出ASCII码，字符串原样打印
	l1.add(2,"testListSort");
	l1.set(3, "b2");
	System.out.println(l1.get(2));   //get获得Object对象，用泛型后不用再强制转换
	
	/*ArrayList d = (ArrayList)c;
	Collections.sort(d);  //set集合无顺序，只能对list排序      */
	
	Collections.shuffle(l1);
	System.out.println(l1);
	Collections.shuffle(l1);
	System.out.println(l1);
	
	Map m1 = new HashMap();
	m1.put("one", 1);
	m1.put("a", "A");
	int i = (Integer) m1.get("one");     //1自动打包，get返回object类要转换成Integer后自动解包
	System.out.println(i);
	
	}
}
