package view.element;

import javax.swing.*;

public class HeadMenu extends JMenuBar {
	private JMenu menu1;
	private JMenuItem menu1Item1;
	private JMenuItem menu1Item2;
	private JMenuItem menu1Item3;

	public HeadMenu() {
		menu1 = new JMenu("파일");
		menu1Item1 = new JMenuItem("저장");
		menu1Item2 = new JMenuItem("불러오기");
		menu1Item3 = new JMenuItem("종료");

		// 종료 메뉴
		menu1Item3.addActionListener(e -> {
			// 강제종료 시킨다.
			System.exit(0);
		});

		menu1.add(menu1Item1);
		menu1.add(menu1Item2);
		menu1.add(menu1Item3);

		this.add(menu1);
		this.setVisible(true);
	}
}
