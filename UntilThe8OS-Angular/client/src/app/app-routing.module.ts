import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListaPersonaComponent } from './lista-persona/lista-persona.component';
import { VistaDetalleComponent } from './persona-detalle/vista-detalle.component';
import { PersonaAddComponent } from './persona-add/persona-add.component';
import { PersonaEditComponent } from './persona-edit/persona-edit.component';

const routes: Routes = [
  { path: 'contactos', 
    component: ListaPersonaComponent},
  {path: 'detalle/:id', 
    component: VistaDetalleComponent},
  {path: 'altaContacto', 
    component: PersonaAddComponent},
    {path: 'modificarContacto', component:PersonaEditComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
