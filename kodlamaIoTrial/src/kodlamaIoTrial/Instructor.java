package kodlamaIoTrial;

public class Instructor extends User {
	private String gaveLessons;
	private String instructorNumber;
	private String experianceYear;
	private String expertiseArea;
	
	public Instructor() {
		
	}
	
	
	public Instructor(String gaveLessons, String instructorNumber, String experianceYear, String expertiseArea) {
		super();
		this.gaveLessons = gaveLessons;
		this.instructorNumber = instructorNumber;
		this.experianceYear = experianceYear;
		this.expertiseArea = expertiseArea;
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
