
public class ThreadSyn implements Runnable{   //implements Runnable��д
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
		synchronized(this) {      //������ǰ��������ʹ���Ϊԭ�Ӳ�������public synchronized void add
		num++;
		try {
			Thread.sleep(1);         //ThreadSyn���̺߳��ж���Timer��run���涼�õ�ͬһ��timerָ���Timer��num���Ǿ�̬����û�л������
		}catch(InterruptedException e) {}
		System.out.println(name + ",���ǵ�" + num + "��ʹ��Timer���߳�" );
		}
	}
}
}