import {Component} from 'angular2/core';
import {NotesComponent} from './notes/notes.component';

@Component({
    selector: 'my-app',
    template: '<h1>Outlay-Tracker</h1><notes></notes>',
    directives: [NotesComponent]
})
export class AppComponent { }
