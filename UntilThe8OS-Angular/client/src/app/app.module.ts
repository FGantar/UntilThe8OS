import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonaEditComponent } from './persona-edit/persona-edit.component';
import { PersonaListComponent } from './persona-list/persona-list.component';
import { SharedComponent } from './shared/shared.component';
import { PersonaService } from './shared/persona/persona.service';
import { VistaDetalleComponent } from './persona-detalle/vista-detalle.component';
import { PersonaAddComponent } from './persona-add/persona-add.component';
import { PersonaService } from './shared/persona/persona.service';

@NgModule({
  declarations: [
    AppComponent,
    PersonaService,
    PersonaEditComponent,
    PersonaListComponent,
    SharedComponent,
    PersonaListComponent,
    PersonaService,
    VistaDetalleComponent,
    PersonaAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
