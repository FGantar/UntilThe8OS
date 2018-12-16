import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router, ActivatedRoute} from "@angular/router";
import { Persona } from '../models/persona.model';
import { PersonaService } from '../lista-persona/persona.service';


@Component({
  selector: 'app-persona-edit',
  templateUrl: './persona-edit.component.html',
  styleUrls: []
})
export class PersonaEditComponent implements OnInit {

  persona: Persona;
  editForm: FormGroup;
  constructor(private route: ActivatedRoute, private formBuilder: FormBuilder,private router: Router, private personaService: PersonaService) { }

  ngOnInit() {
    this.getPersona();
    
    this.editForm = this.formBuilder.group({
      id: [this.persona.id],
      nombre: ['', Validators.required],
      apellido1: ['', Validators.required],
      apellido2: ['', Validators.required],
      dni: ['', Validators.required],
      fechaNacimiento: ['', Validators.required],
    });
    this.editForm.controls['id'].setValue(this.persona.id,this.persona)
  

  }

  getPersona(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.personaService.getPersonaById(id)
      .subscribe(persona => this.persona = persona);
  }

  onSubmit() {
    this.personaService.modificarContacto(this.editForm.value)
      .subscribe( data => {
        this.router.navigate(['contactos']);
      });
  }

}
