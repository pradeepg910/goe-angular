package pk.tracker.storytest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import org.hamcrest.core.Is;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pk.tracker.notes.Note;
import pk.tracker.notes.NotesController;

public class NotesFeatureTest {

	private String title;
	private String body;
	@Autowired
	private NotesController controller;
	private Note actualNote;

	@Given("^Note has title (.+) and body (.+)$")
	public void note_has_title_and_body(String title, String body) throws Throwable {
	    this.title = title;
		this.body = body;
	}

	@When("^save the note$")
	public void save_the_note() throws Throwable {
	    actualNote = controller.addNote(new Note(title, body, LocalDateTime.now()));
	}

	@Then("^it should save the note with title (.+) into database$")
	public void it_should_save_the_note_with_title_into_database(String expectedTitle) throws Throwable {
		assertThat(expectedTitle, is(actualNote.title));
	}
	
}
