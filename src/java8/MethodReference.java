package java8;
public class MethodReference {
	public static void method() {
		for(int i=0; i<10 ;i++) {
			System.out.println("Child Thread1");
			}
		}
	public static void main(String[] args) {
	Runnable r = MethodReference :: method;
	Thread t= new Thread(r);
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread1");
	}
}
}
