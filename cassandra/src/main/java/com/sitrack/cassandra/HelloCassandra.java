package com.sitrack.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 * Hello Cassandra!
 *
 */
public class HelloCassandra {
	public static void main(String[] args) {
		Cluster cluster = null;
		try {
			cluster = Cluster.builder()
						.addContactPoint("127.0.0.1")
							.build();
			Session session = cluster.connect();

			ResultSet rs = session.execute("SELECT cluster_name, listen_address FROM system.local;");
			Row row = rs.one();
			System.out.println(
					"Cluster name: "+row.getString("cluster_name")
					+"\nListen Address: "+row.getInet("listen_address").toString());
		} finally {
			if (cluster != null)
				cluster.close();
		}

	}
}
