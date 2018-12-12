
public class ThreadPrintf {
	public static void main(String[] args) {
		Runner r = new Runner(); 	  //若runner类extends thread则此处不用New直接写r.start()
		Thread t1 = new Thread(r);       //thread构造方法传进runnable类即可，父类引用指向子类对象（实现接口方法的子类对象，并重写了方法）
		Thread t2 = new Thread(r);
		t2.setPriority(Thread.NORM_PRIORITY + 3);  //一到十级别
		t2.start();
		t1.start();
		for(int i=1; i<50; i++)
			System.out.println("Main Thread:-----" + i);
	}

}

class Runner implements Runnable{    //实现了runnable便认为是线程类，也可以extends线程
	public void run() {
		for(int i=1; i<50; i++)
			System.out.println(i + " ");
	}
}