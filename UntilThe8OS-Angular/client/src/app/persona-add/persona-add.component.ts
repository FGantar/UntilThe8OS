import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import { Persona } from '../models/persona.model';
import { PersonaService } from '../lista-persona/persona.service';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-persona-add',
  templateUrl: './persona-add.component.html',
  styleUrls: ['./persona-add.component.css']
})
export class PersonaAddComponent implements OnInit{
  
  persona: Persona = new Persona();
  addForm: FormGroup;

  constructor(private formBuilder: FormBuilder,private router: Router, private personaService: PersonaService) { }

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      id: [],
      nombre: ['', Validators.required],
      apellido1: ['', Validators.required],
      apellido2: ['', Validators.required],
      dni: ['', Validators.required],
      fechaNacimiento: ['', Validators.required]
    });

  }

  onSubmit() {
    this.personaService.altaContacto(this.addForm.value)
      .subscribe( data => {
        this.router.navigate(['contactos']);
      });
  }

}
