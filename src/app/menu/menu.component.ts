import { Component, OnInit } from '@angular/core';
import { OrderDetaolsService } from '../order-detaols.service';


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  

  constructor(private service:OrderDetaolsService) { }
  cakeData:any;
  ngOnInit(): void {
    this.cakeData = this.service.cakedetails;
  }

}