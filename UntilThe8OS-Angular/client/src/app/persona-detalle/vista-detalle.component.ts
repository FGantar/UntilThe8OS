import { Component, OnInit } from '@angular/core';
import { Persona } from '../models/persona.model';
import { ActivatedRoute } from '@angular/router';
import { PersonaService } from '../lista-persona/persona.service';

@Component({
  selector: 'app-vista-detalle',
  templateUrl: './vista-detalle.component.html',
  styleUrls: ['./vista-detalle.component.css']
})
export class VistaDetalleComponent implements OnInit {

  persona: Persona;

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
