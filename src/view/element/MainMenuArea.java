package view.element;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainMenuArea extends JPanel {
	public MainMenuArea() {
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createEmptyBorder(280, 350, 280, 350));
		this.add(new MainMenu(), BorderLayout.CENTER);
	}

	@Override
	protected void paintComponent(Graphics g) {
		BufferedImage mainBackgroundImage = null;
		try {
			mainBackgroundImage = ImageIO.read(new File("images/main-image1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(mainBackgroundImage, 0, 0, null);
	}
}
