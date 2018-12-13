import { Component, OnInit } from '@angular/core';
import { Persona } from '../models/persona.model';
import { ActivatedRoute } from '@angular/router';
import { PersonaService } from '../lista-persona/persona.service';
import { Location } from '@angular/common';
import { Telefono } from '../models/telefono.model';
import { Direccion } from '../models/direccion.model';


@Component({
  selector: 'app-vista-detalle',
  templateUrl: './vista-detalle.component.html',
  styleUrls: ['./vista-detalle.component.css']
})
export class VistaDetalleComponent implements OnInit {

  persona:Persona;



  constructor(private route: ActivatedRoute, private personaService: PersonaService) { }

  ngOnInit(): void {
    this.getPersona();
  }
  
  getPersona(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.personaService.getPersonaById(id)
      .subscribe(persona => this.persona = persona);
  }

}
