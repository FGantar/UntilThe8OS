import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonaEditComponent } from './persona-edit/persona-edit.component';

import { SharedComponent } from './shared/shared.component';

import { VistaDetalleComponent } from './persona-detalle/vista-detalle.component';
import { PersonaAddComponent } from './persona-add/persona-add.component';
import { ListaPersonaComponent } from './lista-persona/lista-persona.component';
import { PersonaService } from './lista-persona/persona.service';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    ListaPersonaComponent,
    PersonaEditComponent,
    
    SharedComponent,
    
    
    VistaDetalleComponent,
    PersonaAddComponent
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
