
public class ThreadPrintf {
	public static void main(String[] args) {
		Runner r = new Runner(); 	  //��runner��extends thread��˴�����Newֱ��дr.start()
		Thread t1 = new Thread(r);       //thread���췽������runnable�༴�ɣ���������ָ���������ʵ�ֽӿڷ�����������󣬲���д�˷�����
		Thread t2 = new Thread(r);
		t2.setPriority(Thread.NORM_PRIORITY + 3);  //һ��ʮ����
		t2.start();
		t1.start();
		for(int i=1; i<50; i++)
			System.out.println("Main Thread:-----" + i);
	}

}

class Runner implements Runnable{    //ʵ����runnable����Ϊ���߳��࣬Ҳ����extends�߳�
	public void run() {
		for(int i=1; i<50; i++)
			System.out.println(i + " ");
	}
}