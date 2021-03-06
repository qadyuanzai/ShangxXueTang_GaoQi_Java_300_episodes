import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;//小球横坐标
	double y = 100;//小球纵坐标
	
	double degree = 3.14/3;//弧度，Π/3，60°；
	
	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);
		
		//上下边界
		if(y>430||y<80) {
			degree = -degree;
		}

		//左右边界
		if(x<40||x>786) {
			degree = 3.14 - degree;
		}
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(400,200);
		setVisible(true);
		
		//重画窗口，每秒25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//main函数
	public static void main(String[] args) {
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
