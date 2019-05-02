package cit360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

//A demonstration of Java Collections: List, Set, Map, Queue, Tree.
public class Collections {

	public static void main(String[] args) {
		/*
		 * LIST- stores a sequence of elements. All the elements can be access by
		 * position, the list starts at an index of 0 and counts up from there
		 */

		/*
		 * Create a new ArrayList. I set the type of list to String because I know that
		 * all the elements will be a String
		 */
		List<String> favoriteMeals = new ArrayList<>();

		// Give our list a heading
		System.out.println("Getting to Know Courtney." + "\nWhat are my favorite meals, you ask?");

		// add new elements to the ArrayList.
		favoriteMeals.add("Indian Butter Chicken");
		favoriteMeals.add("\n Chicken Tikka Masala");
		favoriteMeals.add("\n Rare Steak with a Baked Potato");
		favoriteMeals.add("\n Broccoli and Cheese Soup with warm Artisan Bread");

		// print the ArrayList out to the console
		System.out.println(favoriteMeals);

		// a separation between each example
		System.out.println("\n*****************************");
		
		//*********************************************************************************
		
		/*
		 * SET- duplications are not allowed in a set. A set is an unordered list of
		 * objects
		 */

		// Create a new set
		Set<Integer> importantMonths = new HashSet<>();

		// Our list needs a heading
		System.out.println("The most important months in my life");
		
		/*
		 * we are going to add the months into our Set for printing out to the console.
		 * If you notice, I put 11 in twice because 2 very important things happened in
		 * November. However, when our set is printed out, 11 is only displayed once.
		 * This is because sets do not allow duplicated elements.
		 */
		importantMonths.add(11);
		importantMonths.add(1);
		importantMonths.add(9);
		importantMonths.add(11);
		importantMonths.add(4);

		// iterate through the list and print out the set
		for (int i : importantMonths) {
			System.out.println(i);
		}

		// a separation between each example
		System.out.println("\n*****************************");
		
		//*************************************************************************************
		
		/*
		 * MAP- A map collection matches an object with a value. By doing this, you can
		 * call an object by the value (or key) associated with it. Like Set, maps can
		 * not contain duplicates.
		 */

		// Create a new map
		Map<String, Integer> placesLived = new HashMap<>();

		// We are going to give our map a heading
		System.out.println("All the different cities and zipcodes I have lived in");

		/*
		 * We are going to add the elements to our map, starting with the City and then
		 * the Zipcode. If you notice, I have 2 Yuma zipcodes. If I would have labeled
		 * both of them Yuma, only the second Yuma would have been displayed. I have to
		 * label them specific to the location in town for it to display both.
		 */
		placesLived.put("Syracuse", 84075);
		placesLived.put("Layton", 84041);
		placesLived.put("YumaFoothills", 85365);
		placesLived.put("Yuma", 85364);

		// Print out the elements to the console
		System.out.println(placesLived);

		// Heading for our key association
		System.out.println("\nZipcode");

		/*
		 * If I want to get a specific zipcode by city from this list I would call it's
		 * key. by using the command .get() it will find the key that matches exactly
		 * and output the value associated with it.
		 */
		System.out.println(placesLived.get("Yuma"));

		// a separation between each example
		System.out.println("\n*****************************");
		
		//******************************************************************************************
		
		/*
		 * QUEUE- the queue holds elements that are to be processed. We can add to and
		 * remove from a queue. The queue is a First in Last out which means if we
		 * remove from the Queue, it will remove from the beginning of the list and if
		 * we want to add to the queue, it inserts at the bottom of the queue.
		 */

		// create a new queue
		Queue<String> toDoList = new LinkedList<>();

		// As usual, Create a heading for our queue
		System.out.println("My Moving To Do List:");

		// We are going to add elements to our queue
		toDoList.add("\n Sell The House");
		toDoList.add("\n Pack boxes");
		toDoList.add("\n Load the Uhaul");
		toDoList.add("\n Drive 750 Miles");
		toDoList.add("\n Unload the Uhaul");
		toDoList.add("\n Organize");
		toDoList.add("\n Relax!");

		// Lets take a look at what the queue looks like right now
		System.out.println(toDoList);

		/*
		 * Now let's say that we want to remove the first element on the list because we
		 * sold the house, YAY! But first we have make sure that "Sell the house" is at
		 * the top of the list
		 */
		String firstElement = toDoList.peek();

		/*
		 * This will show us what is at the head of the list without removing it just
		 * yet.
		 */
		System.out.println("\n The first element is:" + firstElement);

		/*
		 * Now that we know "Sell the house" is at the top of the list we can go ahead
		 * and remove it. Remember, When something is removed, it is always taken from
		 * the top of the queue.
		 */
		String removed = toDoList.remove();
		System.out.println("\n The element removed was: " + removed);

		// let see what the list looks like now
		System.out.println("\n Updated To Do List:" + toDoList);

		/*
		 * Now we want to add a new element on the list because we forgot about
		 * homework! Remember, When we add something to the list, it is always added to
		 * the bottom of the list.
		 */
		toDoList.add("\n Don't forget about HOMEWORK!");

		/*
		 * Now let's see if the element was added to the list.
		 */
		System.out.println("\n New and improved To Do List " + toDoList);

		// a separation between each example
		System.out.println("\n*****************************");
		
		//*************************************************************************************************
		
		/*TREE- in tree, the elements are sorted by key and in ascending order by default
		 * Like Set, and Map, duplicates are not allowed in Tree*/
		
		//Create a new tree
		TreeSet <String> nationalParks=new TreeSet<>();
		
		//Let's give our Tree a heading!
		System.out.println("\n The Best National Parks");
		
		/*Now we are going to add elements to our tree. Let's say that
		 I really love Yellowstone (100% accurate!) and accidently added it to the tree
		 twice. Yellowstone will only be printed once because the .add only includes
		 elements that have not already been added.*/
		nationalParks.add("Yellowstone");
		nationalParks.add("Yosemite");
		nationalParks.add("Zion");
		nationalParks.add("Bryce Canyon");
		nationalParks.add("Grand Canyon");
		nationalParks.add("Glacier");
		nationalParks.add("Grand Teton");
		nationalParks.add("Arches");
		nationalParks.add("Denali");
		nationalParks.add("Yellowstone");
		
		/*Display the tree to the console. As you can see, all the parks
		have been listed in ascending order by Alphabet. The for each loop
		iterates through the set and prints each element out to the console 
		if it has not already been added to the list.*/
		for(String s:nationalParks) {
			System.out.println(s);
		}
		
		/*Even though I added Yellowstone twice, I really want to make sure it's
		on the list! I can use the .contains() command to make sure it is. the contains()
		will print true if the element is in the tree and false if it is not in the tree*/
		System.out.println("\n"+ nationalParks.contains("Yellowstone"));
	}
}
