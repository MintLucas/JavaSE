import java.awt.*;
public class TestFrame{
	public static void main(String[] args){
		new MyFrame(300,300,400,300,Color.BLUE);
	}
}

class MyFrame extends Frame{
	private Panel p;
	MyFrame(int x , int y , int w , int h , Color c){
		super("FrameWithPanel");
		setLayout(null);
		setBounds(x,y,w,h);
		setBackground(c);	
		p = new Panel(null);
		p.setBounds(w/4,h/4,w/2,h/2);
		p.setBackground(Color.cyan);
		p.add(new Button("ok"));
		add(p);
		setVisible(true);
	}
}