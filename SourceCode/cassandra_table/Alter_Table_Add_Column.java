package cassandra_table;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Alter_Table_Add_Column {

   public static void main(String args[]){

      //Query
      String query = "ALTER TABLE employee ADD emp_email text";//Here I want to add a column

      //Creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
     
      //Creating Session object
      Session session = cluster.connect("xyz");
    
      //Executing the query
      session.execute(query);
  
      System.out.println("Column added");
   }
}