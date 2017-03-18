package pk.tracker.notes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

	@Autowired
	NotesService service;
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public Note saveNote(@RequestBody Note note) {
		return service.save(note);
	}
	
	@RequestMapping(value = "retrieveAll")
	public List<Note> retrieveAll() {
		return service.retrieveAll();
	}
	
	
}
