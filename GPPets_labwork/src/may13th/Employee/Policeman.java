package may13th.Employee;

public class Policeman extends Employee {
	protected String rank;
	
	public Policeman(){
		super();	
		this.rank = "";
	}
	
	public Policeman(String name, int hPerWeek, int weekSalary, String rank){
		super(name, hPerWeek, weekSalary);
		
		setRank(rank);
	}
	
	public String getRank(){
		return rank;
	}
	
	public void setRank(String rank){
		this.rank = rank;
	}
	
	public void addRank(){
		System.out.println("Rank:\t" + rank);
		System.out.println();
	}
}
