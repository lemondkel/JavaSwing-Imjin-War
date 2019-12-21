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
		Font font = new Font("굴림", Font.CENTER_BASELINE, 22);
		menu1 = new JButton(Constant.MENU_TITLE1);
		menu1.setBackground(Color.WHITE);
		menu1.setFont(font);
		menu2 = new JButton(Constant.MENU_TITLE2);
		menu2.setBackground(Color.WHITE);
		menu2.setFont(font);
		menu3 = new JButton(Constant.MENU_TITLE3);
		menu3.setBackground(Color.WHITE);
		menu3.setFont(font);
		menu4 = new JButton(Constant.MENU_TITLE4);
		menu4.setBackground(Color.WHITE);
		menu4.setFont(font);

		// 새로운 게임 메뉴
		menu1.addActionListener(e -> {
			// 패널의 가운데 요소 지우기
			JPanel target = (JPanel) this.getParent();
			target.remove(this);

			// 국가 선택창 가운데에 추가
			target.add(new CountrySelect(), BorderLayout.CENTER);
			target.repaint();
		});

		// 종료 메뉴
		menu4.addActionListener(e -> {
			// 강제종료 시킨다.
			System.exit(0);
		});

		this.setLayout(new GridLayout(4, 1, 0, 0));
		this.add(menu1);
		this.add(menu2);
		this.add(menu3);
		this.add(menu4);
	}
}
