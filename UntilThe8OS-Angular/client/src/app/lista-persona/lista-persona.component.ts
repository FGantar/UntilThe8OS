import { Component, OnInit } from '@angular/core';
import { Persona } from '../model/persona.model';
import { Router } from '@angular/router';
import { PersonaService } from './persona.service';

@Component({
  selector: 'app-lista-persona',
  templateUrl: './lista-persona.component.html',
  styleUrls: ['./lista-persona.component.css']
  
})
export class ListaPersonaComponent implements OnInit {

  listaContactos: Persona[];

  constructor(private router: Router, private personaService: PersonaService) {

  }

  ngOnInit() {
    this.personaService.getContactos().subscribe(data =>{this.listaContactos=data});
  }

}
