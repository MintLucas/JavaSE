import java.io.*;

public class InputOutput {
	public static void main(String[] args) {
		int c =0;
		FileReader fis = null;  //����ֱ��дfis=new��Ȼ�Ҳ���fis,FileInputStram���ֽ���,��ΪFileReader���ɶ��ַ���
		FileWriter fos = null;
		BufferedWriter test = null;
		try{
			fis = new FileReader("d:/java/Pro01/src/FlieTest.java");		//һ���ܵ��۵����ȥ
			fos = new FileWriter("d:/java/Pro01/src/FlieTest01.java");
			long num =0;
			
			while((c=fis.read()) != -1) {
				System.out.print((char)c);
				num++;
				fos.write(c);
			}
			test = new BufferedWriter(new FileWriter("d:/java/Pro01/src/UniCode.test"));  //��������ȡ

			for(int i=0; i<10; i++) {
				String s = String.valueOf(Math.random());
				test.write(s);
				test.newLine();
				
			}
			test.flush();        //������ȫ��д����
			test.close();
			fis.close();
			fos.close();
			System.out.println("����ȡ��" + num + "���ַ�");
			System.out.println("�ļ��Ѹ��Ƶ�ͬһĿ¼");
		}catch(FileNotFoundException e) {
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}catch(IOException e) {
			System.out.println("�ļ���ȡ����");	
			System.exit(-1);
		}
	}
}
