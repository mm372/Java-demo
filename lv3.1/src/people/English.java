package people;

public class English extends people implements eat {

	public English() {
		
	}
	
	public English(int age,String name) {
		super(age,name);
	}
	public void eat() {
		System.out.print("Ó¢¹úÈË³ÔÅ£ÅÅ");
	}
	
	public void drink() {
		System.out.print("°®ºÈÆÏÌÑ¾Æ");
	}
	
}
