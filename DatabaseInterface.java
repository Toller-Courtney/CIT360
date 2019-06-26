package hibernatePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

/*This class is our database interface. It calls all the
 method for hibernate. it creates
*  the sessions and factories needed to communicate
* with MySQL and get the information from our list
* to be used by our hibernateExample class in modifying
* and displaying the information*/
public class DatabaseInterface {

    /*Here we are creating the session factory and
    * the sessing to put used in communicating with
    * the database*/
    SessionFactory factory= null;
    Session session = null;

    private static DatabaseInterface one_instance=null;

    private DatabaseInterface(){
        factory = Utilities.getSessionFactory();

    }
    /*This is what makes our class a singleton.
    * whenever we create a new instance of
    * databaseInterface, it doesn't actually
    * create a new instance, it just reuses the
    * instance that has already been created.
    * */
    public static DatabaseInterface getInstance(){
        if (one_instance == null){
            one_instance = new DatabaseInterface();

        }
        return one_instance;

    }
    /*Here we are getting the list of member in the
    * family*/
    public List<Family> getFamily(){
        try{
            /*Here we are opening our session with
            * the database*/
            session=factory.openSession();
            /*Here we are beginning our transaction
            * with the database*/
            session.getTransaction().begin();
            /*Here hibernate is going out to find our SQL
            * this is of direct path to the Family class*/
            String MySQL ="from hibernatePackage.Family";
            /*Here we are creating our query to the database and
            * then returning those results to us in a list
            * of family.*/
            List<Family> famSess= (List<Family>)session.createQuery(MySQL).getResultList();
            /*Here we are committing the transaction */
            session.getTransaction().commit();
            /*Here we are returning the list from the query*/
            return famSess;

            /*Here we are catching and exception that
            * may come up when the program runs.*/
        }catch(Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }finally{
            /*Here we are closing our session out when
             the program has completed.*/
            session.close();
        }

    }
}
