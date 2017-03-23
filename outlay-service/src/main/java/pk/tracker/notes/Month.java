package pk.tracker.notes;

import java.util.List;

public class Month {

	public Month(String key, List<Note> value) {
		name = key;
		notes = value;
		total = value.stream().mapToDouble(note -> note.amount).sum();
	}
	public Double total;
	public List<Note> notes;
	public String name;
	
}
