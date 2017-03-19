import {Component, OnInit} from '@angular/core'

import {NotesService} from './notes.service'
import {Note} from './note'
@Component({
  selector: 'notes',
  template: `
        <h2>Notes</h2>
        {{title}}
        <ul>
          <li *ngFor="let note of notes">
            Title: {{note.title}} Body: {{note.body}}
          </li>
        </ul>
        `
})
export class NotesComponent implements OnInit{

notes: Note[];

constructor(private notesService: NotesService) {}

  title = "This is title";

  getHeroes(): void {
    this.notesService.retrieveNotes().then(notes => this.notes = notes);
  }

  ngOnInit(): void {
      this.getHeroes();
  }

}
