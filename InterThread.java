class Q {
	int num;
	public void put(int num) {
		System.out.println("Put : " + num);
		this.num = num;
	}
	
	public void get() {
		System.out.println("Get : "+num);
	}
}
class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Prouducer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	public void run() {
		
		while(true) {
			q.get();
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
	}
}
public class InterThread {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}