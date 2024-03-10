import { Component, OnInit } from '@angular/core';
import { OrderDetaolsService } from '../order-detaols.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  constructor(private service:OrderDetaolsService){}
cakedata: any;

ngOnInit(): void {
  this.cakedata=this.service.cakedetails;

  

}
}

