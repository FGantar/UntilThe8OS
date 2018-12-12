import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class PersonaAddService {
  public API = '//localhost:8080';
  public PERSONA_API = this.API + '/contacto';

  constructor(private http: HttpClient) {
  }

  get(id: string) {
    return this.http.get(this.PERSONA_API + '/' + id);
  }

  save(persona: any): Observable<any> {
    let result: Observable<Object>;
    if (persona['href']) {
      result = this.http.put(persona.href, persona);
    } else {
      result = this.http.post(this.PERSONA_API, persona);
    }
    return result;
  }

  add(href: string) {
    return this.http.post;
  }
}
