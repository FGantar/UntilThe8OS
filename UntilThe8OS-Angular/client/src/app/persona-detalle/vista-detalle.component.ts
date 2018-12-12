import { Component, OnInit } from '@angular/core';
import { Persona } from '../model/persona.model';
import {Router} from "@angular/router";
import { PersonaEditService } from '../shared/persona-edit/persona-edit.service';

@Component({
  selector: 'app-vista-detalle',
  templateUrl: './vista-detalle.component.html',
  styleUrls: []
})
export class VistaDetalleComponent implements OnInit {

  persona:Persona;

  constructor(private router: Router, private editService: PersonaEditService) { }

  ngOnInit() {
    let idpersona=window.localStorage.getItem("idpersona");
    this.editService.get(idpersona).subscribe(data => {this.persona=data})
  }

}
