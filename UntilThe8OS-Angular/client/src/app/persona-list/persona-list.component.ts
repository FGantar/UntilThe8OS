import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Persona } from '../model/persona.model';
import { PersonaService } from '../shared/persona/persona.service';

@Component({
  selector: 'app-persona-list',
  templateUrl: './persona-list.component.html',
  styleUrls: []
})
export class PersonaListComponent implements OnInit {

  contactos: Persona[];

  constructor(private router: Router, private personaService: PersonaService) {

  }

  ngOnInit() {
    this.personaService.listaContactos().subscribe(data =>{this.contactos=data});
  }

}
