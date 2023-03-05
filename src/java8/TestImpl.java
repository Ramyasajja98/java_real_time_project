package java8;

public class TestImpl implements Test {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		
		TestImpl test = new TestImpl();
		test.message();
	}

}
