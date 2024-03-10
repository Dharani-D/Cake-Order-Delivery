import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderDetaolsService {

  constructor() { }

  cakedetails = [
    {
      id:1,
      cakeName:"Red Velvet",
      cakeDetails:"1kg.",
      cakePrice:1200,
      cakeImg:"https://tse2.mm.bing.net/th?id=OIP.W9jyztCbk6km1CJjK2-oVAHaE8&pid=Api&P=0&h=180"
    },
    {
      id:2,
      cakeName:"PipeApple Upside down",
      cakeDetails:"1Kg",
      cakePrice:800,
      cakeImg:"https://www.tastingtable.com/img/gallery/30-types-of-cake-explained/pineapple-upside-down-cake-1658850950.webp"
    },
    {
      id:3,
      cakeName:"Black Forest",
      cakeDetails:"1kg-OfferPrice",
      cakePrice:400,
      cakeImg:"https://www.tastingtable.com/img/gallery/30-types-of-cake-explained/black-forest-cake-1658850950.webp"
    },
    {
      id:4,
      cakeName:"Coffee Cake",
      cakeDetails:"1kg",
      cakePrice:250,
      cakeImg:"https://www.tastingtable.com/img/gallery/30-types-of-cake-explained/coffee-cake-1658850950.webp"
    },
    {
      id:5,
      cakeName:"Strawberry",
      cakeDetails:"1kg",
      cakePrice:600,
      cakeImg:"https://www.tastingtable.com/img/gallery/30-types-of-cake-explained/intro-1658850950.webp"
    },
    {
      id:6,
      cakeName:"Oreo  Ice Cream",
      cakeDetails:"2kg",
      cakePrice:500,
      cakeImg:"https://www.tastingtable.com/img/gallery/30-types-of-cake-explained/icebox-cake-1658855410.webp"
    }
  ]


  

}
  

