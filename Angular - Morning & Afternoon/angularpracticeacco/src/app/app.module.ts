import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { FillitComponent } from './fillit/fillit.component';
import { ShowitComponent } from './showit/showit.component';
import { LetusstudyComponent } from './letusstudy/letusstudy.component';

@NgModule({
  declarations: [
    AppComponent,
    FillitComponent,
    ShowitComponent,
    LetusstudyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
