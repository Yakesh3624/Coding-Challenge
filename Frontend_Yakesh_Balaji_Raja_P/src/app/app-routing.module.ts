import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddplayerComponent } from './components/addplayer/addplayer.component';
import { UpdateplayerComponent } from './components/updateplayer/updateplayer.component';
import { ViewComponent } from './components/view/view.component';

const routes: Routes = [

        {path:"home", component:DashboardComponent},
        {path:"add",component:AddplayerComponent},
        {path:"update",component:UpdateplayerComponent},
        {path:"view",component:ViewComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
