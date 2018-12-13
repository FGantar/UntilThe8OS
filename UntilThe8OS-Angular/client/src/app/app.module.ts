import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaPersonaComponent } from './lista-persona/lista-persona.component';
import { PersonaService } from './lista-persona/persona.service';
import { PersonaAddComponent } from './persona-add/persona-add.component';
import { PersonaEditComponent } from './persona-edit/persona-edit.component';
import { VistaDetalleComponent } from './persona-detalle/vista-detalle.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaPersonaComponent,
    PersonaAddComponent,
    PersonaEditComponent,
    VistaDetalleComponent
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [PersonaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
