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
		
		//��ɨ���һ�е�һ�У������0���򽫸��Ե�flag����Ϊtrue
		for(int i=0;i<matrix.length;i++) 
			if(matrix[i][0] == 0)
				col0 = true;
		for(int j=0;j<matrix[0].length;j++) 
			if(matrix[0][j] == 0)
				row0 = true;
		
		//Ȼ��ɨ���ȥ��һ�е�һ�е��������飬�����0���򽫶�Ӧ�ĵ�һ�к͵�һ�е����ָ�0
		for(int i=1; i<matrix.length; i++) 
			for(int j=1; j<matrix[0].length; j++) 
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}				
		
		//- �ٴα�����ȥ��һ�е�һ�е��������飬�����Ӧ�ĵ�һ�к͵�һ�е�������һ��Ϊ0���򽫵�ǰֵ��0
		for(int i=1; i<matrix.length; i++) 
			for(int j=1; j<matrix[0].length; j++) 
				if(matrix[i][0] == 0 || matrix[0][j] == 0) 
					matrix[i][j] = 0;
				
		//- �����ݵ�һ�е�һ�е�flag�����µ�һ�е�һ��
		if(row0)
			for(int j=0; j<matrix[0].length; j++)
				matrix[0][j] = 0;
		if(col0)
			for(int i=0; i<matrix.length; i++)
				matrix[i][0] = 0;
		
		return matrix;
	}
}
