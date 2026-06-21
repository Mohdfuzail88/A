package calculatorpackage;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowAdapter extends WindowAdapter {

	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	

}
