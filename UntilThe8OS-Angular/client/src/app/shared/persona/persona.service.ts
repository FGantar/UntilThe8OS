import { Component, OnInit } from '@angular/core';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable()
export class PersonaService {

  public API = '//localhost:8080';
  public CONTACTO_API = this.API + '/contacto';

  constructor(private http: HttpClient) {}

 
  listaContactos(): Observable<any> {
    return this.http.get(this.API + '/contactos_VIP');
  }
  
}
