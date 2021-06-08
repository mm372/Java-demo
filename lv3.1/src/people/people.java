package people;

public abstract class people {

	private int age;
	private String name;
	
	public people() {
		
	}
	
	public people(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.print(name+"½ñÄê"+age+"ËêÊÇ");
	}
	public abstract void drink();
}
