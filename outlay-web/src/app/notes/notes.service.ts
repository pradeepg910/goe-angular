import { Injectable } from '@angular/core';
import { Http }       from '@angular/http';
import {Note} from './note'
import 'rxjs/add/operator/toPromise';

@Injectable()
export class NotesService {

  constructor(private http: Http) { }
  retrieveNotes() : Promise<Note[]> {
  //  return ["Notes1", "Notes3"];
  return  this.http.get("http://localhost:8080/retrieveAll")
              .toPromise()
              //  response.json().data as Note[]
              .then(response => response.json() as Note[])
              .catch(this.handleError);

  }

  private handleError(error: any): Promise<any> {
  console.error('An error occurred', error); // for demo purposes only
  return Promise.reject(error.message || error);
}
}
