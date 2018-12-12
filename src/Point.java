
 class PointSrc {
	int x;
	int y;
	int z;
	
	public PointSrc(int u,int v,int w) {  //u,v,w-> _x , _y, _z
		x = u;
		y = v;
		z = w;
	}
	
	public void setX(int u) {
		x = u;
	}
	
	public void setY(int v) {
		y = v;
	}
	
	public void setZ(int w) {
		z = w;
	}
	
	public int square(PointSrc u) {   //square->getDistance(PointSrc t(argetPoint))
		return x*x+y*y+z*z;           //return x[此处x是调用对象的x]-t.x)+(y-t.y)+(z-t.z)
	}
	
}

public class Point{
	public static void main(String args[]) {
		PointSrc temp = new PointSrc(0,0,1);
		temp.setX(2);
		System.out.println("Square=" +temp.square(temp)); //不用传值，针对对象temp调用方法，隐含拥有temp的x,y,z，可再传入另一个点
		
	}
	
}