class Person{
	private String name;
	private String location;
	
	Person(String name){
		this.name = name;
		location = "Beijing";
	}
	
	Person(String name,String location){  //传入一个参时另一个参数默认为Beijing；
		this.name = name;
		this.location = location;
	}
	
	public String info() {
		return
				"name: " + name+
				" location: " + location;
	}
}

class Student extends Person{
	private String school;
	
	Student(String name,String school){
		this(name,"Beijing",school);         //利用下面的重载构造函数，上面Person传一个参也可以this.person(name,Beijing);
	}
	
	Student(String n,String l,String school){
		super(n,l);
		this.school=school;
	}
	
	public String info() {
		return
				super.info() + " school: " + school;
	}
}

public class PersonStudent {
	public static void main(String args[]) {
		Person p1 = new Person("Cynthy");
		Person p2 = new Person("Lucas","Suzhou");
		Student s1 = new Student("Selina","Duiwai Jingmao University");
		Student s2 = new Student("Ann","Shanghai","BeiWai University");
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}
}
