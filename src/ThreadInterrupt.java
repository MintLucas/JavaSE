import java.util.*;  //join����������һ����yield��ÿ��10�߷���������һС�ᣩ������setPriority����


public class ThreadInterrupt {
	public static void main(String[] args) {
		MyThread test = new MyThread();
		test.start();
		try {
			Thread.sleep(10000);          //sleepΪ��̬�����������߳���Ϣ10�룬���߳���Ȼִ��
		}catch(InterruptedException e) {}
		test.flag = false;
		//test.interrupt();                 //������̣߳���ˮ��Stopֱ������ֹͣ
	}
}

class MyThread extends Thread{
	boolean flag = true;
	
	public void run() {
		//boolean flag = true;   ����д����
		while(flag) {
			System.out.println("===" + new Date() + "===");
			try {
				sleep(1000);
		
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}