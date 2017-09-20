'''
Created on 18 Jul 2017

@author: spotnuru
'''
from cassandra.cluster import Cluster
cluster = Cluster(['127.0.0.1'])
session = cluster.connect()
session.execute("DROP KEYSPACE task;")
print("Keyspace Dropped")