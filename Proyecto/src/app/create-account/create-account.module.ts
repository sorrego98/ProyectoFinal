import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule  } from '@angular/material/button';
import { MatCardModule  } from '@angular/material/card';
import { MatInputModule  } from '@angular/material/input';
import { CreateAccountComponent } from './create-account.component';

const routes: Routes = [
  { path: '', component: CreateAccountComponent }
];

@NgModule({
  declarations: [
    CreateAccountComponent
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
export class CreateAccountModule { }
