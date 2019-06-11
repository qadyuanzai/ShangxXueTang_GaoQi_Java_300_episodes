package cn.sxt.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 * @author 张思源
 *
 */
public class MyGameFrame extends JFrame {
	//初始化窗口
	public void launchFrame() {
		this.setTitle("Percy的作品");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
