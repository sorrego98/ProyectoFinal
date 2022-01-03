import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConfirmComponent } from './confirm/confirm.component';
import { HistoryComponent } from './history/history.component';
import { TransferComponent } from './transfer/transfer.component';



@NgModule({
  declarations: [
    ConfirmComponent,
    HistoryComponent,
    TransferComponent
  ],
  imports: [
    CommonModule
  ]
})
export class TransferModule { }
