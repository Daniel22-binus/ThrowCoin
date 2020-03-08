package mainPackage;

import java.util.Random;

public class Coin {
	private boolean obverse;
	Random rnd;
	
	Coin() {
		obverse = false;
		rnd = new Random();
	}
	
	public boolean doThrow() {
		obverse = rnd.nextBoolean();
		return obverse;
	}
	
}
