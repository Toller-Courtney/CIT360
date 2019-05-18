package cit360;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/* Demonstration of Creating a JSON file
 * In order to begin using JSON with Java, we have
 * to first download t he JSON library. I used the
 *json-simple-1.1.jar.
 */
public class CreateJsonFile {
	
	public static void main(String[] args) {
		//We will create a JSON Object
		JSONObject object= new JSONObject();
		/* We are going to create an Object of JSON and add information
		into our object. In this example we are going to create a student
		transcript with the students name and the university they are attending
		This object takes a key and a value. The key in this case in name and
		university. These will be used later when we read the JSON file.*/
		object.put("name", "Toller, Courtney");
		object.put("university", "BYU-Idaho Online");
		
		/* Here we are creating a new JSON Array to hold all the courses this 
		 * student is taking.*/
		JSONArray list= new JSONArray();
		
		/*We are going to add all the course that I am taking this semester 
		 * to our JSON Array */
		list.add("CIT 360: Object Oriented Software Development");
		list.add("CIT 352: Operating Systems I");
		list.add("CIT 270: System Security I");
		list.add("CIT 262: System Analysis and Design");
		
		/*Here we are putting the JSON Array into our object that we created above
		 * we are giving it a key of "courses" and the values is our JSONArray list, "list" */
		object.put("courses", list);
		
		/*Here we are going to create a new file writer to send all our Object
		 * data to for use and storage later. the file we want our JSON information
		 * to be sent to is myjson.json.*/
		try(FileWriter file =new FileWriter("myjson.json"))
		{
			/*when the file is created successfully, we are going to use
			 * the file writer object that we just created above to write 
			 * using toString() to the file "myjson.json" */
			file.write(object.toString());
			
			/* This will move all the information we have just written, 
			to the file, or "flush it to the file.*/
			file.flush();
		}
		/*This is going to catch any Input/Output Exception that may be 
		 * be thrown when the our program runs.*/
		catch(IOException e)
		{
			/*if the exception is thrown, this will print out the error and
			 * the details about the error in order to fix it.*/
			e.printStackTrace();
		}
		/*All of Array information is being sent to the file we indicated above
		 * however, to ensure that it is saving the info like we want it to,
		 * this will print out our object to the console for verification 
		 * purposes.*/
		System.out.println(object);
	}

}
