package renderer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Painter extends JFrame{
	static Graphics g;
	static Graphics2D g2 = (Graphics2D)g;
	
	public static void main(String[] args){
		new Painter();
	}
	
	public Painter() throws HeadlessException{
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new DrawArea());
		setVisible(true);
	}
	
	class DrawArea extends JPanel{
		Point A = null;
		public DrawArea(){
			A = new Point(100,200);
		}
		
		@Override
		protected void paintComponent(Graphics g){
			g.drawRect(A.x, A.y, 50, 50);
		}
	}
	
}
