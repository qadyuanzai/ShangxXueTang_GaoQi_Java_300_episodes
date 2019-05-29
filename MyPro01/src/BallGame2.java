import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;//С�������
	double y = 100;//С��������
	
	double degree = 3.14/3;//���ȣ���/3��60�㣻
	
	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);
		
		//���±߽�
		if(y>430||y<80) {
			degree = -degree;
		}

		//���ұ߽�
		if(x<40||x>786) {
			degree = 3.14 - degree;
		}
	}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(400,200);
		setVisible(true);
		
		//�ػ����ڣ�ÿ��25��
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//main����
	public static void main(String[] args) {
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}