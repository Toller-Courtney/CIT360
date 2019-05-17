package cit360;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//Demonstration of Reading a JSON file
public class ReadJsonFile {

	public static void main(String[] args) {
		/*Here we are creating a new JSON parser which will allow us
		 * to parse the information from one format to another*/
		JSONParser parser = new JSONParser();

		try {
			/*We are going to create an object to parse our file to be read*/
			Object object= parser.parse(new FileReader("myjson.json"));
			
			/*Here we are converting the object into a JSON object*/
			JSONObject jsonObject = (JSONObject) object;
			
			/*Now we are going to get the elements that we created in 
			 * CreatJsonFile from the myjson.json file. We are going 
			 * to pull them from the keys thatwe espablished earlier and
			 * the values associated with those keys will be displayed.*/
			String name= (String)jsonObject.get("name");
			
			/*This is going to display the output to the console for 
			 * us to view for verification purposes.*/
			System.out.println("Student Name: " + name);
			
			String university = (String) jsonObject.get("university");
			System.out.println("\nUniversity Attending: " + university);
			
			/*Here we are creating a JSONArray to get the courses we created
			 * in the the CreateJsonFile. This is going to iterate through each
			 * of the elements by its key "courses" and display the values 
			 * associated with that key to the console.*/
			JSONArray coursesArray = (JSONArray) jsonObject.get("courses");
			
			/*this tells how many elements it will need to loop 
			through in our coursesArray*/
			Iterator<String> iterator = coursesArray.iterator();
			
			System.out.println("\nCourse currently Enrolled: ");
			
			/* This while statement is going to keep iterating through the
			 * file and displaying it to the console until there is nothing it 
			 * hits the end of the file.*/
			while(iterator.hasNext())
			{
				//This displays the next value in the Array
				System.out.println(iterator.next());
			}
			/* If the file we are trying to pull does not exist,
			 * this exception will be thrown to let us know that
			 * there is not file by that name.*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			/* This is going to catch any Input or Output exception
			 * that may be thrown when our program runs*/
		} catch (IOException e) {
			e.printStackTrace();
			/*If your parsing fails, this exception will be thrown
			 * this parse is going to be specific to the JSON package
			 * we downloaded.*/
		} catch (ParseException e) {
			e.printStackTrace();
			/* Is is going to catch any other exceptions that were not 
			 * caught by the exceptions above.*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
