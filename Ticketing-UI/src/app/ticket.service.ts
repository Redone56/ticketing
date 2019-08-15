import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TicketService {
  private baseUrl = 'http://localhost:9090/ticket';

  constructor(private http: HttpClient) { }

  getTicket(film: string): Observable<any> {
    return this.http.get(`${this.baseUrl + '/doSearchTicket'}/${film}`);
  }
}
