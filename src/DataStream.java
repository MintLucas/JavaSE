import java.io.*;

public class DataStream {  //为了解决写进去一个很长的小数，转换成字符串写入太麻烦
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();  //内存中自动创建字节数组，且管子接上
		DataOutputStream dos = new DataOutputStream(bos); //数据流输出管道的好处是可以直接输出各种数据，一次性8个字节
		
		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bas = new ByteArrayInputStream(bos.toByteArray()); //通过创建时的管道方法可以找到内存中字节数组的引用
			DataInputStream dis = new DataInputStream(bas);
			System.out.println(bas.available());          //最近的管道的数据总量
			//System.out.println(dis.readInt());
			System.out.println(dis.readDouble());         //写入什么读什么类型
			System.out.println(dis.readBoolean());
			dos.close();dis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		S s = new S();
		s.j = 110;
		FileOutputStream fos = new FileOutputStream("d:/java/test/Dog.java");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush(); oos.close();
		
		FileInputStream fis = new FileInputStream("d:/java/test/Dog.java");
		ObjectInputStream ois = new ObjectInputStream(fis);
		S container = (S)ois.readObject();             //写进文件再读出
		System.out.println(container.temp);   
		ois.close();
	}
	
	
}

class S implements Serializable{   //ERROR:implements 可序列化
	String temp = "Lucas";
	int j = 20;
}