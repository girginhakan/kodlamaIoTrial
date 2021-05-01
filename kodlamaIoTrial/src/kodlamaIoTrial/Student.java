package kodlamaIoTrial;

public class Student extends User {
	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private String takeLessons;
	private String studentNumber;
	private String educationStatus;
	private String supervizor;
	
	public Student() {
		
	}
	

	public Student(int id, int userId, String firstName, String lastName, String takeLessons, String studentNumber,
			String educationStatus, String supervizor) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.takeLessons = takeLessons;
		this.studentNumber = studentNumber;
		this.educationStatus = educationStatus;
		this.supervizor = supervizor;
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
