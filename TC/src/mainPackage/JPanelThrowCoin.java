package mainPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelThrowCoin extends JPanel{
	public JPanelThrowCoin() {
	}
	private static final long serialVersionUID = 1L;
	private static final String headImglocalization = "D:\\Repo\\TC\\TC\\img\\head.jpg";
	private static final String tailImglocalization = "D:\\Repo\\TC\\TC\\img\\tail.jpg";
	private boolean isHead;
	private boolean isReseted;
	
	public void setResult(boolean result) {
		isHead = result;
	}
	
	public void resetImg() {
		isReseted = true;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (isReseted) {
			g.setColor(Color.GRAY);
			g.fillRect(0, 0, 300, 300);
			isReseted = false;
			return;
		}
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 300, 300);
		Image coin;
		if (isHead) {
			coin = new ImageIcon(headImglocalization).getImage();
		} else {
			coin = new ImageIcon(tailImglocalization).getImage();
		}
		g.fillRect(0, 0, 300, 300);
		g.drawImage(coin, 0, 0, this);
	}
}
