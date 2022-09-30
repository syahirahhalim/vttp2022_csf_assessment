import { Component, OnInit, Output } from '@angular/core';
import { FormControl, FormBuilder, FormGroup, Validators, FormArray } from '@angular/forms';
import { Subject } from 'rxjs';
import { Order } from '../models';
import { PizzaService } from '../pizza.service';

const SIZES: string[] = [
  "Personal - 6 inches",
  "Regular - 9 inches",
  "Large - 12 inches",
  "Extra Large - 15 inches"
]

const PizzaToppings: string[] = [
    'chicken', 'seafood', 'beef', 'vegetables',
    'cheese', 'arugula', 'pineapple'
]

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
[x: string]: any;

@Output()
onNewOrder = new Subject<Order>()   

  pizzaSize = SIZES[0]
  email!: string
  form!:FormGroup
  selectedToppings!: FormArray
 
  constructor(private fb: FormBuilder, private pizzaSvc: PizzaService) {}

  ngOnInit(): void {
    this.form = this['createForm']()
    this.email = this.form.value

  }
  updateSize(size: string) {
    this.pizzaSize = SIZES[parseInt(size)]
 }
 
 
 /* onCheckboxChange(event: any) {
  this.selectedToppings = (this.form.controls['toppings'] as FormArray)
  if (event?.target.checked)
  this.selectedToppings.push(new FormControl(event.target.value));
   } else {
    const index = this.selectedToppings.controls.findIndex(x => x.value === event?.target.value);
    this.selectedToppings.removeAt(index)
  }

  processOrder(){
  const order = this.order.value as Order
  console.info('>>>> order: ', order)
  this.onNewRegistration.next(order)
  this.form = this.createForm()
}

    private createForm() {
    this.selectedToppings = this.fb.array([]);

    return this.fb.group({
      name: this.fb.control('', [ Validators.required, Validators.minLength(10)]),
      email: this.fb.control('', [ Validators.required, Validators.email ]),
      base: this.fb.control('', [ Validators.required ]),
      sauce: this.fb.control('', [ Validators.required ]),
      toppings: this.selectedToppings 
      comments: this.fb.control<string>('', [])
  })
}
}
function processOrder() {
  throw new Error('Function not implemented.');
}
function createForm() {
  throw new Error('Function not implemented.');
} */
}