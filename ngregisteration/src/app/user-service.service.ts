import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { User } from './User';
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  urlToRegister:string="http://localhost:8081/register"
  constructor(private http:HttpClient) { }

  public doRegister(user:User){
    return this.http.post<User>(this.urlToRegister,user);
  }
}
