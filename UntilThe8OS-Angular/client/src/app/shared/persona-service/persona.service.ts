import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Persona} from "src/app/model/persona.model";
import {Observable} from "rxjs/index";
import {ApiResponse} from "src/app/model/api.response";
  
  @Injectable()
  export class ApiService {
  
    constructor(private http: HttpClient) { }
    baseUrl: string = 'http://localhost:8080/users/';
  
    listaContactos() : Observable<ApiResponse> {
      return this.http.get<ApiResponse>(this.baseUrl);
    }
  
    vistaDetalleContacto(id: number): Observable<ApiResponse> {
      return this.http.get<ApiResponse>(this.baseUrl + id);
    }
  
    altaContacto(Persona: Persona): Observable<ApiResponse> {
      return this.http.post<ApiResponse>(this.baseUrl, Persona);
    }
  
    modificarContacto(Persona: Persona): Observable<ApiResponse> {
      return this.http.put<ApiResponse>(this.baseUrl + Persona.idpersona, Persona);
    }
  
    borrarContacto(id: number): Observable<ApiResponse> {
      return this.http.delete<ApiResponse>(this.baseUrl + id);
    }
  }