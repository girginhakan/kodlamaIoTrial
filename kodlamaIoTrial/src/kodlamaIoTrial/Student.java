package kodlamaIoTrial;

public class Student extends User {
	private String takeLessons;
	private String studentNumber;
	private String educationStatus;
	private String supervizor;
	
	public Student() {
		
	}
	
	
	
	public Student(String takeLessons, String studentNumber, String educationStatus, String supervizor) {
		super();
		this.takeLessons = takeLessons;
		this.studentNumber = studentNumber;
		this.educationStatus = educationStatus;
		this.supervizor = supervizor;
	}



	public String getTakeLessons() {
		return takeLessons;
	}
	public void setTakeLessons(String takeLessons) {
		this.takeLessons = takeLessons;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getEducationStatus() {
		return educationStatus;
	}
	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}
	public String getSupervizor() {
		return supervizor;
	}
	public void setSupervizor(String supervizor) {
		this.supervizor = supervizor;
	}
	
}
