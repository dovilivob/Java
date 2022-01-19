import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		The showInputDialog() returns a String.

		String name = JOptionPane.showInputDialog("What's your name? ");
		JOptionPane.showConfirmDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age, please."));
		JOptionPane.showConfirmDialog(null, "You're " + age + " years old!");

		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number."));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number."));
		JOptionPane.showConfirmDialog(null, num1 + "/" + num2 + " = " + num1 / num2);

	}

}
