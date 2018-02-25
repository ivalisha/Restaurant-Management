import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Restaurants {

	private JFrame frame;
	private JTextField txtCheeseburger;
	private JTextField txtMenuBox;
	private JTextField txtChickenWings;
	private JTextField txtDisplay;
	
	public double firstNum;
	public double secondNum;
	public String operations;
	public String answer;
	public double result;
	private JTextField txtQty;
	private JTextField txtConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(56, 61, 614, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCheeseburger = new JLabel("Cheeseburger");
		lblCheeseburger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCheeseburger.setBounds(22, 22, 154, 29);
		panel.add(lblCheeseburger);
		
		JLabel lblNewLabel_1 = new JLabel("Menu Box Meal");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(22, 64, 176, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblChickenWings = new JLabel("Chicken Wings");
		lblChickenWings.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenWings.setBounds(22, 106, 164, 29);
		panel.add(lblChickenWings);
		
		txtCheeseburger = new JTextField();
		txtCheeseburger.setText("0");
		txtCheeseburger.setToolTipText("");
		txtCheeseburger.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCheeseburger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtCheeseburger.setBounds(279, 22, 290, 29);
		panel.add(txtCheeseburger);
		txtCheeseburger.setColumns(10);
		
		txtMenuBox = new JTextField();
		txtMenuBox.setText("0");
		txtMenuBox.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMenuBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtMenuBox.setColumns(10);
		txtMenuBox.setBounds(279, 64, 290, 29);
		panel.add(txtMenuBox);
		
		txtChickenWings = new JTextField();
		txtChickenWings.setText("0");
		txtChickenWings.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChickenWings.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtChickenWings.setColumns(10);
		txtChickenWings.setBounds(279, 106, 290, 29);
		panel.add(txtChickenWings);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrinks.setBounds(23, 156, 76, 29);
		panel.add(lblDrinks);
		
		JComboBox jcomboDrinks = new JComboBox();
		jcomboDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jcomboDrinks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jcomboDrinks.setBounds(23, 192, 154, 29);
		panel.add(jcomboDrinks);
		
		txtQty = new JTextField();
		txtQty.setText("0");
		txtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		txtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtQty.setColumns(10);
		txtQty.setBounds(279, 192, 290, 29);
		panel.add(txtQty);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQty.setBounds(279, 156, 67, 29);
		panel.add(lblQty);
		
		JCheckBox checkDelivery = new JCheckBox("Home Delivery");
		checkDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		checkDelivery.setBounds(23, 232, 175, 25);
		panel.add(checkDelivery);
		
		JCheckBox checkTax = new JCheckBox("Tax");
		checkTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		checkTax.setBounds(279, 230, 113, 25);
		panel.add(checkTax);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 151, 590, 8);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(682, 61, 325, 266);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcomboConvert = new JComboBox();
		jcomboConvert.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "Philipines", "Europe", "Canada", "Brazil", "China", "India"}));
		jcomboConvert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jcomboConvert.setBounds(67, 66, 185, 31);
		panel_1.add(jcomboConvert);
		
		txtConvert = new JTextField();
		txtConvert.setText("0");
		txtConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		txtConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtConvert.setColumns(10);
		txtConvert.setBounds(31, 110, 264, 40);
		panel_1.add(txtConvert);
		
		JLabel labelConvert = new JLabel("\r\n");
		labelConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		labelConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelConvert.setBounds(31, 163, 264, 40);
		panel_1.add(labelConvert);
		
		JButton jBtnConvert = new JButton("Convert");
		jBtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double philipinesCurrency =  51.81; 
				double europeCurrency  =  0.81;  
				double canadaCurrency =   1.26; 
				double brazilCurrency =   3.23; 
				double chinaCurrency  =   6.33; 
				double indiaCurrency   = 64.88; 
				double convert  = Double.parseDouble(txtConvert.getText());
			    String convertToString;
				
				if(jcomboConvert.getSelectedItem() == "Philipines") {
					
					convert = convert * philipinesCurrency;
					convertToString = String.format("%.2f", convert);
					labelConvert.setText(convertToString);
				} else if (jcomboConvert.getSelectedItem() == "Europe") {
					
					convert = convert * europeCurrency;
					convertToString = String.format("%.2f", convert);
					labelConvert.setText(convertToString);
					
				} else if (jcomboConvert.getSelectedItem() == "Canada") {
					
					convert = convert * canadaCurrency;
					convertToString = String.format("%.2f", convert);
					labelConvert.setText(convertToString);
					
				} else if (jcomboConvert.getSelectedItem() == "Brazil") {
					
					convert = convert * brazilCurrency;
					convertToString = String.format("%.2f", convert);
					labelConvert.setText(convertToString);
					
				} else if (jcomboConvert.getSelectedItem() == "China") {
					
					convert = convert * chinaCurrency;
					convertToString = String.format("%.2f", convert);
					labelConvert.setText(convertToString);
					
				} else if (jcomboConvert.getSelectedItem() == "India") {
					
					convert = convert * indiaCurrency;
					convertToString = String.format("%.2f", convert);
					labelConvert.setText(convertToString);
					
				} else {
					
					labelConvert.setText("0.00");
				}
			}
		});
		jBtnConvert.setFont(new Font("Tahoma", Font.BOLD, 15));
		jBtnConvert.setBounds(37, 216, 97, 25);
		panel_1.add(jBtnConvert);
		
		JButton jBtnClose = new JButton("Clear");
		jBtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtConvert.setText("0");
				labelConvert.setText(null);
			}
		});
		jBtnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		jBtnClose.setBounds(181, 217, 103, 24);
		panel_1.add(jBtnClose);
		
		JLabel lblNewLabel_2 = new JLabel("Currency Converter");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(31, 13, 247, 40);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(682, 330, 325, 232);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel labelTax = new JLabel("\r\n");
		labelTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelTax.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelTax.setBounds(139, 32, 174, 29);
		panel_2.add(labelTax);
		
		JLabel labelSubtotal = new JLabel("\r\n");
		labelSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		labelSubtotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelSubtotal.setBounds(139, 99, 174, 29);
		panel_2.add(labelSubtotal);
		
		JLabel labelTotal = new JLabel("\r\n");
		labelTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelTotal.setBounds(139, 163, 174, 29);
		panel_2.add(labelTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(13, 32, 82, 29);
		panel_2.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubtotal.setBounds(13, 99, 93, 39);
		panel_2.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(13, 163, 82, 29);
		panel_2.add(lblTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(56, 330, 614, 232);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("Cost of Drinks");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(26, 39, 154, 38);
		panel_3.add(label);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeal.setBounds(27, 101, 176, 44);
		panel_3.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDelivery.setBounds(27, 170, 176, 29);
		panel_3.add(lblCostOfDelivery);
		
		JLabel labelCostDrinks = new JLabel("\r\n");
		labelCostDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelCostDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCostDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCostDrinks.setBounds(294, 39, 270, 29);
		panel_3.add(labelCostDrinks);
		
		JLabel labelCostMeal = new JLabel("\r\n");
		labelCostMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelCostMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCostMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCostMeal.setBounds(294, 104, 270, 29);
		panel_3.add(labelCostMeal);
		
		JLabel labelCostDelivery = new JLabel("\r\n");
		labelCostDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelCostDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCostDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCostDelivery.setBounds(294, 170, 270, 29);
		panel_3.add(labelCostDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(1019, 59, 300, 503);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 28, 271, 462);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea receiptPanel = new JTextArea();
		receiptPanel.setFont(new Font("Monospaced", Font.PLAIN, 28));
		receiptPanel.setBounds(12, 13, 242, 406);
		panel_6.add(receiptPanel);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(12, 26, 242, 43);
		panel_7.add(txtDisplay);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDel.setBounds(0, 97, 55, 52);
		panel_7.add(btnDel);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnC.setBounds(67, 97, 55, 52);
		panel_7.add(btnC);
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPerc.setBounds(134, 97, 55, 52);
		panel_7.add(btnPerc);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(201, 97, 55, 52);
		panel_7.add(btnPlus);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMin.setBounds(201, 162, 55, 52);
		panel_7.add(btnMin);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(134, 162, 55, 52);
		panel_7.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(67, 162, 55, 52);
		panel_7.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(0, 162, 55, 52);
		panel_7.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(0, 227, 55, 52);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(67, 227, 55, 52);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(134, 227, 55, 52);
		panel_7.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMult.setBounds(201, 227, 55, 52);
		panel_7.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(201, 292, 55, 52);
		panel_7.add(btnDiv);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(134, 292, 55, 52);
		panel_7.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(67, 292, 55, 52);
		panel_7.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(0, 292, 55, 52);
		panel_7.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(0, 367, 55, 52);
		panel_7.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(67, 367, 55, 52);
		panel_7.add(btnDot);
		
		JButton btnPlusMin = new JButton("+-");
		btnPlusMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops= Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops= ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlusMin.setBounds(134, 367, 55, 52);
		panel_7.add(btnPlusMin);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(txtDisplay.getText());
				
				if(operations == "+") {
					
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "-") {
					
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "*") {
					
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "/") {
					
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "%") {
					
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEq.setBounds(201, 367, 55, 52);
		panel_7.add(btnEq);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(56, 563, 1263, 90);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jbtnTotal = new JButton("Total");
		jbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String totalToString, subtotalToString, taxToString, costMeal;
				double burgerTotal, menuBoxTotal , chickenWingsTotal, mealTotal, deliveryTotal, total, tax, subtotal;
				
				//Meal Cost
				
				if(txtCheeseburger.getText() == null) {
					
					burgerTotal = 0;
					
				} else {
					
					double burgerQuantity = Double.parseDouble(txtCheeseburger.getText());
					burgerTotal = burgerQuantity * 2.39;
					
				}
				
				if(txtMenuBox.getText() == null) {
					
					menuBoxTotal = 0;
					
				} else {
					
					double menuBoxQuantity = Double.parseDouble(txtMenuBox.getText());
					menuBoxTotal = menuBoxQuantity * 4.39;					
				}
				
				if(txtChickenWings.getText() == null) {
					
					chickenWingsTotal = 0;
					
				} else {
					
					double chickenWingsQuantity = Double.parseDouble(txtChickenWings.getText());
					chickenWingsTotal = chickenWingsQuantity * 3.39;
					
					
				}
				
				mealTotal  = burgerTotal + menuBoxTotal + chickenWingsTotal;
				costMeal = String.format("%.2f", mealTotal);
				labelCostMeal.setText("$"+costMeal);
				
				//Drinks Cost
				double drinksQuantity = Double.parseDouble(txtQty.getText());
				double drinksTotal = 0;
				String costDrinks;
				double teaPrice = 1.20;
				double iceTeaPrice = 0.90;
				double coffeePrice = 2.50;
				double iceCoffeePrice = 1.10;
				double colaPrice = 2.50;
				double cokePrice = 1.60;
				double orangePrice = 1.70;
				double appleJuicePrice = 1.99;
				
				if(jcomboDrinks.getSelectedItem() == "Tea") {
					
					drinksTotal = teaPrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
					
				} else if (jcomboDrinks.getSelectedItem() == "Apple Juice") {
					
					drinksTotal = appleJuicePrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
					
				} else if (jcomboDrinks.getSelectedItem() == "Cola") {
					
					drinksTotal = colaPrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
					
				} else if (jcomboDrinks.getSelectedItem() == "Coke") {
					
					drinksTotal = cokePrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
					
				} else if (jcomboDrinks.getSelectedItem() == "Coffee") {
					
					drinksTotal = coffeePrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
					
				} else if (jcomboDrinks.getSelectedItem() == "Ice Tea") {
					
					drinksTotal = iceTeaPrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
					
				} else if (jcomboDrinks.getSelectedItem() == "Ice Coffee") {
					
					drinksTotal = iceCoffeePrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
				} else if (jcomboDrinks.getSelectedItem() == "Orange") {
					
					drinksTotal = orangePrice * drinksQuantity;
					costDrinks = String.format("%.2f", drinksTotal);
					labelCostDrinks.setText("$"+costDrinks);
				} else {
					
					labelCostDrinks.setText("$"+"0.00");
					
				}
				
				
				//Delivery Cost
				
				if(checkDelivery.isSelected()) {
					
					deliveryTotal = 3.00;
					labelCostDelivery.setText("$"+ deliveryTotal);
					
				} else {
					
					deliveryTotal = 0.00;
					labelCostDelivery.setText("$"+ deliveryTotal);
					
				}
				
				//Tax
				subtotal = mealTotal + drinksTotal + deliveryTotal;				
				if(checkTax.isSelected()) {
					tax = (subtotal * 2)/100;
					total = subtotal + tax;
				} else {
					tax = 0;
					total = subtotal;
				}
				
				taxToString = String.format("%.2f", tax);
				subtotalToString = String.format("%.2f", subtotal);
				totalToString = String.format("%.2f", total);
				
				labelTax.setText("$" + taxToString);
				labelSubtotal.setText("$" + subtotalToString);
				labelTotal.setText("$"+totalToString);
				txtConvert.setText(totalToString);
			}
		});
		jbtnTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		jbtnTotal.setBounds(409, 26, 105, 29);
		panel_5.add(jbtnTotal);
		
		JButton jbtnReceipt = new JButton("Receipt");
		jbtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 receiptPanel.append("Receipt\n\n" + "Tax: " + labelTax.getText() + "\n" 
				 + "Subtotal: " + labelSubtotal.getText() + "\n" + "Total: " + labelTotal.getText());
			}
		});
		jbtnReceipt.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnReceipt.setBounds(560, 26, 105, 29);
		panel_5.add(jbtnReceipt);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCheeseburger.setText("0");
				txtMenuBox.setText("0");
				txtChickenWings.setText("0");
				txtQty.setText("0");
				txtConvert.setText("0");
				labelCostDrinks.setText(null);
				labelCostMeal.setText(null);
				labelCostDelivery.setText(null);
				labelConvert.setText(null);
				labelTax.setText(null);
				labelSubtotal.setText(null);
				labelTotal.setText(null);
				jcomboDrinks.setSelectedItem("Select a drink");
				jcomboConvert.setSelectedItem("Choose One");	
				checkDelivery.setSelected(false);
				checkTax.setSelected(false);
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnReset.setBounds(690, 26, 111, 29);
		panel_5.add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnExit.setBounds(832, 26, 111, 29);
		panel_5.add(jbtnExit);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 27));
		lblNewLabel.setBounds(289, 13, 783, 35);
		frame.getContentPane().add(lblNewLabel);
	}
}
