import java.awt.*;
public class TenButtons{
	public static void main(String[] args){
		Frame f = new Frame("TenButtons");
		f.setLayout(new GridLayout(2,1));
		f.setLocation(300,400);
		f.setSize(300,200);
	
		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new BorderLayout());
		Panel p11 = new Panel(new GridLayout(2,1));
		Panel p21 = new Panel(new GridLayout(2,2));
		p1.add(new Button("B1"),BorderLayout.WEST);
		p1.add(new Button("B2"),BorderLayout.EAST);
		p11.add(new Button("B3"));
		p11.add(new Button("B4"));
		p1.add(p11,BorderLayout.CENTER);
		f.add(p1);
		f.add(p2);
	
		f.setVisible(true);
	}
}