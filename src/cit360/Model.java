package cit360;
/*The model only holds the data and calculations required
 * for our program. That is it. The Model does not even know
 * that the view exists.*/
/*In this demo I will be showing how to use the Model on MVC
 * We are going to calculate the monthly mortgage payment.
 * the program will ask the user for the price of the home,
 * the number of years to finance (15 (3%)or 30(4%)) and the 
 * down payment amount. That information will them be 
 * calculated and the monthly mortgage payment will
 * be displayed. */
public class Model {

	/*this is the variable that we are going to use to have the mortgage
	 * payment calculated and then added to he display screen for the user */
	private double mortgagePayment;
	
	/*This is the method and all the components needed to perform the calculation
	 * for our program.*/
	public void calculateMortgage(double price, int years, double downPayment) {
		/*these are the variable needed to calculate the formula. I have simplified them
		 * here to make the caluclate at the end easier to read.*/
		double interestRate = 0;
		double remainingBalance = price - downPayment;
		int months = years * 12;

 
		/*This is saying to the program that if the user enters a 15 the interest rate
		 * will be 3% and if the user enters 30 years the interest rate will be 4%*/
		if (years == 15) {
			interestRate = .03;
		} else if (years == 30) {
			interestRate = .04;

		}

		/*this is our formula to calculate the payment from the variables we
		 * established above*/
		mortgagePayment = Math.round(((interestRate / 12) * remainingBalance)
				/ (1 - Math.pow((1 + (interestRate / 12)), -months)));

		
	}
	/*This is the method that allows us to get the Mortgage payment value from the model*/
	public double getMortgagePayment() {
		return mortgagePayment;
	}
}
