package cassandra_table;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Batch {

   public static void main(String args[]){
    
      //query
      String query =" BEGIN BATCH INSERT INTO employee (emp_id, emp_city, emp_name, emp_phone, emp_sal) values( 4,'Bangalore','pssk',9848022331, 30000);"
    
         + "UPDATE employee SET emp_sal = 60000 WHERE emp_id =1;"
         + "DELETE emp_city FROM employee WHERE emp_id = 2;"
         + "APPLY BATCH;";

      //Creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
 
      //Creating Session object
      Session session = cluster.connect("xyz");
 
      //Executing the query
      session.execute(query);

      System.out.println("Changes done");
   }
}
