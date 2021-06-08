package people;

public class English extends people implements eat {

	public English() {
		
	}
	
	public English(int age,String name) {
		super(age,name);
	}
	public void eat() {
		System.out.print("英国人吃牛排");
	}
	
	public void drink() {
		System.out.print("爱喝葡萄酒");
	}
	
}
