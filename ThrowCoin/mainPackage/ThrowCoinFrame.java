package mainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThrowCoinFrame {

	private JFrame frame;
	JLabel lblNewLabel;
	private Coin c;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public ThrowCoinFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		c = new Coin();
		frame = new JFrame();
		frame.setBounds(100, 100, 397, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnThrow = new JButton("Throw");
		btnThrow.addActionListener(new BtnThrowListener());
		btnThrow.setBounds(267, 45, 104, 113);
		frame.getContentPane().add(btnThrow);
		
		lblNewLabel = new JLabel("Result");
		lblNewLabel.setBounds(10, 190, 361, 40);
		frame.getContentPane().add(lblNewLabel);
	}
	
	// Result after pressed btnThrow
	class BtnThrowListener implements ActionListener {
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
	}
	
	
}
