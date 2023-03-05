package java8;
//Lambda Expression
public class Lambda {
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
