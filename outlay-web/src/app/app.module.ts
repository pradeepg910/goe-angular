import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import {NotesComponent} from './notes/notes.component';

@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent, NotesComponent ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
