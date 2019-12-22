package view.element;

import util.Constant;

import javax.swing.*;
import java.awt.*;


/**
 * 국가선택창 (참고자료 있음)
 *
 * @TODO l2jong 다음날 할일 - 해당 창 만들기
 */
public class CountrySelect extends JPanel {

	private JPanel CountrySelectTop;
	private JPanel CountrySelectCenter;
	private JPanel CountrySelectBottom;

	CountrySelect() {
		CountrySelectTop = new JPanel();
		CountrySelectCenter = new JPanel();
		CountrySelectBottom = new JPanel();

		CountrySelectTop.setLayout(new FlowLayout());
		CountrySelectTop.add(new JLabel("국가 선택"));

		CountrySelectCenter.setLayout(Constant.bl1);
		CountrySelectBottom.setLayout(Constant.bl1);

		this.setLayout(Constant.bl1);
		this.add(CountrySelectTop, BorderLayout.NORTH);
		this.add(CountrySelectCenter, BorderLayout.NORTH);
		this.add(CountrySelectBottom, BorderLayout.NORTH);
		this.setVisible(true);
	}
}
