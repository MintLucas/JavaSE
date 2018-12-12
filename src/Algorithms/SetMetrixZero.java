import java.util.Arrays;

public class SetMetrixZero {
	public static void main(String[] args) {
		int[][] matrix ={{0,1,2,0},
						{3,3,4,2},
						{1,3,1,5}};
		SetZero(matrix);
		for(int i=0; i<matrix.length; i++)
			System.out.println(Arrays.toString(matrix[i]));
	}
	
	static int[][] SetZero(int[][] matrix){	
		boolean row0 = false;
		boolean col0 = false;
		
		//先扫描第一行第一列，如果有0，则将各自的flag设置为true
		for(int i=0;i<matrix.length;i++) 
			if(matrix[i][0] == 0)
				col0 = true;
		for(int j=0;j<matrix[0].length;j++) 
			if(matrix[0][j] == 0)
				row0 = true;
		
		//然后扫描除去第一行第一列的整个数组，如果有0，则将对应的第一行和第一列的数字赋0
		for(int i=1; i<matrix.length; i++) 
			for(int j=1; j<matrix[0].length; j++) 
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}				
		
		//- 再次遍历除去第一行第一列的整个数组，如果对应的第一行和第一列的数字有一个为0，则将当前值赋0
		for(int i=1; i<matrix.length; i++) 
			for(int j=1; j<matrix[0].length; j++) 
				if(matrix[i][0] == 0 || matrix[0][j] == 0) 
					matrix[i][j] = 0;
				
		//- 最后根据第一行第一列的flag来更新第一行第一列
		if(row0)
			for(int j=0; j<matrix[0].length; j++)
				matrix[0][j] = 0;
		if(col0)
			for(int i=0; i<matrix.length; i++)
				matrix[i][0] = 0;
		
		return matrix;
	}
}
