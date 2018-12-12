import java.awt.*;
import java.awt.event.*;

public class ActionEvent{
	public static void main(String[] args){
		new TFFrame().launchFrame();
	}
}

class TFFrame extends Frame{
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lPlus = new Label("+");
		Button bEqual = new Button("=");
		bEqual.addActionListener(new MyMonitor(this));
		setLayout(new FlowLayout());
		add(num1);
		add(lPlus);
		add(num2);
		add(bEqual);
		add(num3);
		pack();
		setVisible(true); 
	}	
}

class MyMonitor implements ActionListener{
	/*TextField num1,num2,num3;
	
	public MyMonitor(TextField num1, TextField num2, TextField num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}下面持有对方引用,整个Frame像大管家*/
	
	TFFrame tf = null;
	public MyMonitor(TFFrame tf){
		this.tf = tf;
	}


	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		int n1 = Integer.parseInt(tf.num1.getText());
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText("" + (n1+n2));
	}


}