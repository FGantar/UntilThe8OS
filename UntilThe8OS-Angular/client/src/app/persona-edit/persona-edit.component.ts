import { Component, OnInit } from '@angular/core';
import { PersonaEditService } from '../shared/persona-edit/persona-edit.service';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import { Persona } from '../model/persona.model';

@Component({
  selector: 'app-persona-edit',
  templateUrl: './persona-edit.component.html',
  styleUrls: []
})
export class PersonaEditComponent implements OnInit {

  persona: Persona;
  editForm: FormGroup;
  constructor(private formBuilder: FormBuilder,private router: Router, private editService: PersonaEditService) { }

  ngOnInit() {
    let personaId = window.localStorage.getItem("editPersonaId");
    if(!personaId) {
      alert("Invalid action.")
      this.router.navigate(['persona-list']);
      return;
    }
    this.editForm = this.formBuilder.group({
      id: [],
      nombre: ['', Validators.required],
      apellido1: ['', Validators.required],
      apellido2: ['', Validators.required],
      dni: ['', Validators.required],
      fechaNacimiento: ['', Validators.required],
      telefonos: ['', Validators.required],
      direcciones: ['', Validators.required]
    });
    this.editService.get(+personaId)
      .subscribe( data => {
        this.editForm.setValue(data.result);
      });
  }

  onSubmit() {
    this.editService.updatePersona(this.editForm.value)
      .pipe(first())
      .subscribe(
        data => {
          if(data.status === 200) {
            alert('User updated successfully.');
            this.router.navigate(['list-user']);
          }else {
            alert(data.message);
          }
        },
        error => {
          alert(error);
        });
  }

}
