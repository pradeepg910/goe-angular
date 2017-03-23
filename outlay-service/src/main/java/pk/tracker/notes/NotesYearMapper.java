package pk.tracker.notes;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NotesYearMapper {

	public Map<Integer, Map<String, List<Note>>> map(List<Note> notes) {
		return notes.stream().collect(groupingBy(Note::getYear, groupingBy(Note::getMonth)));
	}
	
	public List<Year> groupBy(List<Note> notes) {
		return map(notes).entrySet().stream().map(x -> new Year(x.getKey(), x.getValue())).collect(Collectors.toList());
	}

}
