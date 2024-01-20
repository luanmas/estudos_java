package entities;

public class Alumn {
	public String name;
	public double first_note;
	public double second_note;
	public double third_note;
	
	public double final_grade () {
		return this.first_note + this.second_note + this.third_note;
	}
	
	public String isPassed () {
		if(this.final_grade() >= 60.0) {
			return "PASS"; 
		} else {
			double missingPoints = 60.0 -  this.final_grade();
			return "FAILED \n" + "MISSING " + missingPoints + " POINTS";
		}
	}
}
