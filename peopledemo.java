package people;

public class peopledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		people a = new Chinese();
		a.setName("小明");
		a.setAge(24);
		a.show();
		
		eat i = new Chinese();
		i.eat();
		a.drink();
		
		System.out.println();
		
		people b = new English();
		b.setName("乔治");
		b.setAge(36);
		b.show();
		
		eat j = new English();
		j.eat();
		b.drink();
	}

}
