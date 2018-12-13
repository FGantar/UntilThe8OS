import { Component, OnInit } from '@angular/core';
import { PersonaAddService } from '../shared/persona-add/persona-add.service';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-persona-add',
  templateUrl: './persona-add.component.html',
  styleUrls: ['./persona-add.component.css']
})
export class PersonaAddComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,private router: Router, private addService: PersonaAddService) { }

  addForm: FormGroup;

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      id: [],
      nombre: ['', Validators.required],
      apellido1: ['', Validators.required],
      apellido2: ['', Validators.required],
      dni: ['', Validators.required],
      fechaNacimiento: ['', Validators.required],
      telefonos: ['', Validators.required],
      direcciones: ['', Validators.required]
    });

  }

  onSubmit() {
    this.addService.save(this.addForm.value)
      .subscribe( data => {
        this.router.navigate(['persona-list']);
      });
  }
}
