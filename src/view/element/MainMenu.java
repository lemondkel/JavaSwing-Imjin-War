package view.element;

import util.Constant;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {
	private JButton menu1;
	private JButton menu2;
	private JButton menu3;
	private JButton menu4;

	MainMenu() {
		menu1 = new JButton(Constant.MENU_TITLE1);
		menu2 = new JButton(Constant.MENU_TITLE2);
		menu3 = new JButton(Constant.MENU_TITLE3);
		menu4 = new JButton(Constant.MENU_TITLE4);
		this.setLayout(new GridLayout(4, 1, 0, 0));
		this.add(menu1);
		this.add(menu2);
		this.add(menu3);
		this.add(menu4);
	}
}
