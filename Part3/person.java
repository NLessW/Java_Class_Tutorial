
public class person {
	String name;
	car drivingCar;
	Boolean mode; 	// true : drive, false : stop
	
	public person(String name) {
		this.name = name;
		this.drivingCar = null;
		
	}
	
	public void prnperson() {
		if (this.drivingCar == null)
				System.out.println(this.name + "  has no car");
		else
			System.out.println(this.name + " is driving " +  this.drivingCar.name);
	}
	public void setdrivingCar(car c) {
		if(c.mode == false) {
			this.drivingCar = c;
		}else
			System.out.print("It's impossible, stop the car.");
	}
	public static void main(String[] args) {
		
		car c1 = new car("람보르기니 아벤타도르","Black");
		car c2 = new car("SUV","White");
		person father = new person("아빠");
		father.prnperson();
		father.setdrivingCar(c1);
		father.drivingCar.setdriver(father.name);
		father.drivingCar.startCar();
		father.prnperson();
		father.drivingCar.prncar();
		father.drivingCar.stopCar();
		father.drivingCar.prncar();
		
		person mother = new person("엄마");
		mother.prnperson();
		mother.setdrivingCar(c2);
		c2.setdriver(mother.name);
		c2.startCar();
		c2.prncar();
		c2.stopCar();
		c2.prncar();
		try {
			person son = new person("아들");
			son.prnperson();
			son.setdrivingCar(c2);
			son.drivingCar.setdriver(son.name);
			c2.startCar();
			c2.prncar();
			c2.stopCar();
			c2.prncar();
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}
