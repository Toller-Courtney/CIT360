package cit360;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*This is going to handle all the communication
 * between model and view. This is the only component
 * that knows about the view.*/
public class Controller {

	private View theView;
	private Model theModel;

	/*This is the constructor for our model and view. It is going to 
	 * communicate to the view and the model whenever the 
	 * calculateModel button is presses and start the processing 
	 * and displaying of that information through the view
	 * and the model */
	public Controller(View theView, Model theModel ) {
	
		this.theView =theView;
		this.theModel=theModel;
		
		this.theView.addCalculateMortgageListener(new CalculateListener());
	}
	/*This is creating the constructor for the listener. This allows
	 * us to listen to what is going on with the view*/
	class CalculateListener implements ActionListener{
		/*This is where the interaction is going to happen
		 *  it is to ensure that the user enters all the 
		 * information in the text fields be for
		 * hitting the calculate button*/
		public void actionPerformed(ActionEvent arg0) {
			double price=0;
			int years=0;
			double downPayment=0;
			
		/*this gets the information that the user
		 * types in from the view*/
			try {
				price = theView.getPrice();
				years = theView.getYears();
				downPayment= theView.getDownPayment();
				/*this calls the model to perform the calculates
				 * */
				theModel.calculateMortgage(price, years, downPayment);
				/*this tells the view to set the calculation from
				 * the model.*/
				theView.setCalculateMortgage(theModel.getMortgagePayment());
				
				/*this will catch the error if the user doesn't enter a field.*/
			}catch(NumberFormatException e) {
				theView.errorMessage("Please fill in all fields");
			}
		}
	}
}

