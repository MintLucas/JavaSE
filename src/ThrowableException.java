
public class ThrowableException {
	public static void main(String args[]) {
		
		try {
			ThrowableException test = new ThrowableException();
			test.m(0);
			System.out.println(2/0);
		} catch (ArithmeticException ae) {                 //����ĳ���쳣���д�������Exception�µ�RuntimeException���ò���
			System.out.println("ϵͳ����ά��");
			ae.printStackTrace();                          //��ӡ����   ɾ��һ�¶Ա�
		}
	}
	
	void  m(int i) throws ArithmeticException{            //m���ܳ���ĳ���쳣���ҵ���ʱ����catch�����׳��������Ĭ�ϴ���e.printStacktrace
		if (i == 0)
			throw new ArithmeticException("������Ϊ0");      //���첢�׳��쳣����,
	}          //message - the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
}
