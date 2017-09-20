'''
Created on 18 Jul 2017

@author: spotnuru
'''
from cassandra.cluster import Cluster
cluster = Cluster(['127.0.0.1'])
session = cluster.connect()
session.execute("CREATE KEYSPACE IF NOT EXISTS task1 WITH REPLICATION = {'class' : 'SimpleStrategy', 'replication_factor' : 3 };")
print("Keyspace Created")