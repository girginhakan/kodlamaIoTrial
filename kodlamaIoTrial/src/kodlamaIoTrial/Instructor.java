package kodlamaIoTrial;

public class Instructor extends User {
	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private String gaveLessons;
	private String instructorNumber;
	private String experianceYear;
	private String expertiseArea;
	
	public Instructor() {
		
	}
	
	
	public Instructor(int id, int userId, String firstName, String lastName, String gaveLessons,
			String instructorNumber, String experianceYear, String expertiseArea) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gaveLessons = gaveLessons;
		this.instructorNumber = instructorNumber;
		this.experianceYear = experianceYear;
		this.expertiseArea = expertiseArea;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGaveLessons() {
		return gaveLessons;
	}


	public void setGaveLessons(String gaveLessons) {
		this.gaveLessons = gaveLessons;
	}


	public String getInstructorNumber() {
		return instructorNumber;
	}


	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}


	public String getExperianceYear() {
		return experianceYear;
	}


	public void setExperianceYear(String experianceYear) {
		this.experianceYear = experianceYear;
	}


	public String getExpertiseArea() {
		return expertiseArea;
	}


	public void setExpertiseArea(String expertiseArea) {
		this.expertiseArea = expertiseArea;
	}


	
}
