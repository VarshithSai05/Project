import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user= new User();
  message="";
  constructor(private _service:RegisterService,private _router:Router) { }

  ngOnInit(): void {
  }

  loginUser(){
    this._service.loginUserFromRemote(this.user).subscribe(
      data=>{
        console.log("Response recieved")
        this._router.navigate(['/loginSuccess'])
      },
      error=>{
        console.log("Error logging you in")
        this.message="Bad Credentials,Please enter valid email id and password."
      }
      
    );
  }
}
