# HelloCassandra
Prueba de conexión a Apache Cassandra

<h3>Crear KeySpace</h3>
CREATE KEYSPACE Test WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };

<h3>Crear Tabla</h3>
USE test;
CREATE TABLE logs (
   id INT PRIMARY KEY,
   ttl TEXT,
   nivel TEXT,
   time TIMESTAMP,
   claves TEXT,
   text TEXT
);
