package view.page;

import util.ComnUtil;
import view.element.MainMenu;
import view.element.MainMenuArea;

import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {

	// 생성자 호출시 공통 레이아웃을 초기화한다.
	public MainPage() {
		ComnUtil.setCustomLayout(this);
		this.add(new MainMenuArea(), BorderLayout.CENTER);
	}
}
