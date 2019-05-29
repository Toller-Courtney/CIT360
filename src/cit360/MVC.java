package cit360;
/*This is going to create all our object and allow
 * the program to function */
public class MVC {

	public static void main(String[] args) {
		/*this is creating the view*/
		View theView = new View();
		
		/*this is creating the model*/
		Model theModel= new Model();
		
		/*this is creating the controller wihtout this, the model
		 * cant calculate what the user enters in the view and the 
		 * view can't display the calculation from user input.*/
		Controller theController = new Controller(theView, theModel);
		
		/*This will make the view visible on the screen 
		 * the user to interact with*/
		theView.setVisible(true);		
	}
	
}
