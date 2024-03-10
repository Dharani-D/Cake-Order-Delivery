import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-menupage',
  templateUrl: './menupage.component.html',
  styleUrls: ['./menupage.component.css']
})
export class MenuPageComponent {

  name: string = "";
  email: string = "";
  phone: string = "";
  address: string = "";
  type: string = "";
  qty: string = "";
 
  constructor(private http:HttpClient){

  }

  
  register() {
    if (this.name&&this.email&&this.phone&&this.address&&this.type&&this.qty) {
      let bodyData = {
        "name": this.name,
        "email": this.email,
        "phone": this.phone,
        "address": this.address,
        "type": this.type,
        "qty": this.qty,
      };

      this.http.post("http://localhost:8086/api/v1/cakeEntity/save", bodyData)
        .subscribe((resultData: any) => {
          window.alert(resultData.message);
          alert("order Registered Successfully");

    
          this.name = '';
          this.email = '';
          this.phone = '';
          this.address = '';
          this.type = '';
          this.qty = '';
        });
    } else {
      alert("Please fill in all the fields");
    }
  }
 save(){
     this.register();
 }
}
