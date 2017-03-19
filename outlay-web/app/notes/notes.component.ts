import {Component} from 'angular2/core'
import {NotesService} from './notes.service'
@Component({
  selector: 'notes',
  template: `
        <h2>Notes</h2>
        {{title}}
        <ul>
          <li *ngFor="#note of notes">
            {{note}}
          </li>
        </ul>
        `,
    providers: [NotesService]
})
export class NotesComponent {

notes;

constructor(notesService: NotesService) {
  this.notes = notesService.retrieveNotes();
}

  title = "This is title";

}
