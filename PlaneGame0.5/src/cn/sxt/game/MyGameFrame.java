package cn.sxt.game;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * �ɻ���Ϸ������
 * @author ��˼Դ
 *
 */
public class MyGameFrame extends Frame {
	
	Image plane = GameUtil.getImage("images/plane.png")	;
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane p = new Plane(plane, 250, 250);
	
	Shell[] shells = new Shell[50];
	
	//�Զ����ã������ֶ���g�൱����
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		p.drawSelf(g);//���ɻ�
		
		//���ڵ�
		for(int i = 0; i < shells.length; i++) {
			shells[i].draw(g);
			boolean collision = shells[i].getRect().intersects(p.getRect());
			if(collision) {
				p.alive = false;
			}
		}
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
	
	//������̼������ڲ���
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			p.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			p.minusDirection(e);
		}
		
	}
	
	
	//
	//
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
		
		for(int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
		}
		
		
		new PaintThread().start();//�����ػ������߳�
		addKeyListener(new KeyMonitor());//���������Ӽ��̼���
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}
}
