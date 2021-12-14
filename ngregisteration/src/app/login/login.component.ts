import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { UserServiceService } from '../user-service.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User=new User();
  message!:String;
  uId!:Number;

  constructor(private service:UserServiceService) { }

  ngOnInit(): void {
  }
  public loginNow():void{
    this.service.doLogin(this.user).
    subscribe(data=>{
      this.message=data.userName,
      this.uId=data.userId

    });
  }

}
