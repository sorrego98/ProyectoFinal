import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css']
})
export class TransferComponent implements OnInit {

  form: FormGroup;
  error: String = '';

  constructor() {
    this.form = new FormGroup({
      typetransfer: new FormControl('', Validators.required ),
      sendaccount: new FormControl('', Validators.required ),
      getaccount: new FormControl('', Validators.required ),
      money: new FormControl('', Validators.required )
    });
  }


  ngOnInit(): void {
  }
  submit() {}


}
