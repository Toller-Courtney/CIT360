package cit360;

import java.util.ArrayList;
import java.util.List;

//A demonstration of Java Collections, List, Set, Map,Queue, Tree.
public class Collections {

	public static void main(String[] args) {
		/*LIST- stores a sequence of elements. All the
		 * elements can be access by position, the list
		 * starts at an index of 0 and counts up from there
		 * */
		
		 /*Create a new ArrayList. I set the type of list
		to String because I know that all the elements will
		be a String*/
		List<String>favoriteMeals = new ArrayList<>();

		//Give our list a heading 
		System.out.println("Getting to Know Courtney."
				+ "\n What are my favorite meals, you ask?");
		
		//add new elements to the ArrayList.
		favoriteMeals.add("Indian Butter Chicken");
		favoriteMeals.add("\n Chicken Tikka Masala");
		favoriteMeals.add("\n Rare Steak with a Baked Potato");
		favoriteMeals.add("\n Broccoli and Cheese Soup with warm Artisan Bread");
		
		//print the ArrayList out to the console
		System.out.println(favoriteMeals);
	}

}
