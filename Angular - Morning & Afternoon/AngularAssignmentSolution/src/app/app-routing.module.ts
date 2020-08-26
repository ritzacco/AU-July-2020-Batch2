import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FillitComponent } from "./fillit/fillit.component";
import { LetusstudyComponent } from "./letusstudy/letusstudy.component";
const routes: Routes = [
  {path: 'fillit', component: FillitComponent},
  {path: 'letusstudy', component: LetusstudyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
