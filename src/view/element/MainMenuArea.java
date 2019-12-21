package view.element;

import javax.swing.*;
import java.awt.*;

public class MainMenuArea extends JPanel {
	public MainMenuArea() {
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createEmptyBorder(200, 300, 200, 300));
		this.add(new MainMenu(), BorderLayout.CENTER);
	}
}
