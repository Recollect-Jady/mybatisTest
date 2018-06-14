package mybatistest;

public class Student {
	private Integer snumber; // 当表中的数据行可能无限增长时，id列最好用Long
	private String name;
	private Gender gender; // 性别
	private Integer age;
	private String major; // 专业

	public Student() {
	}

	public Integer getNumber() {
		return snumber;
	}

	public void setNumber(Integer number) {
		this.snumber = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [number=" + snumber + ", name=" + name + ", gender=" + gender + ", age=" + age + ", major="
				+ major + "]";
	}
}
