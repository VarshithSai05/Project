import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Question } from './postquestion/Question';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {
  urlToAddQuetion : string ="http://localhost:8080/question/2";
  constructor(private theHttpClient : HttpClient ) { }


public addQuestion(question : Question){
  return this.theHttpClient.post<Question>(this.urlToAddQuetion,question);
  }
}