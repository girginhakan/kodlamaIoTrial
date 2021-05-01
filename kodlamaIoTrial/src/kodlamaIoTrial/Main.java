package kodlamaIoTrial;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Hakan","Girgin","12345678901","BS2 9QN","hakan@hakan.com","123456","Mr.");
		
		Student student1= new Student();
		student1.setId(2);
		student1.setFirstName("Burak");
		student1.setLastName("Koca");
		student1.setNationalIdentity("12343124515");
		student1.setAdress("Ankara");
		student1.setEmail("burak@burak.com");
		student1.setPassword(null);
		student1.setTitle("Mr.");
		student1.setTakeLessons("Matematik");
		student1.setEducationStatus("Lisans");
		student1.setPassword("1234");
		student1.setStudentNumber("06");
		student1.setSupervizor("Gülsen Koca");
		
		
		Instructor instructor1=new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setNationalIdentity("098765432109");
		instructor1.setAdress("İstanbul");
		instructor1.setPassword("54321");
		instructor1.setEmail("engin@engin.com");
		instructor1.setTitle("Mr. ");
		instructor1.setGaveLessons("Java");
		instructor1.setExperianceYear("20");
		instructor1.setExpertiseArea("Yazılım");
		


		User[] users = {
				user1,
				student1,
				instructor1
		};
		UserManager userManager =new UserManager();
		userManager.add(user1);
		
		StudentManager studentManager =new StudentManager();
		studentManager.registerCourse(student1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(instructor1);
	}

}
