public class Student extends Person{
	String number;
	public Student() {
		
	}
	void Prn(Person p1) {
		System.out.println(p1.name+" : "+p1.age + " : " +number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name="song";
		s1.age=20;
		s1.number="20221234";
		
		s1.Prn(s1);
	}

}
