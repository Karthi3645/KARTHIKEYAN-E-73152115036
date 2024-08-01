import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {



sum:number;
constructor(private cal:CalculatorService)
{
  this.sum=cal.getAddition(10,20);
}
}
