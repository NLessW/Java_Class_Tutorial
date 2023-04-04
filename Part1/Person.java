
public class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	void Prn(Person p1) {
		System.out.println(p1.name+" : "+p1.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("Park",30);
		p1.age = 10;
		p1.name = "Kim";
		
		p2.age = 20;
		p2.name = "Lee";
		
		/*System.out.println(p1.name+" : "+p1.age);
		System.out.println(p2.name+" : "+p2.age);
		System.out.println(p3.name+" : "+p3.age);*/
		p1.Prn(p1);
		p2.Prn(p2);
		p3.Prn(p3);
		
	
	}
	
	class A{
		
	}
	class B{
		
	}

}
