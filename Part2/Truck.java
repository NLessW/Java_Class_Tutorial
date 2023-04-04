
public class Truck extends Car {
	int load;
	public Truck() {
		
	}
	
	public Truck(String company) {
		super(company);
	}
	
	public void PrnCar() {
		System.out.print(this.company+":"+this.year+":"+this.mile+":");
	}
	
	public void prnTruck() {
		//PrnCar();
		System.out.println(this.load);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t1 = new Truck();
		t1.company = "SCANIA";
		t1.year = "2000년";
		t1.mile = 10000;
		t1.load = 100;
		
		t1.PrnCar();
		t1.prnTruck();
		
		//System.out.println("제조사 : " + t1.company +"\n연식 : " + t1.year+"\n주행거리 : "+t1.mile + "\n적재량 : "+t1.load);
	}

}
