import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[] = [];

  constructor(private UserService:UserService) { }

  ngOnInit(): void {
    
    this.UserService.getUsers().subscribe((data: User[]) => {
      console.log(data);
      this.users = data;
    });
  }

}
