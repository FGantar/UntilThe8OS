import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router, ActivatedRoute} from "@angular/router";
import { Persona } from '../models/persona.model';
import { PersonaService } from '../lista-persona/persona.service';
import { Telefono } from '../models/telefono.model';
import { Direccion } from '../models/direccion.model';

@Component({
  selector: 'app-persona-edit',
  templateUrl: './persona-edit.component.html',
  styleUrls: []
})
export class PersonaEditComponent implements OnInit {

  persona: Persona;
  telefonos: Telefono[];
  direcciones: Direccion[];
  editForm: FormGroup;
  constructor(private route: ActivatedRoute, private formBuilder: FormBuilder,private router: Router, private personaService: PersonaService) { }

  ngOnInit() {
    this.getPersona();
    this.editForm = this.formBuilder.group({
      id: [''],
      nombre: ['', Validators.required],
      apellido1: ['', Validators.required],
      apellido2: ['', Validators.required],
      dni: ['', Validators.required],
      fechaNacimiento: ['', Validators.required],
    });
  

  }

  getPersona(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.personaService.getPersonaById(id)
      .subscribe(persona => this.persona = persona,);
  }

  onSubmit() {
    this.personaService.modificarContacto(this.editForm.value)
      .subscribe( data => {
        this.router.navigate(['contactos']);
      });
  }

}
