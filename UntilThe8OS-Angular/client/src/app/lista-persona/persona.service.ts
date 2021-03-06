import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Persona } from '../models/persona.model';
import { Observable } from 'rxjs';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class PersonaService {

  constructor(private http:HttpClient) {}

  private personaUrl = 'http://localhost:8080/contacto';

  public getContactos(): Observable<any> {
    return this.http.get<Persona[]>(this.personaUrl);
  }

  public getPersonaById(id: number): Observable<Persona> {
    const urlPersona = `${this.personaUrl}/${id}`;
    return this.http.get<Persona>(urlPersona);
  }

  public borrarPersona(id:number) {
    const urlPersona = `${this.personaUrl}/${id}`;
    return this.http.delete(urlPersona);
  }

  public altaContacto(persona) {
    return this.http.post<Persona>(this.personaUrl, persona);
  }

  public modificarContacto(persona){
    return this.http.put<Persona>(this.personaUrl, persona)
  }
}
