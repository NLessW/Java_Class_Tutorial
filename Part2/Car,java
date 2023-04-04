import java.util.Vector;

public class Car {
	String year;
	String company;
	int mile;
	
	public Car() {
		
	}
	public void PrnCar() {
		System.out.println("제조사 : " + this.company +"\n연식 : " + this.year+"\n주행거리 : "+this.mile);
		System.out.println("-------------------");
	}
	public Car(String company) {
		this.company = company;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Car> v1 = new Vector<Car>();
		Car c1 = new Car();
		Car c2 = new Car("KIA");
		Car c3 = new Car("Ferrari");
		
		c1.company="HyunDai";
		c1.year="2023년";
		c1.mile=0;
		
		//c2.company="HyunDai";
		c2.year="2022년";
		c2.mile=0;
		
		c3.year="2023년";
		c3.mile=0;
		c1.PrnCar();
		c2.PrnCar();
		c3.PrnCar();
		
		/*System.out.println("제조사 : " + c1.company +"\n연식 : " + c1.year+"\n주행거리 : "+c1.mile);
		System.out.println("--------------------------");
		System.out.println("제조사 : " + c2.company +"\n연식 : " + c2.year+"\n주행거리 : "+c2.mile);
		System.out.println("--------------------------");
		System.out.println("제조사 : " + c3.company +"\n연식 : " + c3.year+"\n주행거리 : "+c3.mile);
		System.out.println("--------------------------");*/
		
		Car CarArray[] = new Car[5];
		CarArray[0] = new Car("SAMSUNG");
		CarArray[1] = new Car("TOYOTA");
		CarArray[2] = c1;
		CarArray[3] = c2;
		CarArray[4] = c3;
		
		for(int i=0; i < CarArray.length; i++) {
			CarArray[i].PrnCar();
		}
		
		v1.add(c1);
		v1.add(c2);
		
	}

}
