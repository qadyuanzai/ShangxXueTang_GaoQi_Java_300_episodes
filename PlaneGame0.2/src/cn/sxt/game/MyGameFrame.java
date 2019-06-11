package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
	
	Image plane = GameUtil.getImage("images/plane.png")	;
	Image bg = GameUtil.getImage("images/bg.ong");
	
	
	//自动调用，g相当画笔
	@Override
	public void paint(Graphics g) {
		Color c = g.getColor();
		Font f = g.getFont();
		
		g.setColor(Color.red);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.drawString("我在哪", 200, 200);
		
		
		g.setColor(c);
		g.setFont(f);
		
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
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
