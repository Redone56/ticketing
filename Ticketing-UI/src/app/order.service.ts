import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private baseUrl = 'http://localhost:9090/order';

  constructor(private http: HttpClient) { }

  placeOrder(order: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl + '/placeOrder'}`, order);
  }
}
