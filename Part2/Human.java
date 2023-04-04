
public class Human {
	String name;
	Car c1;
	public Human() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();
		h1.name="Your Name";
		h1.c1=new Car();
		h1.c1.company = "Lamborghini";
		h1.c1.year="2022년";
		
		Human h2 = new Human();
		h2.name="김김김";
		h2.c1=new Car();
		
		Car cc = new Car();
		cc.company="SAMSUNG";
		cc.year="2000";
		
		h2.c1=cc;
		
		Human h3 = new Human();
		h3.name="kim";
		Car cc2 = new Truck();
		cc2.company="Toyota";
		h3.c1=cc2;
		
		Truck t1 = (Truck)h3.c1;
		t1.load=2222;
		
	}

}
