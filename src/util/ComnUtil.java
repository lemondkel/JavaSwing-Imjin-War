package util;

import javax.swing.*;

/**
 * 공통 유틸
 */
public class ComnUtil {

	/**
	 * 공통 화면크기를 설정한다.
	 *
	 * @param targetFrame 대상 프레임 영역
	 */
	public static void setCustomLayout(JFrame targetFrame) {
		targetFrame.setLayout(Constant.bl1);
		targetFrame.setTitle(Constant.GAME_TITLE);
		targetFrame.setSize(1024, 800);
		targetFrame.setLocationRelativeTo(null);
		targetFrame.setVisible(true);

		// 맨 위에 메뉴 부착
		targetFrame.setJMenuBar(Constant.hm);
	}
}
