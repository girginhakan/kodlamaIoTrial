package kodlamaIoTrial;

public class User {
	int id;
	private String nationalIdentity;
	private String adress;
	private String email;
	private String password;
	private String title;

	public User() {

	}

	public User(int id, String nationalIdentity, String adress, String email,
			String password, String title) {
		super();
		this.id = id;
		
		this.nationalIdentity = nationalIdentity;
		this.adress = adress;
		this.email = email;
		this.password = password;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
