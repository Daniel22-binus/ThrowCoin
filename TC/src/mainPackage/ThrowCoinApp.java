package mainPackage;

import java.awt.EventQueue;

public class ThrowCoinApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThrowCoinFrame window = new ThrowCoinFrame();				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}