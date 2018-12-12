import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PersonaAddComponent } from './persona-add/persona-add.component';
import { PersonaListComponent } from './persona-list/persona-list.component';
import { PersonaEditService } from './shared/persona-edit/persona-edit.service';

const routes: Routes = [
  { path: 'listaContactos', component: PersonaListComponent },
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