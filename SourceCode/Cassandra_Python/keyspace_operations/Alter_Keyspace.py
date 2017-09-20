'''
Created on 18 Jul 2017

@author: spotnuru
'''
from cassandra.cluster import Cluster
cluster = Cluster(['127.0.0.1'])
session = cluster.connect()
session.execute("ALTER KEYSPACE task1 WITH REPLICATION = {'class' : 'NetworkTopologyStrategy', 'datacenter' : 4 };")
print("Keyspace Altered")