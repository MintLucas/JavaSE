import java.io.*;

public class InputOutput {
	public static void main(String[] args) {
		int c =0;
		FileReader fis = null;  //不能直接写fis=new不然找不到fis,FileInputStram读字节流,改为FileReader即可读字符流
		FileWriter fos = null;
		BufferedWriter test = null;
		try{
			fis = new FileReader("d:/java/Pro01/src/FlieTest.java");		//一个管道咣当怼上去
			fos = new FileWriter("d:/java/Pro01/src/FlieTest01.java");
			long num =0;
			
			while((c=fis.read()) != -1) {
				System.out.print((char)c);
				num++;
				fos.write(c);
			}
			test = new BufferedWriter(new FileWriter("d:/java/Pro01/src/UniCode.test"));  //缓冲区读取

			for(int i=0; i<10; i++) {
				String s = String.valueOf(Math.random());
				test.write(s);
				test.newLine();
				
			}
			test.flush();        //缓冲区全部写入先
			test.close();
			fis.close();
			fos.close();
			System.out.println("共读取了" + num + "个字符");
			System.out.println("文件已复制到同一目录");
		}catch(FileNotFoundException e) {
			System.out.println("找不到指定文件");
			System.exit(-1);
		}catch(IOException e) {
			System.out.println("文件读取错误");	
			System.exit(-1);
		}
	}
}
