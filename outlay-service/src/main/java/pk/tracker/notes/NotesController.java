package pk.tracker.notes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value="*")
public class NotesController {

	@Autowired
	NotesService service;
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public Note addNote(@RequestBody Note note) {
		return service.add(note);
	}
	
	@RequestMapping(value = "retrieveAll")
	public List<Note> retrieveAll() {
		return service.retrieveAll();
	}
	
	@RequestMapping(value = "notes")
	public Map<Integer, Map<String, List<Note>>> map() {
		return new NotesMonthYearMapper().map(service.retrieveAll());
	}
}
