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
 * �ɻ���Ϸ������
 * @author ��˼Դ
 *
 */
public class MyGameFrame extends JFrame {
	
	Image plane = GameUtil.getImage("images/plane.png")	;
	Image bg = GameUtil.getImage("images/bg.ong");
	
	
	//�Զ����ã�g�൱����
	@Override
	public void paint(Graphics g) {
		Color c = g.getColor();
		Font f = g.getFont();
		
		g.setColor(Color.red);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.drawString("������", 200, 200);
		
		
		g.setColor(c);
		g.setFont(f);
		
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
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
