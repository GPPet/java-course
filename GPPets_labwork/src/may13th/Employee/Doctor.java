package may13th.Employee;

public class Doctor extends Employee {
	protected int nightShift;
	protected int full24Shift;
	
	public Doctor(){
		super();
		this.nightShift = 0;
		this.full24Shift = 0;
	}
	
	public Doctor(String name, int hPerWeek, int weekSalary, int nightShift, int full24Shift){
		super(name, hPerWeek, weekSalary);
		
		setNightShift(nightShift);
		setFull24Shift(full24Shift);
	}
	
	public int getNightShift(){
		return this.nightShift;
	}
	
	public void setNightShift(int nightShift){
		this.nightShift = nightShift;
	}

	public int getFull24Shift(){
		return this.full24Shift;
	}
	
	public void setFull24Shift(int full24Shift){
		this.full24Shift = full24Shift;
	}
	
	public void addInfo(){
		System.out.println("Night shifts per month:\t" + nightShift + "\n24h shifts per month:\t" + full24Shift);
		System.out.println();
	
	}
	
}
