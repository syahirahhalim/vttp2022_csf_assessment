// Implement the methods in PizzaService for Task 3
// Add appropriate parameter and return type 
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { OrderDB, Order } from "./models";

const baseUrl = 'http://localhost:8080/api/orders'

@Injectable()
export class PizzaService {

  constructor(private http: HttpClient) { }

  // POST /api/orders
  // Add any required parameters or return type
  createOrder(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  // GET /api/orders/<email>/all
  // Add any required parameters or return type
  getOrders(): Observable<OrderDB[]> { 
    return this.http.get<OrderDB[]>(baseUrl);
  }
}