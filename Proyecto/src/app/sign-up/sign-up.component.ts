import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  form: FormGroup;
  error: String = '';

  constructor() {
    this.form = new FormGroup({
      email: new FormControl('', Validators.email ),
      username: new FormControl('', Validators.required ),
      password: new FormControl('', Validators.required )
    });
  }

  ngOnInit(): void {
  }

  submit() {
    return false;
  }

}
