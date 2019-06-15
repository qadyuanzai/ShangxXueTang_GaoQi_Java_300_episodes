package cn.sxt.game;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * 飞机游戏主窗口
 * @author 张思源
 *
 */
public class MyGameFrame extends Frame {
	
	Image plane = GameUtil.getImage("images/plane.png")	;
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane p = new Plane(plane, 250, 250);
	
	Shell[] shells = new Shell[50];
	
	//自动调用，不能手动，g相当画笔
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		p.drawSelf(g);//画飞机
		
		//画炮弹
		for(int i = 0; i < shells.length; i++) {
			shells[i].draw(g);
			boolean collision = shells[i].getRect().intersects(p.getRect());
			if(collision) {
				p.alive = false;
			}
		}
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
	
	//定义键盘监听的内部类
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
		
		for(int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
		}
		
		
		new PaintThread().start();//启动重画窗口线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘监听
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
	
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}
}
