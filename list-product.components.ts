import { Component } from '@angular/core';
import { ProductService } from 'src/app/product-service';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';

@Component({

    selector:'list-product',
    templateUrl:'list-product.component.html'
})

export class ListProductComponent implements OnInit{

products : ListProductComponent[];
currentPosition: number =1;
pageSize: number =5;


//Injecting ProductService object
constructor(private ps:ProductService){

}

ngOnInit(){
this.ps.communicateWithServer(this.currentPosition,this.currentPosition+this.pageSize).subscribe(data => {
    this.products=data;})

}
    prev(){

//for client server connectivity

this.currentPosition -= this.pageSize;
this.ps.communicateWithServer(this.currentPosition,this.currentPosition+this.pageSize).subscribe(data => {
    this.products=data;
})
}

next(){
this.currentPosition += this.pageSize;
//for client server connectivity
this.ps.communicateWithServer(this.currentPosition,this.currentPosition+this.pageSize).subscribe(data => {
    this.products=data;
})
}

}

