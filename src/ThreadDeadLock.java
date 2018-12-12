
public class ThreadDeadLock implements Runnable{   //implements Runnable少写
	
	static Object o1 = new Object();
	static Object o2 = new Object();   //这两个OBJ必须是静态的，不然不会死锁 ERROR
	int flag = 1;
	
	
	public static void main(String[] args) {
		
		
		ThreadDeadLock td1 = new ThreadDeadLock();
		ThreadDeadLock td2 = new ThreadDeadLock();
		td1.flag = 1;
		td2.flag = 2;
		Thread tt1 = new Thread(td1);
		Thread tt2 = new Thread(td2);
		tt1.start();tt2.start();
	}
	
	public void run() {
		
		System.out.println("开始测试flag" + flag);
		if(flag==1) {
			synchronized(o1) {
				try {
					Thread.sleep(500);
				}catch(Exception e) {e.printStackTrace();}
			synchronized(o2) {
				System.out.println("解除死锁" + flag);
			}
			}
		}
		
		
		if(flag==2) {
			synchronized(o2) {
				try {
					Thread.sleep(500);
				}catch(Exception e) {e.printStackTrace();}
			synchronized(o1) {
				System.out.println("解除死锁" + flag);
			}
			}
		
	}
}

}