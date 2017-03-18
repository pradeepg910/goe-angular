package pk.tracker.notes;

import java.util.List;

import org.springframework.stereotype.Component;

import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.datastax.driver.mapping.Result;

import pk.tracker.db.ConnectionFactory;

@Component
public class NotesService {

	private Mapper<Note> mapper;
	private Session session;
	
	
	public NotesService() {
		MappingManager mappingManager = ConnectionFactory.getMappingManager();
		session = mappingManager.getSession();
		mapper = mappingManager.mapper(Note.class);
	}

	public Note save(Note note) {
		mapper.save(note);
		return note;
	}
	
	public Note retrieve(String title) {
		return mapper.get(title);
	}
	
	public List<Note> retrieveAll() {
		Result<Note> map = mapper.map(session.execute("select * from notes"));
		return map.all();
	}
	
}
