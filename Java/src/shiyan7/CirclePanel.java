package shiyan7;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CirclePanel extends JPanel implements MouseWheelListener {

	private int x = 50, y = 50, radius = 50;

	public CirclePanel() {
		// 设置该Panel获得焦点，否则键盘事件不会被它接收
		setFocusable(true);
		addMouseWheelListener(this);
		// 添加按键适配器监听按键事件
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					y += 10;
					break;
				case KeyEvent.VK_LEFT:
					x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					x += 10;
					break;
				default:
					break;
				}
				repaint();
			}
		});
	}

	// 绘制圆形
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x, y, radius, radius);
	}

	// 鼠标滚轮事件监听器
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		int r = e.getWheelRotation();
		if (r == -1) {
			radius += 15;
		} else if (r == 1) {
			radius -= 15;
		}
		repaint();
	}

	// main函数
	public static void main(String[] args) {
		CirclePanel c = new CirclePanel();
		// 创建一个JFrame用来添加CirclePanel
		JFrame frame = new JFrame();
		frame.add(c);

		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
