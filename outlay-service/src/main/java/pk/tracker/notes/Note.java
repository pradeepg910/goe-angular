package pk.tracker.notes;

import java.time.LocalDateTime;

import com.datastax.driver.mapping.annotations.Table;
import com.datastax.driver.mapping.annotations.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "notes")
public class Note {

	public String title;
	public String body;
	public String timestamp = LocalDateTime.now().toString();

	public Note() {
	}

	public Note(String title, String body, LocalDateTime dateTime) {
		this.title = title;
		this.body = body;
		this.timestamp = dateTime.toString();
	}

	@JsonIgnore
	@Transient
	public String getMonth() {
		return LocalDateTime.parse(timestamp).getMonth().toString();
	}

	@JsonIgnore
	@Transient
	public int getYear() {
		return LocalDateTime.parse(timestamp).getYear();
	}

}
