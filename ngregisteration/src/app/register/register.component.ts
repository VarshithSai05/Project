import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user:User=new User();
  constructor(private service:UserServiceService) { }

  ngOnInit(): void {
  }
  public registerNow():void{
    this.service.doRegister(this.user).
    subscribe(data=>
      {
        alert("New User has been added.")
      });
    
  }
}
