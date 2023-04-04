
public class car {
	String name;
	String color;
	String driver;
	boolean mode;
	public car(String name, String color) {
		this.name = name;
		this.color = color;
		this.mode = false;
	}
	public void prncar(){
		if(this.mode == true) {
			System.out.println("C::: "+this.name + " is driving.");
			System.out.println("C::: "+this.name + " : " + this.color + " : " + this.driver);	
		}else {
			System.out.println("C::: "+this.name + " is not driving.");
		}
		
	}
	public void startCar() {
		this.mode = true;
	}
	public void stopCar() {
		this.mode = false;
	}
	public void setdriver(String name) {
		this.driver = name;
	}

}
