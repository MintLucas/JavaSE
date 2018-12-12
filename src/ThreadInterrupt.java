import java.util.*;  //join方法（二合一），yield（每到10高风亮节退让一小会）方法和setPriority方法


public class ThreadInterrupt {
	public static void main(String[] args) {
		MyThread test = new MyThread();
		test.start();
		try {
			Thread.sleep(10000);          //sleep为静态方法，调用线程休息10秒，子线程仍然执行
		}catch(InterruptedException e) {}
		test.flag = false;
		//test.interrupt();                 //打断子线程，泼水，Stop直接永久停止
	}
}

class MyThread extends Thread{
	boolean flag = true;
	
	public void run() {
		//boolean flag = true;   不能写这里
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