package view.element;

import javax.swing.*;
import java.awt.*;

public class ImagePane extends JComponent {
	private Image image;
	public ImagePane(Image image) {
		this.image = image;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
	}
}
