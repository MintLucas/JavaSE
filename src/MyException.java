class MineException extends Exception{
	private int id;                                     //少写了Int

	MineException(String message, int id){
		super(message);
		this.id = id;
	}
	
	public int getId() {                           //少写了函数返回值
	return id;
	}
}

public class MyException {
	public void regist(int num) throws MineException{
		if(num < 0) {
			throw new MineException("人数为负",0x00003);         //修改出错保存的Message，和catch不冲突
		}
		System.out.println("登记人数wei" + num);                //执行语句必须放在方法里，若出现异常这一句不执行
	}
	

	public void manager() {
		try {
			regist(-2);
		} catch (MineException me) {
			System.out.println("登记失败，出错类型码=" + me.getId());
			me.printStackTrace();
		}
		System.out.println("操作结束");
	}
	
	public static void main(String args[]) {
		MyException test = new MyException();
		test.manager();
	}
}
