package cassandra_keyspace;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Alter_KeySpace {
   public static void main(String args[]){

      //Query
      String query = "ALTER KEYSPACE xyz WITH replication " + "= {'class':'NetworkTopologyStrategy', 'datacenter1':3}"
         + "AND DURABLE_WRITES = false;";

      //Creating Cluster object
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
   
      //Creating Session object
      Session session = cluster.connect();
 
      //Executing the query
      session.execute(query);
 
      System.out.println("Keyspace altered");
   }
}
