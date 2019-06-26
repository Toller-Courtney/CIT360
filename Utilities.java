package hibernatePackage;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/*This class contains everything that Hibernate needs to function.*/
public class Utilities {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try{

            /*This is telling hibernate where it needs to go to
            * find the configuration file we have for this project.*/
            ServiceRegistry servReg = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();

            /*Here we are setting up a new metadata source with the specification
            * from the service registry above.*/
       Metadata metadata = new MetadataSources(servReg).getMetadataBuilder().build();

       return metadata.getSessionFactoryBuilder().build();

       /*If something goes wrong with the creation of the session,
       * This will catch that and display the message.*/
        }catch(Throwable ex){
            System.err.println("Creation Failed." +ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){

        return sessionFactory;
    }

    /*This is going to close the connection pool and caches.*/
    public static void shutdown(){
        getSessionFactory().close();
    }
}
