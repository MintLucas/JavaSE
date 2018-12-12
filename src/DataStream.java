import java.io.*;

public class DataStream {  //Ϊ�˽��д��ȥһ���ܳ���С����ת�����ַ���д��̫�鷳
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();  //�ڴ����Զ������ֽ����飬�ҹ��ӽ���
		DataOutputStream dos = new DataOutputStream(bos); //����������ܵ��ĺô��ǿ���ֱ������������ݣ�һ����8���ֽ�
		
		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bas = new ByteArrayInputStream(bos.toByteArray()); //ͨ������ʱ�Ĺܵ����������ҵ��ڴ����ֽ����������
			DataInputStream dis = new DataInputStream(bas);
			System.out.println(bas.available());          //����Ĺܵ�����������
			//System.out.println(dis.readInt());
			System.out.println(dis.readDouble());         //д��ʲô��ʲô����
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
		S container = (S)ois.readObject();             //д���ļ��ٶ���
		System.out.println(container.temp);   
		ois.close();
	}
	
	
}

class S implements Serializable{   //ERROR:implements �����л�
	String temp = "Lucas";
	int j = 20;
}