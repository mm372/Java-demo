package people;

public class Chinese extends people implements eat{

	public Chinese() {
		
	}
	
	public Chinese(int age,String name) {
		super(age,name);
	}
	
	public void drink() {
		System.out.print("中国人吃皮蛋");
	}
	
	public void eat() {
		System.out.print("爱喝茅台");
	}
}
