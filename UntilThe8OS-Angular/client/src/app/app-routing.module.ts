import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListaPersonaComponent } from './lista-persona/lista-persona.component';
import { VistaDetalleComponent } from './persona-detalle/vista-detalle.component';

const routes: Routes = [
  { path: 'contactos', 
    component: ListaPersonaComponent},
  {path: 'detalle/:id', 
    component: VistaDetalleComponent}
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