package mainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThrowCoinFrame extends JFrame{

	private Coin c;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public ThrowCoinFrame() {
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		c = new Coin();

		this.setBounds(100, 100, 397, 269);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JButton btnThrow = new JButton("Throw");
		btnThrow.addActionListener(TossCoin);
		btnThrow.setBounds(267, 45, 104, 113);
		this.getContentPane().add(btnThrow);
		
		lblNewLabel = new JLabel("Result");
		lblNewLabel.setBounds(10, 190, 361, 40);
		this.getContentPane().add(lblNewLabel);
	}
	
	// Result after pressed btnThrow
	ActionListener TossCoin = new ActionListener() {
		
		public void actionPerformed(ActionEvent e){
			setResult(c.doThrow());
		}
		
		private void setResult(boolean result) {
			if (result) {
				lblNewLabel.setText("HEAD !");
			} else {
				lblNewLabel.setText("TAIL !");
			}
		}
	};

	public static void main (String [] args)
	{
		new ThrowCoinFrame();
	}
	
}
