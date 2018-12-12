import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonaEditComponent } from './persona-edit/persona-edit.component';
import { HolaComponent } from './hola/hola.component';
import { AdiosComponent } from './adios/adios.component';
import { PersonaListComponent } from './persona-list/persona-list.component';
import { SharedComponent } from './shared/shared.component';
import { PersonaComponent } from './shared/persona/persona.service';
import { PersonaAddComponent } from './persona-add/persona-add.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonaEditComponent,
    HolaComponent,
    AdiosComponent,
    PersonaListComponent,
    SharedComponent,
    PersonaComponent,
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
