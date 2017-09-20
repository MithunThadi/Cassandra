package cassandra_table;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Create_Index {
 
   public static void main(String args[]){

      //Query
      String query = "CREATE INDEX name ON employee (emp_name);";
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
       
      //Creating Session object
      Session session = cluster.connect("xyz");
 
      //Executing the query
      session.execute(query);
      System.out.println("Index created");
   }
}