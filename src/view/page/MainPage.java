package view.page;

import util.ComnUtil;
import view.element.ImagePane;
import view.element.MainMenuArea;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainPage extends JFrame {

	// 생성자 호출시 공통 레이아웃을 초기화한다.
	public MainPage() {
		ComnUtil.setCustomLayout(this);
		this.add(new MainMenuArea(), BorderLayout.CENTER);
	}
}
