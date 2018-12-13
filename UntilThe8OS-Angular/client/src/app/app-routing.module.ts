import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PersonaAddComponent } from './persona-add/persona-add.component';

import { PersonaEditService } from './shared/persona-edit/persona-edit.service';
import { ListaPersonaComponent } from './lista-persona/lista-persona.component';

const routes: Routes = [
  { path: 'listaContactos', component: ListaPersonaComponent },
  { path: 'altaContacto', component: PersonaAddComponent },
  { path: 'modificarContacto', component: PersonaEditService }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }