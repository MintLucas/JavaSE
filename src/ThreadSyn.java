
public class ThreadSyn implements Runnable{   //implements Runnable少写
	Timer timer = new Timer();
	
	
	public static void main(String[] args) {
		ThreadSyn test = new ThreadSyn();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("t1");t2.setName("t2");
		t1.start();t2.start();
		
	}
	
	public void run() {
		timer.add(Thread.currentThread().getName());
}

class Timer{
	private int num=0;
		
	public void add(String name) {
		synchronized(this) {      //锁定当前对象，上锁使其变为原子操作，或public synchronized void add
		num++;
		try {
			Thread.sleep(1);         //ThreadSyn类线程含有对象Timer，run里面都用的同一个timer指向的Timer，num又是静态变量没有互斥访问
		}catch(InterruptedException e) {}
		System.out.println(name + ",你是第" + num + "个使用Timer的线程" );
		}
	}
}
}