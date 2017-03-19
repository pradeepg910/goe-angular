import {Component} from '@angular/core'
import {NotesService} from './notes.service'

@Component({
  selector: 'notes',
  template: `
        <h2>Notes</h2>
        {{title}}
        <ul>
          <li *ngFor="let note of notes">
            {{note}}
          </li>
        </ul>
        `,
    providers: [NotesService]
})
export class NotesComponent {

notes: string[];

constructor(notesService: NotesService) {
  this.notes = notesService.retrieveNotes();
}

  title = "This is title";

}
