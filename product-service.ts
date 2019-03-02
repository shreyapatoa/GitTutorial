import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product'
import { HttpClient } from '@angular/common/http'

@Injectable()

export class ProductService{

    //injecting HttpsClient API
    constructor(private http: HttpClient){


    }

communicateWithServer(from : number ,to : number ): Observable<Product[]>{
    let url="http://localhost:8181/shopping_app_backend/ProductServlet?from= "+from+" &to= "+to;
    return this.http.get<Product[]>(url);

}}
