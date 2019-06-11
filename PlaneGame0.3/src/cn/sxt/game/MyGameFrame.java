package cn.sxt.game;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 * @author 张思源
 *
 */
public class MyGameFrame extends JFrame {
	
	Image plane = GameUtil.getImage("images/plane.png")	;
	Image bg = GameUtil.getImage("images/bg.jpg");
	int planeX = 250;
	int planeY = 250;
	
	//自动调用，不能手动，g相当画笔
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
	}
	
	//帮助我们反复重画窗口
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();//重画
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//初始化窗口
	public void launchFrame() {
		this.setTitle("Percy的作品");
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.setVisible(true);//最后setVisible
		
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
