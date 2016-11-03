# HelloCassandra
Prueba de conexión a Apache Cassandra

<h3>Crear KeySpace</h3>
CREATE KEYSPACE Test WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };
