package Person;

public abstract class Person {
	protected String firstName;
	protected String familyName;
	protected int yearsOfService;
	private int count = 0; //+ getter & setter for the counter
	
	public Person(){
		count++; 
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFamilyName(){
		return familyName;
	}
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	
	public int getYearsOfService(){
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService){
		this.yearsOfService = yearsOfService;
		// set if statement to check whether the implemented years of service are not < 0)
	}
	
	public abstract void checkHomework();
	
}
