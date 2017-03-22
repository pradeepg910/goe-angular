import {Component, OnInit} from '@angular/core'

import {NotesService} from './notes.service'
import {Note} from './note'
@Component({
  selector: 'notes',
  templateUrl: './app/notes/notes.component.html',
  styleUrls: [ './app/notes/notes.component.css' ]
})
export class NotesComponent implements OnInit{

notes: Note[];

constructor(private notesService: NotesService) {}

  title = "This is title";

  getNotes(): void {
    this.notesService.retrieveNotes().then(notes => this.notes = notes);
  }

  ngOnInit(): void {
      this.getNotes();
  }

}
