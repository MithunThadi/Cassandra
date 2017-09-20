package CURD_Operations;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Create_Data {

   public static void main(String args[]){

      //queries
      String query1 = "INSERT INTO employee (emp_id, emp_name, emp_city, emp_phone,  emp_sal)"
		
         + " VALUES(1,'siva', 'sklm', 9848022338, 50000);" ;
                             
      String query2 = "INSERT INTO employee (emp_id, emp_name, emp_city, emp_phone, emp_sal)"
      
         + " VALUES(2,'sampath', 'vizag', 9848022339, 40000);" ;
                             
      String query3 = "INSERT INTO employee (emp_id, emp_name, emp_city, emp_phone, emp_sal)"
       
         + " VALUES(3,'kumar', 'hyderabad', 9848022330, 45000);" ;

      //Creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
 
      //Creating Session object
      Session session = cluster.connect("xyz");
       
      //Executing the query
      session.execute(query1);
        
      session.execute(query2);
        
      session.execute(query3);
        
      System.out.println("Data created");
   }
}
