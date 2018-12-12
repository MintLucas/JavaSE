
public class ThrowableException {
	public static void main(String args[]) {
		
		try {
			ThrowableException test = new ThrowableException();
			test.m(0);
			System.out.println(2/0);
		} catch (ArithmeticException ae) {                 //捕获某种异常自行处理，属于Exception下的RuntimeException不用捕获
			System.out.println("系统正在维护");
			ae.printStackTrace();                          //打印所有   删除一下对比
		}
	}
	
	void  m(int i) throws ArithmeticException{            //m可能出现某种异常，且调用时必须catch或再抛出，虚拟机默认处理e.printStacktrace
		if (i == 0)
			throw new ArithmeticException("被除数为0");      //构造并抛出异常对象,
	}          //message - the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
}
