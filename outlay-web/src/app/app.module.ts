import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule }    from '@angular/http';


import { AppComponent }  from './app.component';
import {NotesComponent} from './notes/notes.component';
import {NotesService} from './notes/notes.service'

@NgModule({
  imports:      [ BrowserModule, HttpModule ],
  declarations: [ AppComponent, NotesComponent ],
  providers: [ NotesService ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
