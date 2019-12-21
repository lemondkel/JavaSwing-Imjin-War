package view.element;

import javax.swing.*;

public class HeadMenu extends JMenuBar {
	private JMenu menu1;
	private JMenu menu2;

	HeadMenu() {
		menu1 = new JMenu("asd");
		menu2 = new JMenu("asd");

		this.add(menu1);
		this.add(menu2);
		this.setVisible(true);
	}
}
