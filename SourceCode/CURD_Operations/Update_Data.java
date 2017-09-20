package CURD_Operations;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Update_Data {
  
   public static void main(String args[]){
      
      //query
      String query = " UPDATE employee SET emp_city='srikakulam',emp_sal=50000 where emp_id=3";
          
      //Creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
         
      //Creating Session object
      Session session = cluster.connect("xyz");
         
      //Executing the query
      session.execute(query);

      System.out.println("Data updated");
   }
 }
