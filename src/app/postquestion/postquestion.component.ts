import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../question.service';
import { Question } from './Question';

@Component({
  selector: 'app-postquestion',
  templateUrl: './postquestion.component.html',
  styleUrls: ['./postquestion.component.css']
})
export class PostquestionComponent implements OnInit {
  question : Question = new Question();
  constructor(private quetionService : QuestionService) { }

  ngOnInit(): void {
  }

  addQuestion(): void{
    this.quetionService.addQuestion(this.question)
    .subscribe(responseData=>{
      alert("Quetion added...")
    });
  }
}
