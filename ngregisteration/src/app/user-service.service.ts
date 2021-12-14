import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { User } from './User';
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  urlToRegister:string="http://localhost:8081/register"
  urlToLogin!:string;
  
  constructor(private http:HttpClient) { }

  public doRegister(user:User){
    return this.http.post<User>(this.urlToRegister,user);
  }

  public doLogin(user:User){
    this.urlToLogin="http://localhost:8081/login";
    return this.http.post<User>(this.urlToLogin,user);
  }
}
