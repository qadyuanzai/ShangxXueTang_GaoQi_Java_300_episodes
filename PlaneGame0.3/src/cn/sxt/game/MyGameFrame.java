package cn.sxt.game;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ������
 * @author ��˼Դ
 *
 */
public class MyGameFrame extends JFrame {
	
	Image plane = GameUtil.getImage("images/plane.png")	;
	Image bg = GameUtil.getImage("images/bg.jpg");
	int planeX = 250;
	int planeY = 250;
	
	//�Զ����ã������ֶ���g�൱����
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
	}
	
	//�������Ƿ����ػ�����
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();//�ػ�
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//��ʼ������
	public void launchFrame() {
		this.setTitle("Percy����Ʒ");
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.setVisible(true);//���setVisible
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
