package cit360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*In this demonstration I will show how to use JUnit testing.*/

public class JUnit {

	/*assertEquals
	 * Here we are returning the sum of two numbers
	 * the ints will be passes in to the method and
	 * the method will return the sum.*/
	public int addNumbers(int number1, int number2) {
		return number1+number2;	
	}
	
	/*assertArrayEquals
	 * Here we are creating an ArrayList of all
	 * the cities of Skyrim. After the list is 
	 * created, we will retun the contents. */
	public List skyrimArray(){
	List<String> skyrimCities= new ArrayList<>();	
		return skyrimCities;
	}
	/*assertFalse
	 * Here we are setting up a method to be 
	 * checked my JUnit. We want to make sure that
	 * number1 is greater than number 2 and return true.if it
	 * doesn't, the method will return false*/
	public boolean greaterThan(int number1,int number2) {
		if (number1>number2){
			return true; 
		}else {
			return false;
		}
	}
	
	/*assertNotNull
	 * Here we are creating a hash map of all the
	 * Jarls(Rulers) in Skyrim and what City they
	 * ruler over. the City will be acting as the
	 * key in our hash map*/
	public String SkyrimJarl(final String key) {
		Map<String, String> SkyrimJarl=new HashMap<>();
		SkyrimJarl.put("Dawnstar","Brina Merilis");
		SkyrimJarl.put("Falkreath","Dengeir of Stuhn");
		SkyrimJarl.put("Markarth","Thongvor Silver-Blood");
		SkyrimJarl.put("Morthal","Sorli the Builder");
		SkyrimJarl.put("Riften","Maven Black-Briar");
		SkyrimJarl.put("Solitude","Elisif the Fair");
		SkyrimJarl.put("Whiterun","Vignar Gray-Mane");
		SkyrimJarl.put("Windhelm","Brunwulf Free-Winter");
		SkyrimJarl.put("Winterhold","Kraldar");
				
		return SkyrimJarl.get(key);
	}
	/*assertNotSame
	 * Here we are creating a hash map of the 
	 * courses I am taking this semester. The key 
	 * is the course code (ex. CIT360. Each course
	 * code references a different course.*/
	public String SpringCourses(final String key) {
		Map<String,String> SpringCourses=new HashMap<>();
		SpringCourses.put("CIT262","System Analysis and Design");
		SpringCourses.put("CIT270","System Security I");
		SpringCourses.put("CIT352","Operating Systems I");
		SpringCourses.put("CIT360","Object-Oriented Software Development");
	
		return SpringCourses.get(key);
	}
	/*AssertNull
	 * Here are are creating a hashmap of the courses I 
	 * will be taking in the fall. the key is the
	 * course code and each course code has a course
	 * description. */
	public String FallCourses(final String key) {
		Map<String,String> FallCourses=new HashMap<>();
		FallCourses.put("CIT261","Mobile Application Development");
		FallCourses.put("CIT353","Operating Systems II");
		FallCourses.put("CIT365",".NET Software Development");
		FallCourses.put("CIT380","Project Management");
		FallCourses.put("CIT495","Senior Practicum");
	
		return FallCourses.get(key);
	}

	/*assertTrue
	 * Here we are making sure that number one is
	 * less than number two. If is is the case then
	 * the method will return true. If number 1 is
	 * not less than number 2 then the method will
	 * return false.*/
	public boolean lessThan(int number1,int number2) {
		if (number1<number2){
			return true; 
		}else {
			return false;
		}
	}
	
}

