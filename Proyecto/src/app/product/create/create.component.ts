import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  form: FormGroup;
  error: String = '';

  constructor() {
    this.form = new FormGroup({
      typeaccount: new FormControl('', Validators.required ),
      numberaccount: new FormControl('', Validators.required ),
      dateopen: new FormControl('', Validators.required ),
      money: new FormControl('', Validators.required )
    });
   }

  ngOnInit(): void {
  }
  submit() {}

}
