import { Component, OnInit } from '@angular/core';
import { OrderService } from './order.service';
import { Order } from './order';
import { Customer } from './customer';
import { Ticket } from './ticket';
import { CustomerService } from './customer.service';
import { TicketService } from './ticket.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'ticketing-ui';
  submitted = false;
  order: Order = new Order();
  customer: Customer = new Customer();
  ticket: Ticket = new Ticket();
  customerForm;
  ticketForm;

  constructor(private orderService: OrderService,
              private customeService: CustomerService,
              private ticketService: TicketService,
              private formBuilder: FormBuilder) {
                this.customerForm = this.formBuilder.group({
                  custId: '',
                  name: '',
                  phoneNumber: '',
                  email: ''
                });

                this.ticketForm = this.formBuilder.group({
                  filmName:'',
                  film: '',
                  time: '',
                  buy: ''
                });
              }

  ngOnInit() {
  }

  searchCustomer(){
    this.customeService.getCustomer(this.customerForm.controls.custId.value)
    .subscribe(
      data => {
        console.log(data);
        this.customerForm.setValue({
          custId: data.id,
          name: data.name,
          phoneNumber: data.phoneNumber,
          email: data.email
        });
      },
      error => console.log(error)
    );
  }

  searchTicket(){
    this.ticketService.getTicket(this.ticketForm.controls.filmName.value)
    .subscribe(
      data => {
        console.log(data);
        console.log(new Date(data.startTime));
        this.ticketForm.patchValue({
          filmName: data.film,
          film: data.film,
          time: new Date(data.startTime).getHours() + ' : ' + new Date(data.startTime).getMinutes() + ' - ' + new Date(data.endTime).getHours() + ' : ' + new Date(data.endTime).getMinutes()
        });
      },
      error => console.log(error)
    );
  }

  placeOrder() {
    this.orderService.placeOrder(this.order)
      .subscribe(data => console.log(data), error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.placeOrder();
  }
}
