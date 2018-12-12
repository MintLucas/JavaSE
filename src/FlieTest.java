import java.io.*;

public class FlieTest {
	public static void main(String[] args) {
		String separator =File.separator;
		String filename = "myfile.text";
		String directory = "mydir1" + separator + "mydir2";
		File f = new File(directory, filename);
		if(f.exists()) {
			System.out.println("�ļ���:" + f.getAbsolutePath());
			System.out.println("�ļ���С:" + f.length());
		} else {
			f.getParentFile().mkdirs();  //Creates the directory ����getParentFile��·��
			try {
				f.createNewFile();           //��ǰ·���´����ļ���
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		File ff = new File("G:/Ѹ������");
		System.out.println(ff.getName());
		tree(ff, 1);
		
		
	}
	
	private static void tree(File ff, int level) {

		String preStr = "";
		
		for(int i=0; i<level; i++) {
			preStr = preStr + "    ";
		}
		
		File[] childs = ff.listFiles();
		
		for(int i=0; i<childs.length; i++) {    //С�����鳤��
			System.out.println(preStr + childs[i].getName());          //����һ�����ַ�����levelѭ����Σ�ÿ�ο�level*�ո�
			if(childs[i].isDirectory()) {
				tree(childs[i], level + 1);
			}
	
		}
	}
}