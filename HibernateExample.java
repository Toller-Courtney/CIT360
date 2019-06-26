package hibernatePackage;

/*This class is used to run our hibernate
* program. This is where we can put
* everything we want to add, delete,
* and display from our database to the
* console.*/
import java.util.*;
public class HibernateExample {
    public static void main (String[] args){
        /*Here we are greating a new instance of
        * the database interface. This is what
        * will pull the information we need from
        * the database.*/
        DatabaseInterface dbi= DatabaseInterface.getInstance();

        /*This is looping through my list and
        * the displaying the contents of the
        * table to the console.*/
        List<Family> family = dbi.getFamily();
        for(Family i:family){
            System.out.println(i);
        }


    }
}
