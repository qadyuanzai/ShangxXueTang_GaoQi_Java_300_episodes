package cn.sxt.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ������
 * @author ��˼Դ
 *
 */
public class MyGameFrame extends JFrame {
	//��ʼ������
	public void launchFrame() {
		this.setTitle("Percy����Ʒ");
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
