package pk.tracker.notes;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Year {

	public Year(Integer key, Map<String, List<Note>> values) {
		name = key;
		month = values.entrySet().stream().map(x -> new Month(x.getKey(), x.getValue())).collect(Collectors.toList());
		total = values.values().stream().mapToDouble(list -> list.stream().mapToDouble(note -> note.amount).sum()).sum();
	}
	
	public Integer name;
	public Double total;
	public List<Month> month;
	
}
