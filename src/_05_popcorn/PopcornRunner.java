package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("what flavor");
		String idontcare = JOptionPane.showInputDialog("How long cook");
		int y = Integer.parseInt(idontcare);
		Popcorn corn = new Popcorn(x);
		Microwave micro = new Microwave();
		micro.putInMicrowave(corn);
		micro.setTime(y);
		micro.startMicrowave();
	}
}
