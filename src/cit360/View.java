package cit360;

import java.awt.event.ActionListener;
import javax.swing.*;
/*The View is only what the user will see, also known
 *  as the interface. This will make the information 
 *  look pretty and have its own panel as opposed
 *  to just running it through the console.the View
 *  extends the JFrame which is the interface we are 
 *  setting up.*/
public class View extends JFrame{

	/*Here we are creating the labels, input text boxes, and the button
	 * the user will use to calculate the mortgage payment. These need to be 
	 * added in in the exact order you would like them to appear on the
	 * interface. The numbers next to the JFields indicate how big the
	 * textbox will be (characters)*/
	private JLabel priceLabel = new JLabel("Price of the Home");
	private JTextField price = new JTextField(10);
	private JLabel yearsLabel = new JLabel("Number of Years of Loan (15 or 30 years)");
	private JTextField years = new JTextField(4);
	private JLabel downPaymentLabel = new JLabel("Down Payment");
	private JTextField downPayment=new JTextField(10);
	private JButton calculateButton =new JButton("Calculate Mortgage Payment");
	private JTextField calculateMortgage = new JTextField(10);
	private JLabel disclaimerLabel =new JLabel("**This payment does not include taxes or Insurance.");
	
	/*This method is to set up the interface that is going to display on the screen*/
	View(){
		/*creating a new JPanel*/
		JPanel calculatePanel = new JPanel();
		/*Tells the system to exit the program when the user
		 * closes the panel*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*This sizes the panel */
		this.setSize(600,200);
		
		/*This next block of code is adding the components of 
		 * our program to the panel to be displayed*/
		calculatePanel.add(priceLabel);
		calculatePanel.add(price);
		calculatePanel.add(yearsLabel);
		calculatePanel.add(years);
		calculatePanel.add(downPaymentLabel);
		calculatePanel.add(downPayment);
		calculatePanel.add(calculateButton);
		calculatePanel.add(calculateMortgage);
		calculatePanel.add(disclaimerLabel);
		/*This adds that calculatePanel to the JFrame*/
		this.add(calculatePanel);
	}
	/*These next block of code allows us to access all the components */
	
	public double getPrice() {
		/*This is to turn the price into a double again
		 * because it is looked at as text in the JFrame*/
		return Double.parseDouble(price.getText());
	}
	public int getYears() {
		/*This is to turn the price into an int again
		 * because it is looked at as text in the JFrame*/
		return Integer.parseInt(years.getText());
	}
	public double getDownPayment() {
		/*This is to turn the price into a double again
		 * because it is looked at as text in the JFrame*/
		return Double.parseDouble(downPayment.getText());
	}
	public double getcalculateMortgage() {
		/*This is to turn the price into a double again
		 * because it is looked at as text in the JFrame*/
		return Double.parseDouble(calculateMortgage.getText());
	}
	
	/*We now need to provide the program with a way of 
	 * setting the calculate morgage because the model 
	 * does the calculation for us. it will convert 
	 * double t o a string to be displayed in the 
	 * panel*/
	public void setCalculateMortgage(double mortgage) {
		calculateMortgage.setText(Double.toString(mortgage));
	}
	
	/*Here we are going to allow for a way that the controller
	 * will be alerted whenever a button is pressed in our
	 * program. it is going to tell the controller to
	 * handle it because the view just handles the 
	 * interface.*/
	void addCalculateMortgageListener(ActionListener CalculateMortgageButton) {
		calculateButton.addActionListener(CalculateMortgageButton);
	}
	/*This is going to sent an error message to the users if they have not entered 
	 * all the information*/
	void errorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
