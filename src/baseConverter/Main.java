package baseConverter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class Main implements ActionListener {
	private static JLabel heading;
	private static JLabel label1;
	private static JLabel label2;
	private static JLabel label3;
	private static JTextField userText;
	private static JButton button;
	private static JLabel success;
	private static JComboBox dropDownBox;
	private static JComboBox dropDownBox2;

	public static void main(String args[]) {

		JPanel panel = new JPanel();
		JFrame frame = new JFrame("frame");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.setLayout(null);

		heading = new JLabel("Base Converter");
		heading.setBounds(125, 10, 200, 25);
		panel.add(heading);

		label1 = new JLabel("Select Base");
		label1.setBounds(10, 40, 80, 25);
		panel.add(label1);

		String baseName[] = { "Decimal", "Octal", "Hexa", "Binary" };
		dropDownBox = new JComboBox<>(baseName);
		dropDownBox.setBounds(100, 40, 165, 25);
		panel.add(dropDownBox);

		label2 = new JLabel("Enter a number");
		label2.setBounds(10, 70, 80, 25);
		panel.add(label2);

		userText = new JTextField();
		userText.setBounds(100, 70, 165, 25);
		panel.add(userText);

		label3 = new JLabel("Convert to");
		label3.setBounds(10, 100, 80, 25);
		panel.add(label3);

		dropDownBox2 = new JComboBox<>(baseName);
		dropDownBox2.setBounds(100, 100, 165, 25);
		panel.add(dropDownBox2);

		button = new JButton("calculate");
		button.setBounds(10, 130, 80, 25);
		button.addActionListener(new Main());
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 160, 300, 25);
		panel.add(success);

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String dropDown1 = (String) dropDownBox.getSelectedItem();
		String dropDown2 = (String) dropDownBox2.getSelectedItem();
		String str = "";
		int num = 0;
		if (dropDown1.equals("Hexa"))
			str = userText.getText();
		else
			num = Integer.parseInt(userText.getText());

		if (dropDown1.equals("Decimal")) {
			if (dropDown2.equals("Decimal")) {
				success.setText("Result: " + num);
			} else if (dropDown2.equals("Binary")) {
				String ans = Decimal.toBinary(num);
				success.setText("Result: " + ans);
			} else if (dropDown2.equals("Octal")) {
				int ans = Decimal.toOctal(num);
				success.setText("Result: " + ans);
				;
			} else if (dropDown2.equals("Hexa")) {
				String ans = Decimal.toHexa(num);
				success.setText("Result: " + ans);
			}
		} else if (dropDown1.equals("Octal")) {
			if (dropDown2.equals("Octal")) {
				success.setText("Result: " + num);
			} else if (dropDown2.equals("Decimal")) {
				int ans = Octal.toDecimal(num);
				success.setText("Result: " + ans);
			} else if (dropDown2.equals("Binary")) {
				String ans = Octal.toBinary(num);
				success.setText("Result: " + ans);
			} else if (dropDown2.equals("Hexa")) {
				String ans = Octal.toHexa(num);
				success.setText("Result: " + ans);
			}

		} else if (dropDown1.equals("Binary")) {
			if (dropDown2.equals("Binary")) {
				success.setText("Result: " + num);
			} else if (dropDown2.equals("Decimal")) {
				int ans = Binary.toDecimal(num);
				success.setText("Result: " + ans);
			} else if (dropDown2.equals("Octal")) {
				int ans = Binary.toOctal(num);
				success.setText("Result: " + ans);

			} else if (dropDown2.equals("Hexa")) {
				String ans = Binary.toHexa(num);
				success.setText("Result: " + ans);
			}

		} else if (dropDown1.equals("Hexa")) {
			if (dropDown2.equals("Hexa")) {
				success.setText("Result: " + str);
			} else if (dropDown2.equals("Decimal")) {
				int ans = Hexadecimal.toDecimal(str.toUpperCase());
				success.setText("Result: " + ans);
			} else if (dropDown2.equals("Octal")) {
				int ans = Hexadecimal.toOctal(str.toUpperCase());
				success.setText("Result: " + ans);
			} else if (dropDown2.equals("Binary")) {
				String ans = Hexadecimal.toBinary(str.toUpperCase());
				success.setText("Result: " + ans);
			}
		}

	}

}
