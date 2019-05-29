import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;//С�������
	double y = 100;//С��������
	boolean right = true;//����
	
	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 1;
		if(right) {
			x = x + 10;
		}
		else {
			x = x - 10;
		}
		if (x>786) {
			right = false;
		}
		if(x<40) {
			right = true;
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}