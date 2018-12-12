import java.io.*;

public class FlieTest {
	public static void main(String[] args) {
		String separator =File.separator;
		String filename = "myfile.text";
		String directory = "mydir1" + separator + "mydir2";
		File f = new File(directory, filename);
		if(f.exists()) {
			System.out.println("文件名:" + f.getAbsolutePath());
			System.out.println("文件大小:" + f.length());
		} else {
			f.getParentFile().mkdirs();  //Creates the directory 参照getParentFile的路径
			try {
				f.createNewFile();           //当前路径下创建文件呢
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		File ff = new File("G:/迅雷下载");
		System.out.println(ff.getName());
		tree(ff, 1);
		
		
	}
	
	private static void tree(File ff, int level) {

		String preStr = "";
		
		for(int i=0; i<level; i++) {
			preStr = preStr + "    ";
		}
		
		File[] childs = ff.listFiles();
		
		for(int i=0; i<childs.length; i++) {    //小于数组长度
			System.out.println(preStr + childs[i].getName());          //定义一个空字符串，level循环层次，每次空level*空格
			if(childs[i].isDirectory()) {
				tree(childs[i], level + 1);
			}
	
		}
	}
}