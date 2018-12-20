package homework_day8;

import java.awt.*;
import java.awt.event.*;

public class Day8_pro5 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());

	}
}

class EventHandler extends WindowAdapter{
	public void windClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
