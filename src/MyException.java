class MineException extends Exception{
	private int id;                                     //��д��Int

	MineException(String message, int id){
		super(message);
		this.id = id;
	}
	
	public int getId() {                           //��д�˺�������ֵ
	return id;
	}
}

public class MyException {
	public void regist(int num) throws MineException{
		if(num < 0) {
			throw new MineException("����Ϊ��",0x00003);         //�޸ĳ������Message����catch����ͻ
		}
		System.out.println("�Ǽ�����wei" + num);                //ִ����������ڷ�����������쳣��һ�䲻ִ��
	}
	

	public void manager() {
		try {
			regist(-2);
		} catch (MineException me) {
			System.out.println("�Ǽ�ʧ�ܣ�����������=" + me.getId());
			me.printStackTrace();
		}
		System.out.println("��������");
	}
	
	public static void main(String args[]) {
		MyException test = new MyException();
		test.manager();
	}
}
