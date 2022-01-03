import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConfirmComponent } from './confirm/confirm.component';
import { HistoryComponent } from './history/history.component';
import { TransferComponent } from './transfer/transfer.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule  } from '@angular/material/button';
import { MatCardModule  } from '@angular/material/card';
import { MatInputModule  } from '@angular/material/input';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  { path: 'confirm', component: ConfirmComponent },
  { path: 'history', component: HistoryComponent },
  { path: 'transfer', component: TransferComponent }
];

@NgModule({
  declarations: [
    ConfirmComponent,
    HistoryComponent,
    TransferComponent
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
export class TransferModule { }
