package b_info;

public class PersonVO {
	
	private String name;
	private String id;
	private String tel;
	private String gender;
	private int age;
	private String home;
	private String ta;
	
	public PersonVO () {}
	public PersonVO(String name, String id, String tel, String gender, int age, String home, String ta) {
		super();
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.gender = gender;
		this.age = age;
		this.home = home;
		this.ta = ta;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", id=" + id + ", tel=" + tel + ", gender=" + gender + ", age=" + age
				+ ", home=" + home + ", ta=" + ta + "] \n";
	}
	
	
	
	
}
