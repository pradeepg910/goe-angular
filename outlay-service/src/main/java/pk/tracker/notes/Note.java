package pk.tracker.notes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

import com.datastax.driver.mapping.annotations.Table;
import com.datastax.driver.mapping.annotations.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "notes")
public class Note {

	public String title;
	public String body;
	public double amount;
	public String timestamp = (LocalDateTime.now()).toString();

	public Note() {
	}

	public Note(String title, String body, double amount, LocalDateTime dateTime) {
		this.title = title;
		this.body = body;
		this.amount = amount;
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
