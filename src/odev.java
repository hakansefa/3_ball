import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Image;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;

public class odev extends JFrame {
int x,x1,x2;
int y,y1,y2;
int hizx=1,hizx1=1,hizx2=1;
int hizy =1,hizy1=1,hizy2=1;

	private JPanel contentPane;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev frame = new odev();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public odev() {
		setTitle("3 Top");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Image img = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/f.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/p.png")).getImage();
		JLabel lblAaaa = new JLabel();
		lblAaaa.setOpaque(true);
		lblAaaa.setIcon(new ImageIcon(img));
		
		lblAaaa.setBounds(131, 150, 50, 50);
		contentPane.add(lblAaaa);
		
		JLabel label1 = new JLabel();
		label1.setIcon(new ImageIcon(img1));
		label1.setOpaque(true);
		
		label1.setBounds(251, 119, 50, 50);
		contentPane.add(label1);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(img2));
		label.setOpaque(true);
		
		label.setBounds(131, 65, 50, 50);
		contentPane.add(label);
		 Rectangle rect1 = new Rectangle(x, y, 50, 50);
	     Rectangle rect2 = new Rectangle(x1, y1, 50, 50);
	     Rectangle rect3 = new Rectangle(x2, y2, 50, 50);
		Timer time = new Timer();
		
	    TimerTask islem = new TimerTask() {
	    	
			@Override
			public void run() {
			 x = (int) label.getBounds().getX();
			 y=  (int) label.getBounds().getY();
			 x1 = (int) lblAaaa.getBounds().getX();
			 y1=  (int) lblAaaa.getBounds().getY();
			 x2= (int) label1.getBounds().getX();
			 y2=  (int) label1.getBounds().getY();
		     
			 x= x + hizx;
			 y= y + hizy;
			 x1= x1 + hizx1;
			 y1= y1 + hizy1;
			 x2= x2 + hizx2;
			 y2= y2 + hizy2;
			
			
					
				
			
			 label.setBounds(x, y, 50, 50);
			 lblAaaa.setBounds(x1, y1, 50, 50);
			 label1.setBounds(x2, y2, 50, 50);
			 Rectangle rect1 = new Rectangle(x, y, 50, 50);
		     Rectangle rect2 = new Rectangle(x1, y1, 50, 50);
		     Rectangle rect3 = new Rectangle(x2, y2, 50, 50);
			
			 
	                  
			
			 if(x>=384 || x<=0) hizx = hizx * -1;
			 if(y>=211 || y<=0) hizy = hizy * -1;
			 if(x1>=384 || x1<=0) hizx1 = hizx1 * -1;
			 if(y1>=211 || y1<=0) hizy1= hizy1 * -1;
			 if(x2>=384 || x2<=0) hizx2 = hizx2 * -1;
			 if(y2>=211 || y2<=0) hizy2 = hizy2 * -1;
			
			 if(rect2.intersects(rect1)) 
			 {
				 hizx = hizx * -1;
				 hizy = hizy * -1;
			     
				 hizx1 = hizx1 * -1;
				 hizy1= hizy1 * -1;
				 
				
			     
			 }
			 if(rect3.intersects(rect1)) 
			 {
				 hizx = hizx * -1;
				 hizy = hizy * -1;
				 hizx2 = hizx2 * -1;
				 hizy2 = hizy2 * -1;
				
				

			 }
			 
			 if(rect3.intersects(rect2)) 
			 {
				 hizx1 = hizx1 * -1;
				 hizy1 = hizy1 * -1;
				 hizx2 = hizx2 * -1;
				 hizy2 = hizy2 * -1;
			 }
	
			 
		
			 
			 
			}
		
			
	    };
	    
	    time.schedule(islem, 0,3);

	}
}
