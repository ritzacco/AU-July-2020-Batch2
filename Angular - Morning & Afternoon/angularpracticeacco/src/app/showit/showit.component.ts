import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-showit',
  templateUrl: './showit.component.html',
  styleUrls: ['./showit.component.css']
})
export class ShowitComponent implements OnInit {

  @Input() childPosts: any;

  constructor() { }

  ngOnInit(): void {
  }

}
