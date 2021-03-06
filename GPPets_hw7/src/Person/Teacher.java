package Person;

public class Teacher extends Person{
	private String subject;
	
	public Teacher(){
		super();
		setFirstName("");
		setFamilyName("");
		setYearsOfService(0);
		setSubject("");
	}
	
	public Teacher(String firstName, String familyName, int yearsOfService, String Subject){
		setFirstName(firstName);
		setFamilyName(familyName);
		setYearsOfService(yearsOfService);
		setSubject(subject);
	}
	
	public String getSubject(){
		return subject;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}

	@Override 
	public void checkHomework(){
		System.out.println("Mr/Mrs" + familyName + " is checking the homeworks of the students now.");
	}
	
	public void sayGoodMorning(){
		System.out.println("Good morning, students!");
	}
	
	public void sayGoodbye(){
		System.out.println("Goodbye! See you next time!");
	}
}
