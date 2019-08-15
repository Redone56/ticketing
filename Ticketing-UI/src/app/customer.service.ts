import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private baseUrl = 'http://localhost:9090/customer';

  constructor(private http: HttpClient) { }

  getCustomer(id: string): Observable<any> {
    return this.http.get(`${this.baseUrl + '/doSearchCustomer'}/${id}`);
  }
}
