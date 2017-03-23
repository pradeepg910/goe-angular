package pk.tracker.notes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import org.junit.Test;

public class NoteTest {

	@Test
	public void getMonth() throws Exception {
		String expected = "MARCH";
		Note note = new Note();
		note.timestamp = LocalDateTime.now().toString();
		assertThat(expected, is(note.getMonth()));
	}
	
	@Test
	public void getYear() throws Exception {
		int expected = 2017;
		Note note = new Note();
		note.timestamp = LocalDateTime.now().toString();
		assertThat(expected, is(note.getYear()));
	}
}
