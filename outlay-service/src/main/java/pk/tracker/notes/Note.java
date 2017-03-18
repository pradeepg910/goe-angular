package pk.tracker.notes;

import com.datastax.driver.mapping.annotations.Table;

@Table(name = "notes")
public class Note {

	public String title;
	public String body;

	public Note() {}
	
	public Note(String title, String body) {
		this.title = title;
		this.body = body;
	}

}
