import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaPersonaComponent } from './lista-persona/lista-persona.component';
import { PersonaService } from './lista-persona/persona.service';
import { VistaDetalleComponent } from './persona-detalle/vista-detalle.component';
import { FilterPipe } from './lista-persona/filter.pipe';
import { PersonaAddComponent } from './persona-add/persona-add.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { PersonaEditComponent } from './persona-edit/persona-edit.component';


@NgModule({
  declarations: [
    AppComponent,
    ListaPersonaComponent,
    VistaDetalleComponent,
    PersonaAddComponent,
    PersonaEditComponent,
    FilterPipe
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [PersonaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
