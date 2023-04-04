
public class Suv extends Car {
	int seat;
	public Suv() {
		this.seat = 2;
	}

	public static void main(String[] args) {
		Suv s1 = new Suv();
		s1.company="Benz";
		s1.mile=1234;
		s1.PrnCar();
		System.out.println(s1.seat);
	}
}
