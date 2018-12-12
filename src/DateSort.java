class Date1{
	int year;
	int month;
	int day;
	
	Date1(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int compare(Date1 cd) {            //���������⣡
		if (year<cd.year)
			return -1;
		else if (month<cd.month)
			return -1;
		else if (day < cd.day)
			return -1;
		else if (year == cd.year && month == cd.month && day == cd.day)
			return 0;
		else return 1;
			
	}
}

public class DateSort {
	public static void main(String[] args) {
	Date1[] days = new Date1[5];     //���ά����һ��5��NULL
	days[0] = new Date1(1978, 2, 11);
	days[1] = new Date1(1978, 8, 15);            //ʡȥð������
	days[2] = new Date1(2003, 4, 13);
	days[3] = new Date1(2996, 7, 5);
	days[4] = new Date1(3996, 7, 5);
	Date1 d = new Date1(3996, 7, 5);
	
	for(int i=0; i<days.length; i++)
		System.out.print(days[i] + " ");
		
	System.out.println(BinarySearch(days, d));
	
	}
	
	public static int BinarySearch(Date1[] days, Date1 d) {          //ERROR �����еķ���Ҫ�þ�̬��������Ȼ�޷�����
		int sp = 0;
		int ep = days.length - 1;
		int m = (sp + ep)/2;
		
		while(sp<=ep) {
			if(d.compare(days[m]) == 0) return m;                  //����ȥһ���������Ƚϣ�ԭ��ֱ�ӵ��÷���
			if(d.compare(days[m]) == -1) {
				ep = m - 1;
				m = (sp + ep)/2;
			}
			if(d.compare(days[m]) == 1) {
				sp = m + 1;
				m = (sp + ep)/2;
			}
		}
		return -1;
	}
	
	
}
