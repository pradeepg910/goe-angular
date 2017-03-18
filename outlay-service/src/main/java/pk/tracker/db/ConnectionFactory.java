package pk.tracker.db;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.MappingManager;

public class ConnectionFactory {

	private static MappingManager mappingManager;

	public static MappingManager getMappingManager() {
		if(mappingManager == null) {
			Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
			Session session = cluster.connect("outlay_tracker");
			mappingManager = new MappingManager(session);
		}
		return mappingManager;
	}

}
