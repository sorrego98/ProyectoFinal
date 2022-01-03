import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateComponent } from './create/create.component';
import { DetailComponent } from './detail/detail.component';
import { ListComponent } from './list/list.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule  } from '@angular/material/button';
import { MatCardModule  } from '@angular/material/card';
import { MatInputModule  } from '@angular/material/input';
import { Routes, RouterModule } from '@angular/router';



const routes: Routes = [
  { path: 'create', component: CreateComponent },
  { path: 'list', component: ListComponent },
  { path: 'detail', component: DetailComponent }
];

@NgModule({
  declarations: [
    CreateComponent,
    DetailComponent,
    ListComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    ReactiveFormsModule,
    MatCardModule,
    MatInputModule,
    MatButtonModule
  ]
})
export class ProductModule { }
