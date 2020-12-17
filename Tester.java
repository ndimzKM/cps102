public class Tester extends Test{
	public static void main(String[] args) {
		Another y = new Another();
		y.x = 10;
		y.test(23);
		System.out.println(y.x);
	}

	
}

