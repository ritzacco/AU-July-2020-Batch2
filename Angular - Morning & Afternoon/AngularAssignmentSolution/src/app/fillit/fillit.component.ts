import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-fillit',
  templateUrl: './fillit.component.html',
  styleUrls: ['./fillit.component.css']
})
export class FillitComponent {

  RFG: FormGroup;
  Info:any;
  Infolist:any[]=[];
  Content:string = '';
  FName:string = '';
  MName:string = '';
  LName:string = '';
  ReferenceNum:number = 0;
  PhoneNum:number = 0;

  constructor(private fb: FormBuilder) {

    this.RFG = fb.group({
      'FName': ['', Validators.compose([Validators.required])],
      'MName': ['', Validators.compose([Validators.required])],
      'LName': ['', Validators.compose([Validators.required])],
      'ReferenceNum': ['', Validators.required],
      'PhoneNum': ['', Validators.required],
      'Content': ['', Validators.compose([Validators.required, Validators.maxLength(100)])]
    });

  }

  update(Info) {
    this.Content = Info.Content;
    this.FName = Info.FName;
    this.MName = Info.MName;
    this.LName = Info.LName;
    this.ReferenceNum = Info.ReferenceNum;
    this.PhoneNum = Info.PhoneNum;
    this.Infolist.push(Info);
  }
}
