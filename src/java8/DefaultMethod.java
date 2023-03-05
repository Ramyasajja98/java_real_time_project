package java8;
interface Interf{
	default void message() {
		System.out.println("Default method");
	}
}
public class DefaultMethod implements Interf{
	public void message() {
		System.out.println("Overriding default method");
	}
	public static void main(String[] args) {
		DefaultMethod method = new DefaultMethod();
		method.message();
	}

}
