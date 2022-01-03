import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {

  form: FormGroup;
  error: String = '';

  constructor() {
    this.form = new FormGroup({
      name: new FormControl('', Validators.required ),
      lastname: new FormControl('', Validators.required ),
      typedocument: new FormControl('', Validators.required ),
      numberdocument: new FormControl('', Validators.required ),
      borndate: new FormControl('', Validators.required ),
      creationday: new FormControl('', Validators.required )
    });
   }

  ngOnInit(): void {
  }
  submit() {}

}
